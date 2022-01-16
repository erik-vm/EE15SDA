package Basic2;

public class Car {
    //Fields
    private String color;
    int maxSpeed;
    private String brand;

    //Methods

    //Setter method //If u are using private fields, there is need for setter method
    public void setBrand(String brand){
        this.brand = brand;
    }

    public  void setColor(String color){
        this.color = color;
    }
    //getter method
    public String getBrand(){
        return brand;
    }

    //Info method
    public void printInfo(){
        System.out.println("Brand: " + brand + ", " + "Max Speed: " + maxSpeed + ", " + "Color: " + color);
    }

//
//dont add static if dont want it to call without need for it. with static its executed every time.
}
