package designPatterns.tasks.singelton;

public class uniqueID {
    private static uniqueID number;
    private String idNumber;

    public uniqueID(String idNumber){
        this.idNumber = idNumber;
    }

    public static uniqueID getInstance(String idNumber){
        if (number == null){
            number = new uniqueID(idNumber);
        }
        return number;
    }

}
