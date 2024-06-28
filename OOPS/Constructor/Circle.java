class Circle 
{
    final static double pi = 3.14;
    double radius;
    
    Circle(double radius)
    {
        this.radius = radius;
    }

    void updateRadius(double r)
    {
        radius = r;
    }
    
    void calculateDiameter()
    {
        double diameter = 2*radius;
        System.out.println("diameter is :"+diameter);
    }

    void calculateArea()
    {
        double area = 2 * pi * radius;
        System.out.println("Area is :"+area);
    }

    void calculateCircumference()
    {
        double circumference = 2 * pi * radius;
        System.out.println("circumference is :"+circumference);
    }
}
class MainClass13
{
    public static void main(String[] args) {
        Circle c1 = new Circle(2.5);
        c1.calculateDiameter();
        c1.calculateArea();
        c1.calculateCircumference();
    }
}