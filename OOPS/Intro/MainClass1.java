class Demo1
{
    static int x = 100;
    static void test()
    {
        System.out.println("Running test() method");
    }
}

class MainClass1
{
    public static void main(String[] args)
    {
        System.out.println("Main method started");
        System.out.println("x value is "+Demo1.x);
        Demo1.test();
        System.out.println("Main method ended");

    }
}