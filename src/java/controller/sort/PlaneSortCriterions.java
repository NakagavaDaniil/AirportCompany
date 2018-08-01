package controller.sort;



import model.Plane;

import java.util.Comparator;

public enum PlaneSortCriterions implements Comparator<Plane> {

    BY_TYPE {

        public int compare(Plane o1, Plane o2) {
            if(o1 == null || o2 == null) {
                System.err.println("Object <Plane> might been initialized!");
                return -1;
            }
            return o1.getType().compareTo(o2.getType());
        }
    },
    BY_NAME {

        public int compare(Plane o1, Plane o2) {
            if(o1 == null || o2 == null) {
                System.err.println("Object <Plane> might been initialized!");
                return -1;
            }
            return o1.getName().compareTo(o2.getName());
        }
    }, BY_FLIGHT_RANGE {

        public int compare(Plane o1, Plane o2) {
            if(o1 == null || o2 == null) {
                System.err.println("Object <Plane> might been initialized!");
                return -1;
            }
            return o1.getFlyRange() > o2.getFlyRange() ? 1 : -1;
        }
    }, BY_FUEL_COMSUMPTION {

        public int compare(Plane o1, Plane o2) {
            if(o1 == null || o2 == null) {
                System.err.println("Object <Plane> might been initialized!");
                return -1;
            }
            return Integer.valueOf((int)o1.getFuelConsumption()).compareTo((int) o2.getFuelConsumption());
        }
    }, BY_CAPACITY {

        public int compare(Plane o1, Plane o2) {
            if(o1 == null || o2 == null) {
                System.err.println("Object <Plane> might been initialized!");
                return -1;
            }
            return Integer.valueOf(o1.getMaxCapacity()).compareTo(o2.getMaxCapacity());
        }
    }
}
