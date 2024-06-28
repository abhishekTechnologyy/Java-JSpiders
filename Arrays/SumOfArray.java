class SumOfArray
{
    public static void sumArray(int arr[])
    {
        int sum = 0;
        for(int i = 0; i<= arr.length-1; i++)
        {
             sum += arr[i];
        }
        System.out.println(sum);
    }

    public static void main(String[] args)
    {
        int a1[]={1,2,3,4,5};
        sumArray(a1);
    }
}