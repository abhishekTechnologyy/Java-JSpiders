class Login{
    public static void main(String[] args) {
        
        String email = "abc@gmail.com";
        String pw = "123@abc";

        if(email == "abc@gmail.com")
        {
            if(pw == "123@abc")
            {
                System.out.println("login");
            }
            else
            {
                System.out.println("Invalid Password");
            }
        }

        else 
        {
            System.out.println("Invalid Email");
        }
    }
}