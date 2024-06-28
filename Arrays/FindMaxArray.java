class FindMaxArray
{
    public static void largest(int[] a)
    {
        int max = a[0];

        for(int i = 0; i<=a.length-1;i++)
        {
    
            if(a[i] > max)
            {
                max = a[i];
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args)
    {
        int a1[]={10,5,7,90,150,2};
        largest(a1);

        int a2[]={150,250,700,9,10};
        largest(a2);
    }
}