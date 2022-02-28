package testing;

public class Factorial {

   public static int getFact(int input){

       if (input <= 0){
           return 0;
       }
       int result = 1;
       for (int i = 1; i<=input; i++){
           result *= i;

       }
       return result;
   }


}
