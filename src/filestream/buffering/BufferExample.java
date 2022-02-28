package filestream.buffering;

import java.io.*;
import java.util.Scanner;

public class BufferExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter full path or file you want to read.");
        String filePath = scanner.nextLine();
        //readFile(filePath);
        System.out.println("What you want to enter to the file?");
        String input = scanner.nextLine();
        writeFile(filePath, input);

    }

    private static void readFile(String filePath){
        String strBuffer;
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))){
            while ((strBuffer = bufferedReader.readLine()) != null){
                System.out.println(strBuffer);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void writeFile(String filePath, String strData){
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath, true))){

            bufferedWriter.write(strData);

        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
