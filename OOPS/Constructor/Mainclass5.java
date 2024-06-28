class User
{
    String username;
    int userId;
    String password;
    String email;
    long phoneNo;

    User(String name, int id, String pass,String mail, long phone)
    {
        System.out.println("Running Constructor ...");

        username = name;
        userId = id;
        password = pass;
        email = mail;
        phoneNo = phone;
    }

    void updateUserName(String name)
    {
        username = name;
    }

    void updateUserId(int id)
    {
        userId = id;
    }

    void updatePassword(String pass)
    {
        password = pass;
    }

    void updateEmail(String mail)
    {
        email = mail;
    }

    void updatePhoneNo(long no)
    {
        phoneNo = no;
    }
}

class MainClass5
{
    public static void main(String[] args) {
        System.out.println("main method started");

        User m1 = new User("Abhishek", 23, "abc@23", "techabhi", 8252771180l);

        System.out.println("User Name is :" +m1.username);
        System.out.println("User id is :" +m1.userId);
        System.out.println("User Password is :" +m1.password);
        System.out.println("User Email is :" +m1.email);
        System.out.println("User phone no is :" +m1.phoneNo);

        System.out.println("Update the object variable");

        m1.updateUserName("Kusum");
        m1.updateUserId(18);
        m1.updatePassword("Dhisoom@123");
        m1.updateEmail("DhisoomSingh24");
        m1.updatePhoneNo(8101178994l);

        System.out.println("User Name is :" +m1.username);
        System.out.println("User id is :" +m1.userId);
        System.out.println("User Password is :" +m1.password);
        System.out.println("User Email is :" +m1.email);
        System.out.println("User phone no is :" +m1.phoneNo);

        System.out.println("main method ended");


    }
}
