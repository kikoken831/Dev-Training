public class launchWarrior {
    public static void main(String[] args) {
        Warrior w1 = new Warrior();
        Warrior w2 = new Warrior();

        w1.setName("VIK");
        w2.setName("NIC");

        w1.start();
        w2.start();
    }
}

class Warrior extends Thread {
    String r1 = "knife";
    String r2 = "bomb";
    String r3 = "gun";

    public void run() {
        if (Thread.currentThread().getName().equals("VIK")) {
            vikAcResource();
        } else {
            nicAcResource();
        }
    }

    void vikAcResource() {
        try {
            synchronized (r1) {
                System.out.println("Vik has acquired " + r1);
                Thread.sleep(3000);
            }
            synchronized (r2) {
                System.out.println("Vik has acquired " + r2);
                Thread.sleep(3000);
            }
            synchronized (r3) {
                System.out.println("Vik has acquired " + r3);
                Thread.sleep(3000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void nicAcResource() {
        try {
            synchronized (r1) {
                System.out.println("nic has acquired " + r1);
                Thread.sleep(3000);

                synchronized (r2) {
                    System.out.println("nic has acquired " + r2);
                    Thread.sleep(3000);

                    synchronized (r3) {
                        System.out.println("nic has acquired " + r3);
                        Thread.sleep(3000);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
