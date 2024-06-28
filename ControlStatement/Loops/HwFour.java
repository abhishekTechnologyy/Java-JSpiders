/*
 * Ques : Count How many Odd No.s are present from 1 to n value.
 */
class HwFour{
    public static void main(String[] args) {
        
        int n = 30;
        int count = 0;

        for(int i = 0; i<=n; i++)
        {
            if(i%2!=0)
            {
                count +=1;
                System.out.println(i);
            }

        }

        System.out.println("Total Odd no.s are : " + count);

    }
}