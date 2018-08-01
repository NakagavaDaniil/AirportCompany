package model;

abstract class AirVehicle {

    protected boolean flies = false;


    public void fly(double time) {
        if (flies)
            System.out.println("AirVehicle already flies");
        flies = true;
    }

    public void land() {
        if (flies)
            flies = false;
        else
            System.out.println("AirVehicle doesn't fly");
    }
}
