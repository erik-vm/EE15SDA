public class Main {

    public static void main(String[] args) {


        //Variable types

        byte number1 = 127;   //Min value -128, max 127
        short number2 = 32767; //Min value -32768. max 32767
        double number3 = 2.44d; //Maximum 6-7 decimal places
        float number4 = 19.9948634f; //Maximum 15 decimal places
        int number5 = 2147483647; //Min value -2147483648, Max 2147483647
        long number6 = 254555455672L;

        char singleCharacter = 'A';
        String multipleCharacters = "Word";

        boolean trueOrFalse = true;

        final int unchangeableValue = 1; //this value can not be changed

        System.out.println("This is one really long number: " + number6 + "." + " And I cannot change this value: " + unchangeableValue);

    }
}
