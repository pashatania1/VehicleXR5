//Object Class
public class Vehicle {
    //Atribut/Property/Variabel
    private String make;
    private int milesPerGallon;

    //Constructor
    public Vehicle() {
        make = "Honda";
        milesPerGallon = 90;
    }

    //Contructor Parameter
    public Vehicle(String m, int mpg) {
        make = m;
        milesPerGallon = mpg;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getMilesPerGallon() {
        return milesPerGallon;
    }

    public void setMilesPerGallon(int milesPerGallon) {
        this.milesPerGallon = milesPerGallon;
    }

    //Method Print
    public void print() {
        System.out.println("Make: " + make);
        System.out.println("Miles Per Gallon: " + milesPerGallon);
    }
}
