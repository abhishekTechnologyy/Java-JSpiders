class Demo3
 {
    int x = 10;
    void test()
    {
        System.out.println("Running test Method");
    }   
}

class MainClass3
{
    public static void main(String[] args) {
        Demo3 d1 = new Demo3();
        Demo3 d2;

        d2 = d1;

        //d1 and d2 are refererring to same object

        System.out.println(d1);
        System.out.println(d2);

        d2.x = 20;

        System.out.println("x value is :"+d1.x);
    }
}
