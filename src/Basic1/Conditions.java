package Basic1;

public class Conditions {
    public static void main(String[] args) {

        boolean birthday = false;

        if(birthday){
            System.out.println("Happy birthday!");
        }
        else {
            System.out.println("There is no birthday today");
        }

        float temp = 34.6f;

        if(temp > 37f || temp < 35f){
            System.out.println("You are sick");
        }
        else{
            System.out.println("You are healthy");
        }


    }
}

