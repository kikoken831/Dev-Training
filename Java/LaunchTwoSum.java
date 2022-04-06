package Java;
public class LaunchTwoSum{
    public static void main(String[] args)
    {
        int [] input = {11,7,2,15};
        int target = 26;
        TwoSum ts = new TwoSum();
        int [] output = ts.computeTwoSum(input, target);
        System.out.println(output[0] + " " + output[1]);
    }
}
class TwoSum{
    int[] computeTwoSum(int[] input,int target)
    {
        int output[] = new int[2];
        for(int i = 0; i < input.length; i++)
        {
            for(int j = i+1; j < input.length; j++)
            {
                if(input[i] + input[j] == target)
                {
                    output[0] = i;
                    output[1] = j;
                    return output;
                }
            }
        }
        return output;
    }
}