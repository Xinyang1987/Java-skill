package Exericise;

public class demo {
    public static void main(String[] args) {
        Movie[] movies = new Movie[3];
        movies[0] = new Movie("唐顿庄园", 1, 9.5, "Tom Hanks");
        movies[1] = new Movie("夏洛特烦恼", 2, 9.0, "省藤");
        movies[2] = new Movie("速度与积请", 3, 8.5, "强盛");

        MovieOperator movieOperator = new MovieOperator(movies);
        movieOperator.printMovie();
    }
}
