class Movie {
    String name;
    String actorName;
    String actressName;
    double budget;
    
    void watch()
    {
        System.out.println("watch Movie");
    }

    void play()
    {
        System.out.println("play the movie");
    }
}

class MainClass5
{
    public static void main(String[] args) {
        System.out.println("main method started");

        Movie m1;
        m1 = new Movie();

        m1.name = "Kabhi Khushi Kabhi Gam";
        m1.actorName = "Shah Rukh Khan";
        m1.actressName = "Kajol";
        m1.budget = 40.76;

        System.out.println("Name :" +m1.name +" , Actor Name : "+m1.actorName+" , Actress Name : "+m1.actressName+" , Budget : "+m1.budget+" Cr" );

        m1.watch();
        m1.play();
    }
}
