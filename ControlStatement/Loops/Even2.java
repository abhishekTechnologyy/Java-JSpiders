class Even2
{
    public static void main(String[] args)
    {
        int i = 1;

        while(i<=10)
        {
            if(i%2 == 0)//check even no.
            {
                System.out.println(i);//print even no.
            }

            i++;//increse i value by one unit and go back to while condition
        }
    }
}