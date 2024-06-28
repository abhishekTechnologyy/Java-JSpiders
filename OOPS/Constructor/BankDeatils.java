class BankDetails
{
    double availableAmount;
    double withdrawAmount;
    double depositAmount;

    BankDetails(double availableAmount, double withdrawAmount , double depositAmount) {
        this.availableAmount = availableAmount;
        this.withdrawAmount = withdrawAmount;
        this.depositAmount = depositAmount;
    }

    void withdrawMoney(double n)
    {
        System.out.println("withdrawing "+n+" cash");
        if(n < availableAmount)
        {
            availableAmount = availableAmount - n;
            System.out.println("withdraw successful");
        }
        else{
            System.out.println("Insufficient balance");
        }
    }

    void depositMoney(int n)
    {
        System.out.println("Depositing" +n+" cash");
        availableAmount = availableAmount + n;
    }
    
    void viewAllAvailableBalance()
    {
        System.out.println("available tickets are :"+availableAmount);
    }
}
