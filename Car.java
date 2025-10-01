public class Car extends Vehicle {
    public int numberOfDoors;

    public Car() {
        super();
        //super.setMake("Toyota");
        //super.setMilesPerGallon(50);
        numberOfDoors = 4;
    }

    public Car(String m, int mpg, int doors) {
        super(m, mpg);
        numberOfDoors = doors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void print() {
        super.print();
        System.out.println("Doors: " + numberOfDoors);
    }
}
