package tasks.advancedquiz;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class FileExample {
    public static void main(String[] args) throws IOException {

        //Custom error messages
        /*try{
            if (10>1){
                System.exit(-2);
            }
        }catch (Exception e){
            System.out.println(e);
        }*/

        //Read all lines and store in List
        List<String> lines = Files.readAllLines(Paths.get("Quiz\\data1.txt"));
        System.out.println(lines.toString());
        System.out.println(lines.get(0));
        System.out.println(lines.size());
    }
}
