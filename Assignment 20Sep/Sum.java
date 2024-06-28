class Sum
{
    static int sum = 0;
    public static int sumValue(int i , int n)
    {
        //int sum = 0;
        if(i <= n)
        {
            sum = sum + i;
            i++;
            sumValue(i,n);
            // System.out.println(sum);
        }
        return sum;
    }
    public static void main(String[] args)
    {
        System.out.println(sumValue(1,10));
        // sum(1,10);
    }
}
