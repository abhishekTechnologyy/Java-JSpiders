class Demo2
{
    static int y = 200;
    static void test()
    {
        System.out.println("Running test() method");
    }
}

class Demo3
{
    static void display()
    {
        System.out.println("Running display() method");
        System.out.println("Y value is "+ Demo2.y);
        Demo2.test();
    }
}

class MainClass
{
    public static void main(String[] args)
    {
        System.out.println("Main method started");
        Demo3.display();
        System.out.println("Main method ended");
    }
}