class Student
{
    public static void studentDetail(String Name,String UnivRoll,double Marks)
    {
        System.out.println("Student details are : " );
        System.out.println("Student Name is : " +Name );
        System.out.println("Student Roll is : " +UnivRoll);
        System.out.println("Student Marks is : " +Marks);
        System.out.println(Name + " , "+ UnivRoll + " , "+ Marks);



    }

    public static void main(String[] args)
    {
        studentDetail("Abhishek","26000119013",86);
        studentDetail("Kusum","26000119018",82);
    }
}
//Agar long lenge to input me daalna prega "l" user ko kse pta chlega ki "l" likhna h
//1 hi line me details print nhi ho rha tha