package Exericise;

public class MovieOperator {
    private Movie[] movies;

    public MovieOperator(Movie[]  movies){
        this.movies = movies;
    }

    public void printMovie(){
        System.out.println("所有电影名称：");
        for(int i = 0; i < movies.length; i++){
            System.out.println(movies[i].getName());
        }
    }
}
