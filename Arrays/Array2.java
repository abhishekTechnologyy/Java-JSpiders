class Array2
{
    public static void printArray(int a[])
    {
        for(int i =0; i<=a.length-1;i++)
        {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args)
    {
        int a1[]={1,2,3,4};
        int a2[]={2,4,6,8};
        printArray(a1);
        printArray(a2);
    }
}