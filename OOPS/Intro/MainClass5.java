class Demo6
{
    int x = 100;
    void test()
    {
        System.out.println("Running test() method");
    }
}

class MainClass5
{
    public static void main(String[] args) 
    {
        System.out.println("Main method startded");
        System.out.println("X value is : " +new Demo6().x);
        System.out.println("Modifying x value");
        new Demo6().x = 200;
        System.out.println("X value is : " +new Demo6().x);
        System.out.println("Main method Ended");
    }
}
