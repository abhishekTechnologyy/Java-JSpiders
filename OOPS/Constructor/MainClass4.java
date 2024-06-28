class Demo4 
{
    int var1;
    double var2;
    
    Demo4(int arg1 , double arg2)
    {
        System.out.println("Running Constructor .....");
        var1 = arg1;
        var2 = arg2;
    }

    void updatevar1(int arg1)
    {
        var1 = arg1;
    }

    void updatevar2(double arg1)
    {
        var2 = arg1;
    }
}

class MainClass4
{
    public static void main(String[] args) {
        System.out.println("main method started");
        Demo4 d1 = new Demo4(12,3.5);
        System.out.println("var1 value is "+d1.var1);
        System.out.println("var2 value is "+d1.var2);

        System.out.println("update tge object variable");

        d1.updatevar1(25);
        d1.updatevar2(4.5);

        System.out.println("var1 value is "+d1.var1);
        System.out.println("var1 value is "+d1.var2);

        System.out.println("main method ended");
    }
}
