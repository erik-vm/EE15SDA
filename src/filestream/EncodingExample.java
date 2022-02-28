package filestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EncodingExample {
    public static void main(String[] args) throws IOException {

        FileInputStream in = new FileInputStream("Input.txt");
        FileOutputStream out = new FileOutputStream("Encoded.txt");

        int c;
        while ((c = in.read()) != -1){
            out.write(c-12);
        }
    }
}
