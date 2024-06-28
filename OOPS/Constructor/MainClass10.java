class Mall
{
    String MallName;
    String ownername;
    long contactNo;
    String location; 
    double price;
    
    Mall(String MName, String name, long no,String jgah,double paisa)
    {
        System.out.println("Running COnstructor .....");
         
        MallName = MName;
        ownername = name;
        contactNo = no;
        location = jgah;
        price = paisa;

    }

    void updateMallName(String MName)
    {
        MallName = MName;
    }

    void updateOwnerName(String name)
    {
        ownername = name;
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

   
}

class MainClass10
{
    public static void main(String[] args) {
        System.out.println("main method started");

        Mall r1 = new Mall("Vega City", "Abhishek Sinha", 8252771180l, "Bangalore", 5);
        System.out.println("Mall name is :" +r1.MallName);
        System.out.println("User Name is :" +r1.ownername);
        System.out.println("User Contact is :" +r1.contactNo);
        System.out.println("User location is :" +r1.location);
        System.out.println("Total price is :" +r1.price);

        System.out.println("Update the object variable");

        r1.updateMallName("P&M mall");
        r1.updateOwnerName("Abhishek");
        r1.updateContactNo(8252771180l);
        r1.updateLocation("Patna");
        r1.updatePrice(25);

        System.out.println("Mall name is :" +r1.MallName);
        System.out.println("User Name is :" +r1.ownername);
        System.out.println("User Contact is :" +r1.contactNo);
        System.out.println("User location is :" +r1.location);
        System.out.println("Total price is :" +r1.price);

        System.out.println("main method ended");

    }
}

