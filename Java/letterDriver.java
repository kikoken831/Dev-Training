import java.util.*;
import java.util.HashMap;

public class letterDriver {

    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            for (Character c : "The quick brown fox".toCharArray()) {
                c = Character.toUpperCase(c);
                String temp = c.toString();
                String value = letterMap.m.get(temp);
                if (value != null) {
                    System.out.print(value.substring(i * 7, i * 7 + 7));
                }
            }
            System.out.println();
        }
        for (int i = 0; i < 7; i++) {
            for (Character c : "jumps over the lazy".toCharArray()) {
                c = Character.toUpperCase(c);
                String temp = c.toString();
                String value = letterMap.m.get(temp);
                if (value != null) {
                    System.out.print(value.substring(i * 7, i * 7 + 7));
                }
            }
            System.out.println();
        }
        for (int i = 0; i < 7; i++) {
            for (Character c : "dog".toCharArray()) {
                c = Character.toUpperCase(c);
                String temp = c.toString();
                String value = letterMap.m.get(temp);
                if (value != null) {
                    System.out.print(value.substring(i * 7, i * 7 + 7));
                }
            }
            System.out.println();
        }
        System.out.println("Please input your name: ");
        Scanner f = new Scanner(System.in);
        String input = f.nextLine();
        for (int i = 0; i < 7; i++) {
            for (Character c : input.toCharArray()) {
                c = Character.toUpperCase(c);
                String temp = c.toString();
                String value = letterMap.m.get(temp);
                if (value != null) {
                    System.out.print(value.substring(i * 7, i * 7 + 7));
                }
            }
            System.out.println();
        }

        f.close();

    }
}

class letterMap {
    public static Map<String, String> m = new HashMap<String, String>() {
        {
            put("A", "  *     * *   *   *  *****  *   *  *   *  *   *  ");
            put("B", "****   *   *  *   *  ****   *   *  *   *  ****   ");
            put("C", " ***   *   *  *      *      *      *   *   ***   ");
            put("D", "****   *   *  *   *  *   *  *   *  *   *  ****   ");
            put("E", "*****  *      *      ***    *      *      *****  ");
            put("F", "*****  *      *      ***    *      *      *      ");
            put("G", " ***   *   *  *      * ***  *   *  *   *   ***   ");
            put("H", "*   *  *   *  *   *  *****  *   *  *   *  *   *  ");
            put("I", "*****    *      *      *      *      *    *****  ");
            put("J", "*****    *      *      *    * *    * *     **    ");
            put("K", "*   *  *  *   * *    **     * *    *  *   *   *  ");
            put("L", "*      *      *      *      *      *      *****  ");
            put("M", "*   *  ** **  ** **  * * *  *   *  *   *  *   *  ");
            put("N", "*   *  **  *  * * *  *  **  *   *  *   *  *   *  ");
            put("O", " ***   *   *  *   *  *   *  *   *  *   *   ***   ");
            put("P", "****   *   *  *   *  ****   *      *      *      ");
            put("Q", " ***   *   *  *   *  *   *  *   *  *  *    ** *  ");
            put("R", "****   *   *  *   *  ****   * *    *  *   *   *  ");
            put("S", " ***   *   *  *       ***       *  *   *   ***   ");
            put("T", "*****    *      *      *      *      *      *    ");
            put("U", "*   *  *   *  *   *  *   *  *   *  *   *   ***   ");
            put("V", "*   *  *   *  *   *  *   *  *   *   * *     *    ");
            put("W", "*   *  *   *  *   *  * * *  ** **  ** **  *   *  ");
            put("X", "*   *  *   *   * *     *     * *   *   *  *   *  ");
            put("Y", "*   *   * *     *      *      *      *      *    ");
            put("Z", "*****      *     *     *     *     *      *****  ");
            put(" ", "                                                 ");
        }
    };
}
