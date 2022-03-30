package threads.firstexample;

import java.util.Random;

public class Bread implements Runnable {

    String name;
    int time;
    Random random = new Random();

    public Bread(String name){
        this.name = name;
        time = random.nextInt(3000);
    }


    @Override
    public void run() {
        try {
            System.out.printf("%s is sleeping for %d\n", name, time);
            Thread.sleep(time);
            System.out.printf("%s is done\n", name);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
