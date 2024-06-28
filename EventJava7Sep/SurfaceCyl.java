class SurfaceCyl{
    public static void main(String[] args) {
        
        final double pi = 3.14;
        double radius = 5.8;
        double height = 88.2;
        double surfaceArea;

        surfaceArea = 2 * pi * radius * (radius+height);

        System.out.println("pi value is : " +pi);
        System.out.println("Radius value is "+ radius);
        System.out.println("Height value is : "+ height);
        System.out.println("Surface Area is : "+ surfaceArea);
    }
}