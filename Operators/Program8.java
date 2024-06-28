/*
 * Question : Write a Java Program to perform deposit and withdraw transaction
 */

class Program8{
    public static void main(String[] args) {
        
        double bankBalance = 10000;
        double withdraw = 2000;
        double deposit = 5000;

        System.out.println("Bank Balance:" + bankBalance);//initial Bank Balance

        System.out.println("Withdraw Amount : " + withdraw);
        bankBalance = bankBalance - withdraw; // Withdraw operation
        System.out.println("Bank Balance:" + bankBalance);// after withdraw bank Balance

        System.out.println("Deposit Amount : " + deposit);
        bankBalance = bankBalance + deposit;// deposit operation
        System.out.println("Bank Balance:" + bankBalance);// after deposit Bank Balance







    }
}