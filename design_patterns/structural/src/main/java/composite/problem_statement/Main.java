package composite.problem_statement;

public class Main {

    // output
    // Directory Name: Movie
    // file name Border
    // Directory Name: ComedyMovie
    // file name Welcome
    public static void main(String args[]) {

        Directory movieDirectory = new Directory("Movie");

        File borderMovie = new File("Border");
        movieDirectory.add(borderMovie);

        Directory comedyMovieDirectory = new Directory("ComedyMovie");
        File welcomeMovie = new File("Welcome");
        comedyMovieDirectory.add(welcomeMovie);

        movieDirectory.add(comedyMovieDirectory);

        movieDirectory.ls();
    }
}

