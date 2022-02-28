package basic2;

public class TwoDimensionalArray {
    public static void main(String[] args) {

        String[][] myArray = new String[2][5];

        myArray[0][0] = "Audi";
        myArray[0][1] = "BMW";
        myArray[0][2] = "Opel";
        myArray[0][3] = "Volvo";
        myArray[0][4] = "Lamborghini";

        myArray[1][0] = "Lada";
        myArray[1][1] = "Ferrari";
        myArray[1][2] = "Subaru";
        myArray[1][3] = "Saab";
        myArray[1][4] = "McLaren";

        System.out.println(myArray[1][2]);

        System.out.println(myArray.length); // length of the row
        System.out.println(myArray[0].length); // length of columns

        for (int i = 0; i<myArray.length; i++){
            //Inner for loop for columns
            for (int j=0 ; j < myArray[i].length; j++){
                System.out.println(myArray[i][j]);
            }

        }

    }

}
