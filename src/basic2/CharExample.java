package basic2;

public class CharExample {
    public static void main(String[] args) {

        char ch = 'M';
        System.out.println(ch);

        //Casting   ( ASCII table )

        System.out.println((int) ch);
        ch++;
        System.out.println((int) ch);
        System.out.println(ch);
        System.out.println((char) 100);

        for (int i = 97; i <= 122; i++) {
            System.out.print((char) i + " ");
        }
    }
}