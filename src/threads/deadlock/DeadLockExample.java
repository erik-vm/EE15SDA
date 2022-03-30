package threads.deadlock;

public class DeadLockExample {
    public static void main(String[] args) throws InterruptedException {

        final String r1 = "r1";
        final String r2 = "r2";

        var t1 = new Thread(){
            @Override
            public void run() {

                synchronized (r1){
                    System.out.println("This is thread #1: Locked String r1");
                    try{
                        Thread.sleep(100);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    synchronized (r2){
                        System.out.println("Thread #1: Locked String #2");
                    }

                }
            }
        };
        var t2 = new Thread(){
            @Override
            public void run() {

                synchronized (r2){
                    System.out.println("This is thread #2: Locked String r2");
                    try{
                        Thread.sleep(100);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    synchronized (r1){
                        System.out.println("Thread #2: Locked String #1");
                    }

                }
            }
        };


        t1.start();
        t2.start();

        t1.join(); //Does not need try\catch block, when InterruptedException is added to the main method
        t2.join();

        System.out.println("End");
    }
}
