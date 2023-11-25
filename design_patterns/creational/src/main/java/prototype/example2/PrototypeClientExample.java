package prototype.example2;

public class PrototypeClientExample {
    public static void main(String[] args) {
        ItemRegistry registry = new ItemRegistry();
        Movie movie = (Movie) registry.createItem("Movie");
        movie.setTitle("Creational Design Patterns in Java");

        System.out.println(movie);
        System.out.println(movie.getTitle());
        System.out.println(movie.getPrice());
        System.out.println(movie.getLength());

        Movie anotherMovie = (Movie) registry.createItem("Movie");
        anotherMovie.setTitle("Gang of Four");

        System.out.println(anotherMovie);
        System.out.println(anotherMovie.getTitle());
        System.out.println(anotherMovie.getPrice());
        System.out.println(anotherMovie.getLength());


        Movie anotherMovie1 = (Movie) registry.createItem("Movie");
        anotherMovie1.setTitle("Gang of Four");

        System.out.println(anotherMovie1);
        System.out.println(anotherMovie1.getTitle());
        System.out.println(anotherMovie1.getPrice());
        System.out.println(anotherMovie1.getLength());

        System.out.println(movie.hashCode());
        System.out.println(anotherMovie.hashCode());
        System.out.println(anotherMovie1.hashCode());
    }
}
