package model;

public class Plane extends AirVehicle {

   private String type = "Unknown";
   private String name = "Unknown";
   private int fuelTankMax = 0;
   private int fuelTank = 0;
   private double weight = 0.0;
   private double fuelConsumption = 0.0;
   private int maxSpeed = 0;
   private int flyRange =0;
   private int carriage = 0;
   private int maxCapacity = 0;
   private boolean isStrat = false;
   private boolean isFlies = false;


// constructors-----------------------------------------------------------------------------------------------


    public Plane(String type, String name, int fuelTankMax, int fuelTank, double weight, double fuelConsumption, int MAX_SPEED, int flyRange, int carriage, int maxCapacity, boolean START, boolean flies) {
        this.type = type;
        this.name = name;
        this.fuelTankMax = fuelTankMax;
        this.fuelTank = fuelTank;
        this.weight = weight;
        this.fuelConsumption = fuelConsumption;
        this.maxSpeed = MAX_SPEED;
        this.flyRange = flyRange;
        this.carriage = carriage;
        this.maxCapacity = maxCapacity;
        this.isStrat = START;
        this.isFlies = flies;
    }

    public Plane() {
    }


    // getters & setters------------------------------------------------------------------------------------------


    public int getFlyRange() {
        return flyRange;
    }

    public void setFlyRange(int flyRange) {
        this.flyRange = flyRange;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFuelTankMax() {
        return fuelTankMax;
    }

    public void setFuelTankMax(int fuelTankMax) {
        this.fuelTankMax = fuelTankMax;
    }

    public int getFuelTank() {
        return fuelTank;
    }

    public void setFuelTank(int fuelTank) {
        this.fuelTank = fuelTank;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getCarriage() {
        return carriage;
    }

    public void setCarriage(int carriage) {
        this.carriage = carriage;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public boolean isStrat() {
        return isStrat;
    }

    public void setStrat(boolean strat) {
        this.isStrat = strat;
    }

    public boolean isFlies() {
        return isFlies;
    }

    public void setFlies(boolean flies) {
        this.isFlies = flies;
    }


//----------------------------------------------------------------------------------------------------------------

    public void start() {
        this.isStrat = true;
    }

    public void fly(double time) {
        if (time <= this.getFlyRange())
            if (isStrat && this.getFuelTank() > 5000)

                if (this.getMaxSpeed() >= 600) {
                    this.setFlies(isFlies = true);
                    this.setFuelTank(this.getFuelTank() - (int) ((int) this.getFuelConsumption() * time));

                    System.out.println("Plane " + this.getName() + " is flying. Speed: " + this.getMaxSpeed() + "kms/h");
                } else
                    System.out.println("Speed of this airliner can't exceed " + this.getMaxSpeed() + " or be below 600 kms/h");
            else
                System.out.println("Plane " + this.getName() + " can not takeoff. Please check the engines and fuel level.");
        else
            System.out.println("This plane can't fly more than: " + this.getFlyRange() + " hours without REFUELING");
    }

    public void land() {
        if (isFlies) {
            isFlies = false;
            isStrat = false;
            System.out.println("Plane " + this.getName() + " is landing. Engines OFF ");
        } else System.out.println("Plane " + this.getName() + " is not flying.");
    }

    public void fill(int litters) {
        int canFillIn = this.getFuelTankMax() - this.getFuelTank();
        if (isFlies)
            System.out.println("Plane " + this.getName() + "is flying, please land the airliner");
        if ((this.getFuelTank() + litters) > this.getFuelTankMax()) {
            System.out.println("You can not fill more than " + canFillIn + " litters. Filled full tank.");
            this.setFuelTank(this.getFuelTankMax());
        } else {
            this.setFuelTank(this.getFuelTank() + litters);
            System.out.println(litters + " litters of fuel were filled.");
        }
    }

//----------------------------------------------------------------------------------------------------------------

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Plane ");
        sb.append(getName());
        return sb.toString();
    }
}
