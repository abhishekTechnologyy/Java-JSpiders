class Electricity
{
    public static void main(String[] args)
    {

        GenerateBill(201);
    }

    public static double GenerateBill(int units)
    {
        double bill;

        if(units >= 0 && units <= 200)
        {
            bill = 0;
            System.out.println("The Total Bill is : " + bill);
            return bill;
        }
        else if(units > 200 && units <= 300)
        {

            bill = (units * 6);
            bill = bill + bill * 0.18; // 18 % GST
            System.out.println("The total bill is : " + bill);
            return bill;
        }
        else
        {
            bill = (units * 7);
            bill = bill + bill * 0.18;
            System.out.println("The total bill is : " + bill);
            return bill; // har if , if else ke baad return daal re hai .. 

        }
    }
}