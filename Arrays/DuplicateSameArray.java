class DuplicateSameArray
{
    public static void findDuplicate(int a[])
    {
        //int duplicate = 0;
        for(int i=0; i<= a.length-1; i++)
        {
            for(int j=i+1; j <= a.length-1; j++)
            {
                if(a[i]==a[j])
                {
                    System.out.println("Duplicate ELements are :" +a[j]);
                }

            }
            
        }

    }

    public static void main(String[] args)
    {
        int [] a1={1,2,2,3,4,5,7,5,0};
        findDuplicate(a1);
    }
}