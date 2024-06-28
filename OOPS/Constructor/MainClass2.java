    
class Demo2
{
    int x;
    double y;

    Demo2()
    {
        System.out.println("running Demo2 constructor");
        x = 10;
        y = 2.5;
    }
}

class MainClass2
{
    public static void main(String[] args) {
        
        System.out.println("main method started");
        Demo2 d1 = new Demo2();
        System.out.println("x value is :" +d1.x);
        System.out.println("y value is : "+d1.y);
        System.out.println("main method ended");
    }
}