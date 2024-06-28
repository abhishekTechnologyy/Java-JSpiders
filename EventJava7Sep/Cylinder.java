class Cylinder{
    public static void main(String[] args) {
        
        final double pi = 3.14;
        double radius = 2.5;
        double height = 5.5;
        double volume;

        volume = pi * radius * radius * height;

        System.out.println("pi value is : " +pi);
        System.out.println("Radius value is "+ radius);
        System.out.println("Height value is : "+ height);
        System.out.println("Volume is : "+ volume);
    }
}