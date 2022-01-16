package Basic1;
public class Operators {
    public static void main(String[] args) {


        int numA = 15;
        int numbB = 72;

        System.out.println(numA + numbB);
        System.out.println(numA/numA);

        numA += 2;
        System.out.println(numA);
        numbB /= 4;
        System.out.println(numbB);
        numA %= 4;
        System.out.println(numA);
        System.out.println(++numA); //if u use ++ before declaration, it adds one. vice versa it does not work in println()
        numbB++;
        ++numbB;
        System.out.println(numbB);

        boolean value1 = true;
        boolean value2 = false;

        System.out.println(value1 && value2); //both values needs to be true, to print true

        System.out.println(value1 || value2); //one of the values needs to be true, to print true

        System.out.println(! value1 || value2); // ! will switch the answer;
        System.out.println(value2); // is value2 true?
        System.out.println(!value2); // is value2 false?

    }
}
