import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsDriver{
    public static void main(String[] args) {
        try{
            Scanner s = new Scanner(System.in);
            int a;
            int b;
            a = s.nextInt();
            b = s.nextInt();
            int c = a/b;
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            int arr [] = new int [s.nextInt()];
            int pos = s.nextInt();
            int value = s.nextInt();
            arr[pos] = value;
            System.out.println(arr[pos]);

        }
        catch(ArithmeticException e)
        {
            System.out.println("Enter a proper denominator");
        }
        catch(NegativeArraySizeException e){
            System.out.println("be positive");
        }
        catch(InputMismatchException e)
        {
            System.out.println("Please enter an int");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Be within bounds");
        }
        catch(Exception e)
        {
            System.out.println("sth happened");
        }
        System.out.println("GoodBye");
    }
}