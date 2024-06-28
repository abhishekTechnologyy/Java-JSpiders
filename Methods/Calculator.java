class Calculator{
    public static void main(String[] args)
    {
        add(1,2);
        sub(2,1);
        mul(1,2);
        div(2,1);
    }
    
        public static int add(int a, int b)
        {
            int sum = a+b;
            System.out.println(sum);
            return sum;
        }

        public static int sub(int a, int b)
        {
            int sub = a-b;
            System.out.println(sub);
            return sub;
        }

        public static int mul(int a, int b)
        {
            int mul = a*b;
            System.out.println(mul);
            return mul;
        }

        public static int div(int a, int b)
        {
            int div = a/b;
            System.out.println(div);
            return div;
        }


    
}