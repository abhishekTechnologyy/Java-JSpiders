import java.util.Scanner;
class Student
{

    public static void displayDetails(String name, String seatNumber, double marks)
    {
        System.out.println("Details are - ");
        System.out.println("Student name is : "+ name);
        System.out.println("Student seat is : " + seatNumber);
        System.out.println("Student marks is : " + marks);

    }

    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter your seat");
        String seatNumber = sc.nextLine();
        System.out.println("Enter your marks");
        double marks = sc.nextDouble();

        displayDetails(name,seatNumber,marks);


    }
}