class Demo3 
{
    int x;
    double y;
    
    //parameterized constructor

    Demo3(int arg1 , double arg2)
    {
        System.out.println("running Demo3 constrctor");
        x = arg1;
        y = arg2;
    }
}

class MainClass3
{
    public static void main(String[] args) {
        System.out.println("main method started");

        Demo3 d1 = new Demo3(100, 34.45);
        System.out.println("x value is :"+d1.x);
        System.out.println("y value is :"+d1.y);

        System.out.println("---------------------------");

        Demo3 d2 = new Demo3(123,66.76);   
        System.out.println("x value is :"+d2.x);
        System.out.println("Y value is :" + d2.y);
        System.out.println("Main method Ended");
    }
}