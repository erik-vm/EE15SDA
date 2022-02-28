package tasks;

public class Circle {

    private double diameter;
    private double radius;
    private double area;
    private double perimeter;

    //Setters and getters
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }
    public double getDiameter() {
        return diameter;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return area;
    }
    public double getPerimeter() {
        return perimeter;
    }
    //Circle area

    public double circleArea(){
        this.area = Math.PI*radius * radius;
        return this.area;
    }
    public double circleRadius(){
        this.radius = diameter/2;
        return this.radius;
    }
    public double circlePerimeter(){
       this.perimeter = 2*Math.PI*radius;
        return this.perimeter;
    }
    public double circleDiameter(){
        this.diameter = 2*radius;
        return this.diameter;
    }

}
