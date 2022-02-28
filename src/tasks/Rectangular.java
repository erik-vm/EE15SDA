package tasks;

public class Rectangular {

    private float width; // setting fields to private, requests creating setter methods
    private float length;

    public void area(){
        System.out.println("Area: " + (length*width));
    }

    public void perimeters(){
        System.out.println("Perimeters: " + ((length+width)*2));
    }

    public void setLength(float length) {
        if (length < 1){
            System.out.println("Value has to be larger then 0");
        }else{
            this.length = length;
        }

    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getLength() { // returns value of the field
        return length;
    }

    public float getWidth() {
        return width;
    }
}
