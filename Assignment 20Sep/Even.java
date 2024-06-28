class Even
{
    public static void even(int i,int n)
    {
        if(i<=n)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
            i++;
            even(i,n);
        }
    }

    public static void main(String[] args)
    {
        even(1,10);
    }
}