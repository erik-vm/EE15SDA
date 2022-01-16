package Basic2;

public class MathMethods {
    public static void main(String[] args) {

        float x = 4.35f;
        float y = -14.87f;

        //Max value
        System.out.println("This is maximum value: " + Math.max( x,y));

        //Min value
        System.out.println("This is minimum value: " + Math.min(x,y));

        //Rounding up
        System.out.println("This is rounded up value: " + Math.ceil(y));
        System.out.println("This is rounded up value: " + Math.ceil(x));

        //Rounding down
        System.out.println("This is rounded down value: " + Math.floor(x));

        ///Rounding according to math laws
        System.out.println("This is rounded according math laws: " + Math.round(x));

        //Absolute value
        System.out.println("This is absolute value: " + Math.abs(y));

        //Square root of the number
        System.out.println("This is square root of 81: " + Math.sqrt(81));

        //Random value
        System.out.println("This is random value between 0.0 (inclusive), and 1.0 (exclusive): " + Math.random());

        //Random value between 0 - 100
        System.out.println("This is random value between 0 - 100: " + Math.random()*101);

        //Random integer
        System.out.println("This is random integer between 0-50: " + Math.round(Math.random()*51));
        System.out.println("This is random integer between 0-50: " + (int)(Math.random()*51));
    }
}
