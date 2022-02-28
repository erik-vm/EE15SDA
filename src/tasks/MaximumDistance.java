package tasks;

import java.util.Scanner;

class Vehicle{
    protected float fuelCapacity;
    protected float fuelUsage;
    protected int passengers;

    Vehicle(float fuelCapacity, float fuelUsage, int passengers){
        this.fuelCapacity = fuelCapacity;
        this.fuelUsage = fuelUsage;
        this.passengers = passengers;
    }
    public void maxDistance(){
        float maxTravel;
        float addedFuelPerPassenger = 1.05f;
        if (passengers == 0){
            maxTravel = fuelCapacity/(fuelUsage)*100;
            System.out.printf("The vehicle will travel: %.2f km", maxTravel);
        }
        else if (passengers >= 1){
            for (int i = 2; i <= passengers; i++){
                addedFuelPerPassenger += 0.05;
            }
            maxTravel = fuelCapacity/(fuelUsage*addedFuelPerPassenger)*100;
            System.out.printf("The vehicle will travel: %.2f km", maxTravel);
        }
    }
    /*---------done by Karlis-----------

    float maxDistance(){
    return (fuelCapacity/fuelUsage*(1+passengers *0.05f))*100
         */
}
class Car extends Vehicle{

    private boolean airConditioner;

    Car(float fuelCapacity, float fuelUsage, int passengers, boolean airConditioner) {
        super(fuelCapacity, fuelUsage, passengers);
        this.airConditioner = airConditioner;
    }
    @Override
    public void maxDistance(){
        if (airConditioner){
            float maxTravel;
            float addedFuelPerPassenger = 1.05f;
            if (passengers == 0){
                maxTravel = fuelCapacity/(fuelUsage*1.1f)*100;
                System.out.printf("The vehicle will travel: %.2f km", maxTravel);
            }
            else if (passengers >= 1){
                for (int i = 2; i <= passengers; i++){
                    addedFuelPerPassenger += 0.05;
                }
                maxTravel = fuelCapacity/(fuelUsage*addedFuelPerPassenger*1.1f)*100;
                System.out.printf("The vehicle will travel: %.2f km", maxTravel);
            }
        }else {
            float maxTravel;
            float addedFuelPerPassenger = 1.05f;
            if (passengers == 0){
                maxTravel = fuelCapacity/(fuelUsage)*100;
                System.out.printf("The vehicle will travel: %.2f km", maxTravel);
            }
            else if (passengers >= 1){
                for (int i = 2; i <= passengers; i++){
                    addedFuelPerPassenger += 0.05;
                }
                maxTravel = fuelCapacity/(fuelUsage*addedFuelPerPassenger)*100;
                System.out.printf("The vehicle will travel: %.2f km", maxTravel);
            }
        }
    }

    /*---------done by Karlis-----------

    public float maxDistance(){
            float airConditionerAdd;
            if(airConditioner)){
            airConditionerAdd = 1.1;
            }else{
            airConditionerAdd = 1;
            }
       float usage = fuelUsage * (1+passengers+0.05);
       return fuel / (usage * airConditionerAdd) * 100;

    }
    */
}


public class MaximumDistance {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

/*        System.out.print("Enter the capacity of the tank: ");
        float tanksSize = scanner.nextFloat();
        System.out.print("Enter fuel usage per 100: ");
        float fuelUsage = scanner.nextFloat();
        System.out.print("Enter number of passengers: ");
        int passengers = scanner.nextInt();

        Vehicle vehicle1 = new Vehicle(tanksSize, fuelUsage, passengers);
        vehicle1.maxDistance();
        */
        System.out.print("Enter the capacity of the tank: ");
        float tanksSizeCar = scanner.nextFloat();
        System.out.print("Enter fuel usage per 100: ");
        float fuelUsageCar = scanner.nextFloat();
        System.out.print("Enter number of passengers: ");
        int passengerCar = scanner.nextInt();
        System.out.print("Does it have air conditioner? ");
        boolean airConditioner = scanner.nextBoolean();

        Car car = new Car(tanksSizeCar, fuelUsageCar,passengerCar, airConditioner);
        car.maxDistance();


/*---------Karlis solution to AC condition-----------

        System.out.println("Will you turn on AC?");
        char input = scanner.next().charAt(0);
        boolean AC = false;
        if (input == 'y'){
            AC = true;
        }else if (input == 'n'){
            AC = false;
        }else {
            System.out.println("Invalid answer");
        }*/
    }
}
