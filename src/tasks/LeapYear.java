package tasks;


public class LeapYear {
    public static void main(String[] args) {

      determineLeapYear(2004);
      determineLeapYear(2022);
      determineLeapYear(1988);
      determineLeapYear(1831);

        System.out.println();
       String textAnswer =  determineLeapYear2(12312);
        System.out.println(textAnswer);


    }

    public static void determineLeapYear(int year){
        if (((year % 4 ==0) && (year % 100 != 0)) || (year % 400 == 0)){
            System.out.println(year + " is a leap year");
        } else{
            System.out.println(year + " is not a leap year");
        }
    }

    public static String determineLeapYear2(int year){
        if (((year % 4 ==0) && (year % 100 != 0)) || (year % 400 == 0)){
            return (year + " is a leap year");
        } else{
            return  (year + " is not a leap year");
        }
    }



}
