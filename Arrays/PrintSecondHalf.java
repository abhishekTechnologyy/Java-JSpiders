class PrintSecondHalf
{
    public static void secondHalf(int a[])
    {
        int middle = (a.length-1)/2;
        
        for(int i = middle; i<= a.length-1;i++)
        {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args)
    {
        int arr1[] = {1,2,3,4,5,6,7,8,9};
        secondHalf(arr1);
    }
}