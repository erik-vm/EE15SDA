package tasks;

public class ShapeCalc {
    public static void main(String[] args) {

        Rectangular shape1 = new Rectangular();

        shape1.setWidth(4);
        shape1.setLength(2);

        //shape1.area();
        //shape1.perimeters();

        Triangle shape2 = new Triangle();
        shape2.setSide1(10.5d);
        shape2.setSide2(12.0d);
        shape2.setSide3(13.2d);

        double areaShape2 = shape2.areaTriangle();
        double perimeterShape2 = shape2.perimeterTriangle();
        double heightShape2 = shape2.heightTriangleSide1();
        double alfaOfShape2 = shape2.degreesOfAlfa();
        double betaOfShape2 = shape2.degreesOfBeta();
        double gammaOfShape2 = shape2.degreesOfGamma();
        System.out.println("The perimeter of shape2 is: " + perimeterShape2 + " and area: " + areaShape2);
        System.out.printf("Height of shape2, which have side1 as bottom is: %.2f cm", heightShape2);
        System.out.println();
        System.out.printf("Shape2 alfa: %.2f degrees", alfaOfShape2);
        System.out.println();
        System.out.printf("Shape2 beta: %.2f degrees", betaOfShape2);
        System.out.println();
        System.out.printf("Shape2 gamma: %.2f degrees", gammaOfShape2);
        System.out.println();

        Circle circle1 = new Circle();
        circle1.setRadius(5);
        double circle1Area = circle1.circleArea();
        System.out.printf("\nCircle1 area is: %.2fcm",circle1Area);
        double circlePerimeter = circle1.circlePerimeter();
        System.out.printf("\nCircle1 perimeter is: %.2fcm ", circlePerimeter);
        double circleDiameter = circle1.circleDiameter();
        System.out.printf("\nCircle diameter is: %.2fcm", circleDiameter);


    }
}
