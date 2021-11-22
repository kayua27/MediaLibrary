/**
This abstract subclass of Media represents different types of music
*/
public abstract class Music extends Media {
  /**
  artist: A string with the name of the artist.
  title: A string with the title of the piece.
  year: An integer representing the year the piece was released
  */
  private String artist;
  private String title;
  private int year;
  /**
 A constructor which sets the private data members
  */
  public Music(Format format, String isbn, String genre,String artist,String title,int year){
    super(format,isbn,genre);
    this.artist = artist;
    this.title = title;
    this.year = year;
  }
  // getters
  public final String getArtist(){
    return this.artist;
  }
  public final String getTitle(){
    return this.title;
  }
  public final int getYear(){
    return this.year;
  }
/**
A string representation of this object.
*/
  @Override
   public String toString(){
     String superString = super.toString();
     return ("Artist: "+this.artist+", Year: "+this.year+", Title: "+this.title+", "+ superString);
   }

  /**
This method returns an integer value representing whether the instance given
as an argument should be ordered before or after the calling instance.
  */
  @Override
  public int compareTo(Media otherMedia){
    if (otherMedia instanceof Music){
      Music other = (Music) otherMedia;
      if ( this.artist.compareTo(other.artist) < 0 ) {
           return -1;
        }
      else if ( this.artist.compareTo(other.artist) > 0 ) {
           return 1;
        }
      else { // artists are the same, so base the comparison on year
          if (this.year < other.year) {
            return -1;
          }
          else if (this.year > other.year) {
            return 1;
          }
          else{// years are the same, so base the comparison on title
            return this.title.compareTo(other.title);
          }
        }
      }
      return 1;
  }
}
