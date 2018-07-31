package model;

/**
 * Created by Пользователь on 26.08.2015.
 */
public class Airliner extends Plane {


    protected final int TAKE_OFF_SPEED = 300;

    protected int seating;
    protected String departure;
    protected String destination;

    // constructor
    public Airliner() {

    }

    // Getters & Setters

    public int getSeating() {
        return seating;
    }

    public void setSeating(int seating) {
        this.seating = seating;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }


    // toString
    @Override
    public void fly(double time) {
        if (time <= this.getFlyRange()) {
            if (this.getFuelTank() > 5000) {
                if (isStrat()) {
                    this.setFlies(flies = true);
                    this.setFuelTank(this.getFuelTank() - (int) ((int) this.getFuelConsumption() * time));
                    System.out.println("Plane " + this.getName() + " is flying from " + getDeparture() + " to "
                            + getDestination() + ". Speed: " + this.getMaxSpeed() + "kms/h");
                } else
                    System.out.println("Plane " + this.getName() + " can not takeoff. Please check the engines.");
            } else
                System.out.println("This plane can't fly more than: " + this.getFlyRange() + " hours without REFUELING");
        } else
            System.out.println("This plane can't fly more than: " + this.getFlyRange());
    }

    @Override
    public void land() {
        super.land();
    }

    @Override
    public void fill(int litters) {
        super.fill(litters);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Airliner ");
        sb.append(getType()).append(" ");
        sb.append(getName()).append(" \n");
        sb.append("Flight range: ").append(getFlyRange()).append(" hours, ");
        sb.append(getFuelTank()).append(" litters of fuel left. ");
        sb.append("Fuel consumption: ").append(getFuelConsumption());
        sb.append(", speed: ").append(getMaxSpeed());
        sb.append(", carries: ");
        sb.append(getSeating()).append(" passengers.");
        return sb.toString();
    }
}

