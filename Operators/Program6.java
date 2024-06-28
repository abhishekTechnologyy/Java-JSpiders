/*
 * Question : Write a Java Program to Calculate area of Triangle.
 */

class Program6{
    public static void main(String[] args) {
        
        //initialization and declaration

        double base = 40;
        double height = 20;
        double area;

        //Calculation
        
        area = 0.5 * base * height; // but if i write 1/2 then i get o/p = 0 because 1/2 gives 0 and 
                                    //0 multiplied by anything is 0

        //Printing Variable

        System.out.println("Area Of Triangle :" +area);


    


    }
}