public class BubbleDriver {
    public static void main(String[] args) {
        
         
    }
}
class Bubble{
    Integer [] BubbleSort(Integer [] nums){
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[j] < nums[i]){
                    //swap
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }

        }
        return nums;
    }
}
