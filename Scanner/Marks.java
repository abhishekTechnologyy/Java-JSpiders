import java.util.Scanner;

class Marks
{
    public static void checkMarks(int[] marks)
    {
        for(int i = 0; i <= marks.length-1; i++)
        {
            if(marks[i] > 90)
            {
                System.out.println(marks[i] + " rating is S+");
            }
            else if(marks[i] >= 70 && marks [i] <= 90)
            {
                System.out.println(marks[i] + " rating is A");
            }
            else if(marks[i] >= 60 && marks [i] <= 70)
            {
                System.out.println(marks[i] + " rating is B");
            }
            else
            {
                System.out.println(marks[i] + " rating is C");
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many students marks you want to update");
        int size = sc.nextInt();
        int[] marks = new int[size];
        System.out.println("Enter Student Marks");
        
        for(int i = 0; i <= marks.length-1;i++)
        {
            marks[i]=sc.nextInt();

        }
        checkMarks(marks);


    }
}