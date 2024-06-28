class Demo1
{
    int x = 10;
    void test()
    {
        System.out.println("running test() method");
    }
}
class MainClass1
{
    public static void main(String[] args) {
        System.out.println("Main method Started");
        //declare reference variable
        Demo1 d1;
        //initialize reference variable
        d1 = new Demo1();

        System.out.println("x value is :"+d1.x);
        d1.test();
        System.out.println("Modifying x value");
        d1.x = 20;
        System.out.println("x value after modification :" +d1.x);
        System.out.println("creating new object");
        Demo1 d2;
        d2 = new Demo1();
        System.out.println("x value in new object :" + d2.x);
        System.out.println("main method ended");
    }
}