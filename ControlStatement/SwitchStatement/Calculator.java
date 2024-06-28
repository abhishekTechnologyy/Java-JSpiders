class Calculator{
    public static void main(String[] args) {
        int value1=10;
        int value2=20;
        String symbol = "+";

        switch (symbol) {
            case "+":System.out.println(value1+value2);
                
                break;
            case "-":System.out.println(value1-value2);
                
                break;
            case "*":System.out.println(value1*value2);
                
                break;
            case "/":System.out.println(value1+value2);
                
                break;
        
            default: System.out.println("Invalid Operation");
                break;
        }
    }
}