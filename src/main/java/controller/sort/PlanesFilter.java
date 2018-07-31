package controller.sort;




import model.Plane;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ������������ on 28.08.2015.
 */
public abstract class PlanesFilter {

    public static List<Plane> filterSpeed(List planes, int limitFrom, int limitBefore) {
        List<Plane> temp = new ArrayList();
        List<Plane> result = new ArrayList();
        temp.addAll(planes);
        for (Plane plane : temp) {
            if(plane.getMaxSpeed() > limitFrom && plane.getMaxSpeed() < limitBefore)
            result.add(plane);
        }
        return result;
    }

    public static List<Plane> filterByName(List planes, String toFind) {
        List<Plane> temp = new ArrayList();
        List<Plane> result = new ArrayList();
        temp.addAll(planes);
        for (Plane plane : temp) {
            if (plane.getName().contains(toFind))
                result.add(plane);
        }
        return result;
    }

    public static List<Plane> filterFuelConsumption(List planes, double limitFrom, double limitBefore) {
        List<Plane> temp = new ArrayList();
        List<Plane> result = new ArrayList();
        temp.addAll(planes);
        for (Plane plane : temp) {
            if (plane.getFuelConsumption() >= limitFrom && plane.getFuelConsumption() <= limitBefore)
                result.add(plane);
        }
        return result;
    }
}
