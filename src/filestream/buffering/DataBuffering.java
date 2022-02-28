package filestream.buffering;

import java.io.*;

public class DataBuffering {
    public static void main(String[] args) throws IOException {

        //BufferReader reads file line by line

        //Option 1
        //FileReader fileReader = new FileReader("Input.txt");
        //BufferedReader in = new BufferedReader(fileReader);

        //Option 2
        BufferedReader in = new BufferedReader(new FileReader("Input.txt"));

        String line;

        while ((line = in.readLine()) != null){
            System.out.println("Line: " + line);
        }

        //Write

        BufferedWriter out = new BufferedWriter(new FileWriter("BufferWriter.txt"));

        //Write string line ti file
        String data = "This is some text here";
        out.write(data);
        out.close(); // it needs to be added to finish writing

    }
}
