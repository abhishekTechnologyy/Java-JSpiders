package jspiders.admin;

public class MainClass1 {
    public static void main(String[] args) {
        System.out.println("main method started");

        Employee e1 = new Employee(2345, "Ramesh", 25000.00);

        System.out.println("Employee id : "+e1.getId());
        System.out.println("Employee name : "+e1.getName());
        System.out.println("Employee salary : "+e1.getSalary());

        System.out.println("change salary");

        e1.setSalary(35000.00);
        System.out.println("Employee salary :"+e1.getSalary());

        System.out.println("main method ended");
    }
}
