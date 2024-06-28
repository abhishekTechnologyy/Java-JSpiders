/*
 * Question : Write a Java Program to Calculate Simple Interest Program
 */

class Program5
{
    public static void main(String[] args) {
        
        //Variable Initialozation and Declaration
        double si;
        double p = 1000.0;
        double t = 2.0;
        double r = 3.5;

        //Calculation
        si = (p * r * t)/100;

        //Printing Variables
        System.out.println("Simple Interest is :" + si);
    }
}