//Driver Class
public class Test {
    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        car.print();

        Vehicle truck = new Vehicle("Hino", 50);
        truck.print();

        Vehicle bus = new Vehicle();
        bus.setMake("Mercedes Benz");
        bus.setMilesPerGallon(30);
        bus.print();
    }
}
