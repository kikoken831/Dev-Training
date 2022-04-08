package Java;
import java.util.*;

public class launchLoan {
    public static void main(String[] args) {
        Farmer f1 = new Farmer();

        f1.input();
        f1.disp();

    }
}

class Farmer {
    float p;
    float t;
    static float r = 2.5f;
    float si;

    void input() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the principle:");
        p = inp.nextFloat();
        System.out.println("Enter the duration");
        t = inp.nextFloat();
        si = (p * t * r) / 100;
        inp.close();
    }

    void disp() {
        System.out.println(si);
    }
}