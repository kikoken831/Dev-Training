package Java;

public class test {
    public static void main(String[] args) {
        int a[][] = new int[3][];
        //2 sch 
        //
        a[0] = new int[4];
        a[1] = new int[3];
        a[2] = new int[5];
        int count = 0;
        for (int i = 0; i < a.length; i++) {// populate
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = count++;

            }
        }
        for (int i = 0; i < a.length; i++) {// print
            for (int j = 0; j < a[i].length; j++) {

                System.out.println("The ID of student from class: " + i + " is class index: " + j + " is " + a[i][j]);

            }
        }
    }
}
