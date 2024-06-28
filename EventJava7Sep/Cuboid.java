class Cuboid{
    public static void main(String[] args) {
        
        double len = 4.4;
        double bdt = 5;
        double hgt = 19.5;
        double surfaceArea;

        surfaceArea = 2 * (len * bdt + bdt * hgt + hgt * len );

        System.out.println("Length value is : " + len);
        System.out.println("Breadth value is "+ bdt);
        System.out.println("Height value is : "+ hgt);
        System.out.println("Surface Area is : "+ surfaceArea);
    }
}