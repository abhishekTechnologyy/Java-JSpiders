/*
 * Ques : Print Odd no.s From 1 to n value.
 */
class HwTwo{
    public static void main(String[] args) {
        
        int n = 30;

        for(int i = 0; i<=n; i++)
        {
            if(i%2!=0)
            {
                System.out.println(i);
            }
        }
    }
}