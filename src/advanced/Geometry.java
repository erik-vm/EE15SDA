package advanced;

class Rectangular{
    protected float length;
    protected float width;

    Rectangular(float length, float width){
        this.length = length;
        this.width = width;
    }
    public void area(){
        System.out.println("Area of the object is: " + (length*width));
    }
    
    public void perimeter(){
        System.out.println("Perimeter of the object is: " + (2*(length+width)));
    }
}

class Square extends Rectangular{
private float side;

    Square(float side) {
        super(side,side);
        this.side = side;
    }
    public float getSide() {
        return side;
    }
}
public class Geometry {
    public static void main(String[] args) {
        Rectangular rectangular = new Rectangular(5,8);
        rectangular.area();
        rectangular.perimeter();

        Square square = new Square(5);
        square.area();
        square.perimeter();
        System.out.println("Side: "  + square.getSide());

        Square square1 = new Square(43.13f);
        square1.perimeter();
    }
}
