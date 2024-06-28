/*
 * Question : Write a Java Program to Calculate the Diameter , Radius , Area and the Circumference.
 */

class Program4
{
    public static void main(String[] args) {
        
        // Declare and initialization of variables

        double radius = 2.1;
        final double pi = 3.14;
        double dia , area , circum;

        // Calculations

        dia = 2 * radius;
        area = pi * radius * radius;
        circum = 2 * pi * radius;

        //Printing the Variables

        System.out.println("Radius :" +radius);
        System.out.println("Diameter :" +dia);
        System.out.println("Area :" +area);
        System.out.println("Circumference :" +circum);



    }
}