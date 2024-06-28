class GraphPoint 
{
    double x;
    double y;

    GraphPoint(double x , double y)
    {
        this.x = x;
        this.y = y;
    }

    void updateX(double x1)
    {
        x = x1;
    }

    void updateY(double y1)
    {
        y = y1;
    }

    void display(double x1 , double y1)
    {
        x = x1;
        y = y1;
        System.out.println("you are on graph point :");
        System.out.println("x = "+x +" , " + "y = "+y);
    }
}

class MainClass12
{
    public static void main(String[] args) {
        GraphPoint g1 = new GraphPoint(2.5, 7);
        g1.display(5.5, 7);
    }
}
