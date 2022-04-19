import java.util.Scanner;

class Atm{
    int an;
    int pw;
    void collectInput(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the account number: ");
        an = s.nextInt();
        System.out.println("Enter the password: ");
        pw = s.nextInt();
    }
    void verify(int accNum,int passWord)
    {
        if(accNum == an && passWord == pw)
        {
            System.out.println("Collect your money");
        }
        else{
            System.out.println("Wrong credentials");
        }
    }
}
class Bank{
    int accNum = 1111;
    int passWord = 2222;

    void initiate()
    {
        Atm atm = new Atm();
        atm.collectInput();
    }

}
public class LaunchAtm {
    public static void main(String[] args) {
        
    }
}
