public class FindUnique {
    public static void main(String[] args) {
        int nums[] = {1,2,2,1,3,4,5,0,4,9,5,6,7,6,7,3,9};
        int a = nums[0];
        for(int i = 1; i < nums.length; i++)
        {
            a ^=  nums[i];
        }
        System.out.println(a);
    }
}