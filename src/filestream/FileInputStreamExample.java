package filestream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) {


        try{
            FileInputStream inputStream = new FileInputStream("Input.txt");
            int c;
            while ((c = inputStream.read()) != -1){
                System.out.print((char) c);
            }
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
