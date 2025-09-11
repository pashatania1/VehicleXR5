//Driver Class
public class Test {
    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        car.print();

        Vehicle truck = new Vehicle("Hino", 50);
        truck.print();
    }
}
