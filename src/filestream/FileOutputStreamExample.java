package filestream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
    public static void main(String[] args) throws IOException {

        String test = "This is test output text";

        FileOutputStream outputStream = new FileOutputStream("Output.txt");

        for (char ch : test.toCharArray()){
           outputStream.write(ch);
        }


    }
}
