package controller.command;

import model.Plane;
import model.entity.PlaneContainer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class PlanesCommand implements Command{


    public String execute(HttpServletRequest request) throws IOException, ServletException {
        Plane plane = new Plane();
        PlaneContainer planeContainer = PlaneContainer.getInstance();
try {
    plane.setName(request.getParameter("name"));
    plane.setType(request.getParameter("type"));
    plane.setCarriage(Integer.parseInt(request.getParameter("carriage")));
    plane.setFlyRange(Integer.parseInt(request.getParameter("flyRange")));
    plane.setFuelConsumption(Double.parseDouble(request.getParameter("fuelConsumption")));
    plane.setFuelTankMax(Integer.parseInt(request.getParameter("fuelTankMax")));
    plane.setMaxSpeed(Integer.parseInt(request.getParameter("maxSpeed")));
    plane.setWeight(Double.parseDouble(request.getParameter("weight")));
    plane.setMaxCapacity(Integer.parseInt(request.getParameter("maxCapacity")));
}catch (Exception e){
    e.printStackTrace();
    return "Planes.jsp";
}
        planeContainer.savePlane(plane);

        request.setAttribute("planes",planeContainer.getAllPlanes());
        request.setAttribute("totalCarriage",planeContainer.getTotalCarriage());
        request.setAttribute("totalCapacity",planeContainer.getTotalCapacity());
        return "Planes.jsp";


    }



}
