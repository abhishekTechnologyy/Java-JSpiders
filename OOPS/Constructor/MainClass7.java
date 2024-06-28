class Apartment 
{
    String ApartmentName;
    String ownername;
    long contactNo;
    String location; 
    double price;
    
    Apartment(String ApartName, String name, long no,String jgah,double paisa)
    {
        System.out.println("Running COnstructor .....");
         
        ApartmentName = ApartName;
        ownername = name;
        contactNo = no;
        location = jgah;
        price = paisa;

    }

    void updateApartmentName(String ApartName)
    {
        ApartmentName = ApartName;
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

class MainClass7
{
    public static void main(String[] args) {
        System.out.println("main method started");

        Apartment r1 = new Apartment("Sinha Bhavan", "Abhishek Sinha", 8252771180l, "Bangalore", 1098765);
        System.out.println("Apartment name is :" +r1.ApartmentName);
        System.out.println("User Name is :" +r1.ownername);
        System.out.println("User Contact is :" +r1.contactNo);
        System.out.println("User location is :" +r1.location);
        System.out.println("Total price is :" +r1.price);

        System.out.println("Update the object variable");

        r1.updateApartmentName("Sinha Villa");
        r1.updateOwnerName("Abhishek");
        r1.updateContactNo(8252771180l);
        r1.updateLocation("Patna");
        r1.updatePrice(59878234.78);

        System.out.println("Apartment name is :" +r1.ApartmentName);
        System.out.println("User Name is :" +r1.ownername);
        System.out.println("User Contact is :" +r1.contactNo);
        System.out.println("User location is :" +r1.location);
        System.out.println("Total price is :" +r1.price);

        System.out.println("main method ended");

    }
}
