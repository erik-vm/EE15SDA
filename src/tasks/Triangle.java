package tasks;

public class Triangle {

    private double side1;
    private double side2;
    private double side3;

    // Setters
    public void setSide1(double side1) {
        if (side1 < 1){
            System.out.println("Value hast to be larger then 0");
        }
        else{
            this.side1 = side1;
        }
    }
    public void setSide2(double side2) {
        if (side2 < 1){
            System.out.println("Value hast to be larger then 0");
        }
        else {
            this.side2 = side2;
        }
    }
    public void setSide3(double side3) {
        if (side3 < 1){
            System.out.println("Value hast to be larger then 0");
        }
        else {
            this.side3 = side3;
        }
    }

    // Getters
    public double getSide1() {
        return side1;
    }
    public double getSide2() {
        return side2;
    }
    public double getSide3() {
        return side3;
    }

    // Does triangle exist
    private boolean isValid(){
        return (side1+side2>side3) && (side1+side3>side2) && (side3+side2>side1);
    }

    // Area of a triangle
    public double areaTriangle(){
        if (isValid()){
            double p = (side1+side2+side3)/2;
          return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
        }else {
            System.out.println("Triangle is not valid");
            return 0;
        }
    }

    //Perimeter of a triangle
    public double perimeterTriangle(){
        if (isValid()){
            double perimeter = side1+side2+side3;
            return perimeter;
        }else {
            System.out.println("Triangle is not valid");
            return 0;
        }
    }

    //Height of a triangle
    public double heightTriangleSide1(){
        if (isValid()){
            double height = (areaTriangle()*2)/side1;
            return height;

        }else {
            System.out.println("Triangle is not valid");
            return 0;
        }
    }  public double heightTriangleSide2(){
        if (isValid()){
            double height = (areaTriangle()*2)/side2;
            return height;

        }else {
            System.out.println("Triangle is not valid");
            return 0;
        }
    }  public double heightTriangleSide3(){
        if (isValid()){
            double height = (areaTriangle()*2)/side3;
            return height;

        }else {
            System.out.println("Triangle is not valid");
            return 0;
        }
    }

    //Angle degrees of a triangle
    public double degreesOfAlfa(){
        if (isValid()){
            double cosinesAlfa = Math.acos(((side2*side2)+(side3*side3)-(side1*side1))/(2*side2*side3));
            double degreesAlfa = Math.toDegrees(cosinesAlfa);
            return degreesAlfa;

        }else {
            System.out.println("Triangle is not valid");
            return 0;
        }
    }  public double degreesOfBeta(){
        if (isValid()){
            double cosinesBeta = Math.acos(((side1*side1)+(side3*side3)-(side2*side2))/(2*side1*side3));
            double degreesBeta = Math.toDegrees(cosinesBeta);
            return degreesBeta;

        }else {
            System.out.println("Triangle is not valid");
            return 0;
        }
    }  public double degreesOfGamma(){
        if (isValid()){
            double cosinesGamma = Math.acos(((side2*side2)+(side1*side1)-(side3*side3))/(2*side2*side1));
            double degreesGamma = Math.toDegrees(cosinesGamma);
            return degreesGamma;

        }else {
            System.out.println("Triangle is not valid");
            return 0;
        }
    }
}
