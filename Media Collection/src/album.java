

public class album {

    private AlbumDetails details;

    private String identifier;


    public String toString()
    {
        return (identifier);
    }

    public album(String Identifier){
        identifier = Identifier;
    }

    public void addDetails (String Artist, Integer NumSongs , Integer Listens)
    {
      details = new AlbumDetails(Artist, NumSongs ,Listens,identifier);
    }

    public void showDetails( ) {

    System.out.println(details);

    }

    public Integer getListens() {

        return(details.listens);
    }

    public String getArtist(){
        return (details.artist);
    }

    public void updatePlays(Integer NewCount)
    {
        details.listens = NewCount;
    }

    public class AlbumDetails {

        private String artist;

        private Integer numSongs;

        private Integer listens;



        public AlbumDetails(String Artist, Integer NumSongs, Integer Listens,String identifier) {

            artist = Artist;

            numSongs = NumSongs;

            listens = Listens;

        }

        public String toString()
        {
            return("\n'"+identifier+"' by "+artist+" has "+ numSongs+" songs and "+listens+" listens.");
        }

    }
}

