class FindElementIndex
{
    public static void findElement(int[] a, int element)
    {
        for(int i = 0; i<= a.length-1; i++)
        {
            if(a[i] == element)
            {
                System.out.println("element found at index : " +i);
            }
        }
        System.out.println("Not Found");
    }

    public static void main(String[] args)
    {
        int [] a1 = {10,15,55,7,70,90};
        int element1 = 15;
        findElement(a1,element1);
    }
}