class Employee
{
    String name;
    String id;
    double sal;
    String type;

    void Work()
    {
        System.out.println("Do Work.....");
    }
}
class MainClass4
{
    public static void main(String[] args)
    {
        NoteBook n1=new NoteBook();
        System.out.println("main method started");
        n1.brand="Classmate";
        n1.size="Big";
        n1.type="Unruled";
        n1.price=75.0;
        System.out.println("Brand : " +n1.brand+ " Size : " +n1.size+ " Type : " +n1.type+ " Price : " +n1.price);
        n1.open();
        n1.close();
        n1.turnpages();
        System.out.println("main method ended");
    }
}