public class Client {
    public static void main(String[] args) {

        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();

        System.out.println("\n********");

        new SportsCar(new LuxuryCar(new BasicCar())).assemble();

    }
}
