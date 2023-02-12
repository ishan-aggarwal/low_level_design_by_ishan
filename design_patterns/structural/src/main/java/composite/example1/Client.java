package composite.example1;

public class Client {

    // The client code can work with any component that follows the component interface.
    // output:
    // Directory: Movie
    // File: Border
    // Directory: ComedyMovie
    // File: Welcome
    public static void main(String[] args) {
        Directory root = new Directory("Movie");

        File borderMovie = new File("Border");
        root.add(borderMovie);

        Directory comedyMovieDirectory = new Directory("ComedyMovie");
        File welcomeMovie = new File("Welcome");
        comedyMovieDirectory.add(welcomeMovie);

        root.add(comedyMovieDirectory);

        root.ls();
    }
}
