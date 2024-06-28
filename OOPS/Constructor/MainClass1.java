class Demo1
{
    //constructor of the class
    Demo1()
    {
        System.out.println("Running Constructor....");
    }
}

class MainClass1
{
    public static void main(String[] args) {
        new Demo1();
        new Demo1();
        new Demo1();
    }
}