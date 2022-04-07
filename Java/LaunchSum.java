class Addition{
    void add(int[] arr)
    {
        int sum = 0;
        for(int i = 0; i<=arr.length;i++)
        {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}

public class LaunchSum{
    public static void main(String[] args) {
        Addition a = new Addition();
        int [] arr =  {1,2,3,4,5};
        a.add(arr);
    }
}