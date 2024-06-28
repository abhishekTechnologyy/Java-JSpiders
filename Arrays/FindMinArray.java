class FindMinArray
{
    public static void lowest(int[] a)
    {
        int small = a[0];

        for(int i = 0; i<=a.length-1;i++)
        {
    
            if(a[i] < small)
            {
                small = a[i];
            }
        }
        System.out.println(small);
    }

    public static void main(String[] args)
    {
        int a1[]={10,5,7,90,150,2};
        lowest(a1);

        int a2[]={150,250,700,9,10};
        lowest(a2);
    }
}