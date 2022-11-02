public class mediaDriver {
    public static void main( String[] args )
    {
        album CLB = new album("Certified Lover Boy");
        album ST  = new album("Stoney");
        album DANG = new album("Dangerous");
        album B = new album("Bipolar");

        CLB.addDetails("Drake",21,0);
        ST.addDetails("Post Malone", 18, 0);
        DANG.addDetails("Morgan Wallen",30,0);
        B.addDetails("Yot Club",6,0);

        movie AIW = new movie("Avengers: Infinity War");
        movie TM = new movie("The Matrix");
        movie S = new movie("Soul");
        movie N =  new movie("Nope");

        AIW.addDetails("Action","Robert Downey Jr & Josh Brolin", 0);
        TM.addDetails("Sci-fi", "Keanu Reeves & Carrie-Anne Moss",0);
        S.addDetails("Family","Jamie Foxx & Tina Fey",0);
        N.addDetails("Horror","Keke Palmer & Daniel Kaluuya",0);


        mediaCatalog catalog = new mediaCatalog();

        catalog.addAlbum( CLB );
        catalog.addAlbum(ST);
        catalog.addAlbum(DANG);
        catalog.addAlbum(B);
        catalog.addMovie(AIW);
        catalog.addMovie(TM);
        catalog.addMovie(S);
        catalog.addMovie(N);


        for (int i=1;i<=7;i++){
            catalog.playAlbum(CLB);
        }
        for (int i=1;i<=5;i++){
        catalog.playAlbum(B);
        }

        catalog.playAlbum(ST);

        catalog.showMovieCount();

        catalog.deleteMovie(TM);

        catalog.showMovieCount();

        catalog.listMovies();
        CLB.showDetails();
        B.showDetails();
        DANG.showDetails();
        catalog.playAlbum(DANG);
        DANG.showDetails();

        catalog.ListAlbums();








    }
}
