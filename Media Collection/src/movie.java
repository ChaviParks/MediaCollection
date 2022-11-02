

public class movie {
    private movie.MovieDetails details;

    private String identifier;

    public String toString() {
        return (identifier);
    }

    public movie(String Identifier){

        identifier = Identifier;
    }

    public void addDetails(String Genre, String Stars, Integer views) {
        details = new movie.MovieDetails(Genre, Stars, views,identifier);
    }


    public void showDetails() {
        System.out.println(details);

    }

    public Integer getViews() {

        return(details.views);
    }

    public String getStars() {
        return (details.stars);
    }

    public void updatePlays(Integer NewCount)
    {
        details.views = NewCount;
    }


    public class MovieDetails {

        private String genre;

        private String stars;

        private Integer views;

        public MovieDetails(String Genre, String Stars, Integer Views,String identifier) {

            genre = Genre;
            stars = Stars;
            views = Views;

        }

        public String toString()
        {
            return ("\n'"+identifier+"':\nGenre: "+genre+ " "+"Features: "+stars + " " + "Watched "+views+" times.");
        }

    }

}
