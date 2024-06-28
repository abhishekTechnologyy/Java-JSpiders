class Demo4
{
    static int x = 100;
}

class MainClass3
{
    public static void main(String[] args)
    {
        System.out.println("Main method started");
        System.out.println("X value is : " +Demo4.x);
        System.out.println("Modifying static variable");
        Demo4.x = 200;
        System.out.println("X value is :"+Demo4.x);
        System.out.println("Main method ended");

    }
}