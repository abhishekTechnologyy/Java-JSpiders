class FaceBookLogin
{
    String Username;
    String emailId;
    String password;
    long phoneNo;
    public FaceBookLogin(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }
    public FaceBookLogin( long phoneNo,String password) {
        this.password = password;
        this.phoneNo = phoneNo;
    }
    
    public FaceBookLogin(String username, long phoneNo) {
        Username = username;
        this.phoneNo = phoneNo;
    }
    void updateName(String name)
    {
        Username = name;
    }
    void updateEmailId(String email)
    {
        emailId = email;
    }
    void updatePassword(String pass)
    {
        password = pass;
    }
    void updatePhoneNo(long phone)
    {
        phoneNo = phone;
    }

    void facebookWork()
    {
        System.out.println("Login successful");
    }
}

class MainClass2
{
    public static void main(String[] args) {
        
        FaceBookLogin f1 = new FaceBookLogin(8252771180l, "abhi12345");
        FaceBookLogin f2 = new FaceBookLogin("abhishek@123", "A342");
        FaceBookLogin f3 = new FaceBookLogin("Abhishek", 7488073515l);

        f1.facebookWork();

        System.out.println("user name is :"+f3.Username);
        System.out.println("user email is:"+f2.emailId);
    }
}