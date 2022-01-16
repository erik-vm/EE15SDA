package Basic2;

public class Loop {
    public static void main(String[] args) {


 /*      for(int i = 0; i < 5; i++){


            System.out.println(i);
        }

       Scanner scanner= new Scanner(System.in);

        System.out.println("Enter the number");
        int number = scanner.nextInt();

        for (int i = 1 ; i <= number; i++ ){
            System.out.print(i +" ");
        }
        System.out.println();
        System.out.println("Enter the number");
        int number2 = scanner.nextInt();

        for (int i = number2 ; i >= 0; i-- ){
            System.out.print(i +" ");
        }

        *//*While loop*//*

        int i = 0;
        while (i < 10) {
            System.out.println("Hello World!");
            i++;
        }
        char input = 'y';
        while(input == 'y'){
            System.out.println("Hello Mir!");
            System.out.println("Do u want to run again? (y/n)");

            input=scanner.next().charAt(0);
        }*/

        /*Do while loop*/

        int a = 10;

        do{
            System.out.println("Hello World");
        a++;
        }while (a<15);


    }
}

