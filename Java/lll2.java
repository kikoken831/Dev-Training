import java.util.Scanner;

public class lll2 {
    public static void main(String[] args) {
        Bank b = new Bank();
        Add a = new Add();
        Print p = new Print();

        Thread t1 = new Thread(b);
        Thread t2 = new Thread(p);
        Thread t3 = new Thread(a);
        try {

            t2.start();
            t1.start();
            t3.start();
            t3.join();
            t1.join();
            t2.join();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Bank implements Runnable {
    public void run() {
        try {
            System.out.println("Banking started");

            Scanner s = new Scanner(System.in);
            System.out.println("enter ur acc no");
            int an = s.nextInt();
            System.out.println("enter ur pw");
            int pw = s.nextInt();

            System.out.println("Collect your money");
            System.out.println("Banking completed");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

class Add implements Runnable {
    public void run() {
        try {
            System.out.println("Addition Started");

            int fn = 10;
            int sn = 20;
            int res = fn + sn;
            System.out.println(res);
            System.out.println("Addition Ended");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

class Print implements Runnable {
    public void run() {
        try {
            System.out.println("Printing Started");
            try {
                for (int i = 0; i < 5; i++) {
                    Thread.sleep(3000);
                    System.out.println("Printing in progress");
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("Printing completed");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}