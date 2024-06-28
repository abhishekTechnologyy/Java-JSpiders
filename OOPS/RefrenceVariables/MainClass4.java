class Demo4 
{
    static int x = 100;
    int y = 200;

    static void test()
    {
        System.out.println("Running test() method");
    }

    void disp()
    {
        System.out.println("Running disp() method");
    }
}

class MainClass4
{
    public static void main(String[] args) {
        System.out.println("main method started");
        System.out.println("x value is :" +Demo4.x);
        Demo4.test();
        Demo4 d1 = new Demo4();
        Demo4 d2 = new Demo4();
        Demo4 d3 = new Demo4();
        System.out.println("main method ended");

    }
}