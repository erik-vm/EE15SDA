package basic1;

public class Casting {
    public static void main(String[] args) {

        int age = 30;

        double preciseAge = age;
        preciseAge += 0.5d;
        System.out.println(preciseAge);

        //casting

        float temp = 24.4f;
        byte newTemp = (byte)temp; //when u come from bigger data type to smaller, u need to use parentheses

        System.out.println(newTemp);
    }
}
