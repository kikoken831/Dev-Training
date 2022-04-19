import java.util.*;
public class test {
    
    public static void main(String[] args){
        San s = new San();
        s.m(20,20);
    }
}
class San{
    public void m(int i, float f)
    {
        System.out.println("1");
    }
    public void m(float f, int i)
    {
        System.out.println("2");
    }
}