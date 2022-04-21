public class launchBathroom2{
    public static void main(String[] args) throws Exception {
        Bathroom2 b = new Bathroom2();
        Thread t1 = new Thread(b);
        Thread t2 = new Thread(b);
        Thread t3 = new Thread(b);

        t1.setName("BOY");
        t2.setName("GIRL");
        t3.setName("DOG");

        
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
    }
}

class Bathroom2 implements Runnable {
     public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " has entered the bathroom");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " is using the bathroom");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " exited the bathroom");
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
