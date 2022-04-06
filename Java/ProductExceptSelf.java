package Java;

import java.util.*;

class Product {
    int[] computeProduct(int[] input) {
        int[] output = new int[input.length];
        int total = 1;
        for (int i = 0; i < input.length; i++) {
            // product except self
            for (int j = 0; j < input.length; j++) {
                    total *= input[j];
            }
            output[i] = total/input[i];
            total = 1;
        }
        return output;
    }
}

public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] input = { 2, 3, 1, 4 };
        Product ps = new Product();
        int output[] = ps.computeProduct(input);
        System.out.println(Arrays.toString(output));
    }
}

//Stack
// Addition obj a
//  int sum -> created from main
//  a.add initialised
//      int sum from a.add = 100 + 200
//      sum = 300
//      return 300.
// sum -> created from main is now assigned to 300

//Heap
//  empty

























