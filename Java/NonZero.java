package Java;

import java.util.*;

public class NonZero {
    public static void main(String[] args) {
        int[] input = { 1, 0, 2, 3, 0, 0, 4, 5, 6, 0, 0, 0, 7 };
        int count = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] != 0) {
                input[count] = input[i];
                count++;
            }
        }
        for (int i = count; i < input.length; i++) {
            input[i] = 0;
        }
        System.out.println(Arrays.toString(input));
    }
}
