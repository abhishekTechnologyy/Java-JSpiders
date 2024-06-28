class Account {
    
    String custname;
    double accbal;
    final int accnum;
    private static int randomNumber = 1001001;
    // private static int randomNumber = 1001001;


    Account(String custname,double accbal)
    {
        this.custname = custname;
        this.accbal = accbal;
        this.accnum = randomNumber++;
    }

    void details()
    {
        System.out.println("customer name :"+custname+" Account number :"+accnum+" Account Balance :"+accbal);
    }
}

class MainClass14
{
    public static void main(String[] args) {
        Account a1 = new Account("Abhishek", 20000);
        a1.details();
        Account a2 = new Account("kusum", 30000);
        a2.details();
    }
}
