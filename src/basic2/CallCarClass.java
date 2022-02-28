package basic2;

public class CallCarClass {
    public static void main(String[] args) {
        //object called car1
        Car car1 = new Car();
        //assign values to object fields
        //car1.brand = "Toyota";
        car1.setBrand("Volvo");
        car1.setColor("Pink");
        car1.maxSpeed = 180;
        // access object values
        System.out.println(car1.getBrand());

        Car car2 = new Car();
        car2.setColor("Yellow");
        //car2.brand = "BMW";
        car2.setBrand("Dacia");
        car2.maxSpeed = 380;

        car1.printInfo();
        car2.printInfo();
    }
}
