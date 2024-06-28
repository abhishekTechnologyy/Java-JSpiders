class Add
{
   
    public static void add(int a , int b) //called method
    {
        int sum = a + b;
        System.out.println(sum);
    }
   
    public static void main(String[] args)
    {

        System.out.println("main Starts"); //calling method
        //method call
        add(1,2);
        add(10,12);
        add(90,130);
    }
}