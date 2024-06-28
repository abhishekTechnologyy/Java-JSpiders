class Array1
{
    public static void main(String[] args)
    {
        //Declaration and Intialization
        int a1[] = {10,20,30,40};

        //traverse array or retrieve array

        // for(int index = 0; index >= a1.length-1; index++)
        // {
        //     System.out.print(a1[index]+" ");
        // }

        
        // printing in reverse order
        
        for(int index = a1.length-1; index >= 0; index--)
        {
            System.out.print(a1[index]+" ");
        }
    }
}