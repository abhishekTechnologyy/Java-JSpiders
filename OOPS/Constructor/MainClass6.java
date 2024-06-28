class Receipt 
{
    String receiptNo;
    String gstNo;
    long contactNo;
    String location; 
    double price;
    String name;
    
    Receipt(String billNo, String gst, long number,String jgah,double paisa,String naam)
    {
        System.out.println("Running COnstructor .....");
         
        receiptNo = billNo;
        gstNo = gst;
        contactNo = number;
        location = jgah;
        price = paisa;
        name = naam;

    }

    void updateReceiptNo(String billNo)
    {
        receiptNo = billNo;
    }

    void updateGstNo(String gst)
    {
        gstNo = gst;
    }

    void updateContactNo(long number)
    {
        contactNo = number;
    }
    
    void updateLocation(String jgah)
    {
        location = jgah;
    }

    void updatePrice(double paisa)
    {
        price = paisa;
    }

    void updateName(String namm)
    {
        name = namm;
    }
}

class MainClass6
{
    public static void main(String[] args) {
        System.out.println("main method started");

        Receipt r1 = new Receipt("24A01", "Br987", 8101178994l, "Asansol", 5765.67, "Kusum Singh");
        System.out.println("User receipt no is :" +r1.receiptNo);
        System.out.println("User Name is :" +r1.name);
        System.out.println("User gstNo is :" +r1.gstNo);
        System.out.println("User Contact is :" +r1.contactNo);
        System.out.println("User location is :" +r1.location);
        System.out.println("Total price is :" +r1.price);

        System.out.println("Update the object variable");

        r1.updateReceiptNo("78A5T");
        r1.updateName("Abhishek");
        r1.updateGstNo("gstA3E");
        r1.updateContactNo(8252771180l);
        r1.updateLocation("Patna");
        r1.updatePrice(59878.78);

        System.out.println("User receipt no is :" +r1.receiptNo);
        System.out.println("User Name is :" +r1.name);
        System.out.println("User gstNo is :" +r1.gstNo);
        System.out.println("User Contact is :" +r1.contactNo);
        System.out.println("User location is :" +r1.location);
        System.out.println("Total price is :" +r1.price);

        System.out.println("main method ended");

    }
}
