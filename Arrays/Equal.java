class Equal
{
    public static boolean checkEqual(int a1[], int a2[])
    {
        if(a1[0] == a2[0])
        {
            return true;

        }

    return false;


    }
    public static void main(String[] args)
    {
        int arr1[]={1,2,3,4,5};
        int arr2[]={1,2,4,56,6};
        System.out.println(checkEqual(arr1,arr2));
    }
}