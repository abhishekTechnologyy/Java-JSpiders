class Duplicate
{
    public static void duplicateElement(int a1[], int a2[])
    {
        for(int i =0; i<= a1.length-1;i++)
        {
            for(int j=0; j<= a2.length-1;j++)
            {
                if(a1[i] == a2[j])
                {
                    System.out.println("Duplicate elements are : " +a1[i]);
                }
            }
        
        }
        System.out.println("No Duplicate Element");

    }
    public static void main(String[] args)
    {
        int a[]={10,20,30,100,5,10};
        int b[]={1,2,3,4,5};
        duplicateElement(a,b);
    }
}