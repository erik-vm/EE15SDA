package threads.secondexample;

public class Main {
    public static void main(String[] args) {

        MyRunnable myRunnable = new MyRunnable();
        MyThread myThread = new MyThread();


       Thread t1 = new Thread(myThread);
       Thread t2 = new Thread(myRunnable);

       t1.start();
       t2.start();

       //For run threads before main method runs, threads needs to use join() method.
       try{
           t1.join();
           t2.join();
       }catch (Exception e){
           e.printStackTrace();
       }

        System.out.println("All done!");
    }
}
