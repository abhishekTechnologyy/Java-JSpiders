class SbiCreditCard {
    String accountHolderName;
    int cvvNo;
    String expirydate;
    long cardNo;
    double availableBalance;
    double cardLimit;
   
   
    public SbiCreditCard(String accountHolderName, int cvvNo, String expirydate, long cardNo,double availableBalance,double cardLimit) {
        this.accountHolderName = accountHolderName;
        this.cvvNo = cvvNo;
        this.expirydate = expirydate;
        this.cardNo = cardNo;
        this.availableBalance = availableBalance;
        this.cardLimit = cardLimit;
    }

    void updateAccountHolderName(String name)
    {
        accountHolderName = name;
    }

    void updateCvvNo(int cardNo)
    {
        cvvNo = cardNo;
    }

    void updateExpirydate(String date)
    {
        expirydate = date;
    }

    void updateCardNo(long cardNumber)
    {
        cardNo = cardNumber;
    }

    void cardStatement()
    {
        System.out.println("Your available balance is :"+availableBalance);
    }

    void cardLimit(double debitedMoney)
    {
        cardLimit = availableBalance - debitedMoney;
        System.out.println("card Limit remaining is :"+cardLimit);
    }
    
}

class MainClass3{
    public static void main(String[] args) {
        
        SbiCreditCard s1 = new SbiCreditCard("Abhishek", 123, "09/23", 123456789l, 70000, 90000);

        System.out.println("account Holder name = "+s1.accountHolderName);
        System.out.println("account cvv no. = "+s1.cvvNo);
        System.out.println("account expiry date = "+s1.expirydate);
        System.out.println("account card number = "+s1.cardNo);
        System.out.println("account card Limit name = "+s1.cardLimit);

        s1.cardStatement();
        s1.cardLimit(30000);
    }
}
