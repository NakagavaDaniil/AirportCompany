package model.entity;

import model.Plane;

import java.util.ArrayList;

public class PlaneContainer {
    public static PlaneContainer planeContainer = new PlaneContainer();
    ArrayList<Plane> planes = new ArrayList<>();
    int totalCarriage =0;
    int totalCapacity=0;

    public PlaneContainer() {
    }

    public static PlaneContainer getInstance(){
        if (planeContainer == null) {
            planeContainer = new PlaneContainer();
        }
        return planeContainer;
    }
    public ArrayList<Plane> getAllPlanes() {

        System.out.println(planes.toString());
        return planes;
    }

    public int getTotalCapacity() {
        return totalCapacity;
    }

    public boolean savePlane(Plane plane){
        totalCapacity+=plane.getMaxCapacity();
        totalCarriage +=plane.getCarriage();
        planes.add(plane);
        return true;
    }

    public int getTotalCarriage() {
        return totalCarriage;
    }

    public Plane getPlaneFromListByIndex(int index){
        return planes.get(index);
    }
}
