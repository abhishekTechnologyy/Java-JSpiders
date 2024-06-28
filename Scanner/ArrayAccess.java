import java.util.*;
class ArrayAccess
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Array Size");
        int size = sc.nextInt();

        int []a1 = new int[size];

        //take array elements from user

        System.out.println("Enter your Elements");

        for(int i = 0; i <= a1.length-1; i++)
        {
            a1[i] = sc.nextInt();
        }
        sc.close();
    }
}