class Decrease
{
    public static void decrement(int i, int n)
    {
        if(i>=n)
        {
            System.out.println(i);
            i--;
            decrement(i,n);
        }
    }
    public static void main(String[] args)
    {
        decrement(10,1);
    }
}