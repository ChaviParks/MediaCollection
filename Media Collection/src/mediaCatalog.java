import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;

public class mediaCatalog {
    ArrayList<movie> movieList = new ArrayList<>();
    ArrayList<album> albumList = new ArrayList<>();

    public void addMovie(movie m) {
        movieList.add(m);
        System.out.println("\n'"+m+"' added.");
    }

    public void deleteMovie(movie m) {
        movieList.remove(m);
        System.out.println("\n'"+m+"' removed.");
    }

    public void playMovie(movie m) {

        Integer currentViews = m.getViews();
        currentViews++;
        m.updatePlays(currentViews);
        System.out.println("PLaying '" + m + "' featuring " + m.getStars() + ".");
    }

    public void listMovies() {
        System.out.println("\nMovie List:");
        for (movie m : movieList) {
            System.out.println(m);

        }
    }

    public void showMovieCount() {
         System.out.println("\nYou have "+movieList.size()+" movies in your collection.");
    }

    public void addAlbum(album a) { albumList.add(a);
        System.out.println("\n'"+a+"' added.");
    }

    public void deleteAlbum(album a) { albumList.remove(a);
        System.out.println("\n'"+a+"' removed.");
    }

    public void playAlbum(album a) {

        Integer currentListens = a.getListens();
        currentListens++ ;
        a.updatePlays(currentListens);
        System.out.println("PLaying '"+a+"' by "+a.getArtist()+".");
    }

    public void showAlbumCount(){
        System.out.println("\nYou have "+albumList.size()+" albums in your collection.");
    }


    public void ListAlbums() {
        albumList.sort(a);
        System.out.println("\nAlbum List:");
        for (album a : albumList) {
            System.out.println(a);
        }

    }

    Comparator<album> a = new Comparator<>() {
        public int compare(album a2, album a1) {
            return a1.getListens() - a2.getListens();
        }
    };



}


