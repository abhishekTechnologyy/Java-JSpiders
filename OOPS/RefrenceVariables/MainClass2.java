class Demo2
{
    int x = 10;
    void test()
    {
        System.out.println("Running test() method");
    }
}

class MainClass2 {
    public static void main(String[] args) {
        System.out.println("main method started");
        Demo2 d1 = new Demo2();
        Demo2 d2 = new Demo2();
        System.out.println(d1);
        System.out.println(d2);
    }
}
