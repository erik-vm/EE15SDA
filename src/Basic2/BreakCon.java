package Basic2;

public class BreakCon {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World!");
            if (i == 1) { //code will run til the i has value 1
                break;
            }
        }

        for (int i = 0; i < 10; i++) {
            if (i == 8 || i==5) { //it will not display nr5 and 8
                continue;
            }
            System.out.println(i);
        }
    }
}
