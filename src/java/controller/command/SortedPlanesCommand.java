package controller.command;

import controller.sort.PlaneGeneralSort;
import controller.sort.PlaneSortCriterions;
import controller.sort.PlaneSorter;
import controller.sort.PlanesFilter;
import model.entity.PlaneContainer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class SortedPlanesCommand implements Command {
    @Override
    public String execute(HttpServletRequest request) throws IOException, ServletException {

       request.removeAttribute("planes");
        PlaneContainer planeContainer = PlaneContainer.getInstance();
        PlaneSorter planeSorter = new PlaneSorter();
        planeSorter.planesSort(planeContainer.getAllPlanes(), new PlaneGeneralSort(PlaneSortCriterions.BY_FLIGHT_RANGE));
        request.setAttribute("planes",planeContainer.getAllPlanes());
        request.setAttribute("totalCarriage",planeContainer.getTotalCarriage());
        request.setAttribute("totalCapacity",planeContainer.getTotalCapacity());
        return "Planes.jsp";
    }
}
