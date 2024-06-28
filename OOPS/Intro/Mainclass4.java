// Accessing non static method and non static variable

class Demo5
{
    int x = 10;
    void test()
    {
        System.out.println("Running test() method");
    }
}

class MainClass4
{
    public static void main(String[] args) 
    {
        System.out.println("Main method startded");
        System.out.println("X value is : " +new Demo5().x);
        new Demo5().test();
        System.out.println("Main method Ended");
    }
}
