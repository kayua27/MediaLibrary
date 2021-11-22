import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;

/**
This subclass of Media represents movies.
*/
public class Movie extends Media{
  /**
  title: A string representing the title of the movie.
  director: A string for the name of the director.
  year: An integer representing the year the movie was released.
  cast: A list of strings representing the names of the cast of the movie.
  */
  private String title;
  private String director;
  private List<String> cast = new ArrayList<>();
  private int year;
  // getter method
  public final List<String> getCast(){
    return this.cast;
  }
  public final String getTitle(){
    return this.title;
  }
  public final String getDirector(){
    return this.director;
  }
  public final int getYear(){
    return this.year;
  }
  public String getType(){
    return "Movie";
  }
  /**
A constructor which sets the private data members.
Should call the parent class constructor. The argument cast is a List of strings
which should be added to the private data member using addAll(...).
  */
  public Movie
  (Format format, String isbn, String genre, String title,String director,int year,List<String> cast){
    super(format,isbn,genre);
    this.title = title;
    this.director = director;
    this.year = year;
    this.cast.addAll(cast);
  }

  @Override
   public String toString(){
     return ("Title: "+this.title+", Year: "+this.year+", "+ super.toString());
   }
/**
Returns the relative ordering of this media item
*/
   @Override
   public int compareTo(Media otherMedia){
     if (otherMedia instanceof Movie){
       Movie other = (Movie) otherMedia;
       if ( this.title.compareTo(other.title) < 0 ) {
            return -1;
         }
       else if ( this.title.compareTo(other.title) > 0 ) {
            return 1;
         }
       else { // Titles are the same, so base the comparison on year
           if (this.year < other.year) {
             return -1;
           }
           else if (this.year > other.year) {
             return 1;
           }
           else{// years are the same, return 0
             return 0;
           }
         }
      }
      else{
        if (otherMedia instanceof Series) {
          return -1;
        }
        else if (otherMedia instanceof Music) {
          return -1;
        }
        else {
          return 1;
        }
      }
   }

   public static void main(String[] args) {
    Format f = Format.DVD;
 		String isbn = "234-5-67-890123-4";
 		String genre = "avant-garde";
 		String title = "inconnu";
 		String dir = "Anonyme";
 		int y = 1999;
 		List<String> cast = new ArrayList<String>();
 		cast.add("Actor 1");
 		cast.add("Actor 2");
 		cast.add("Actor 3");
 		Movie mov = new Movie(f,isbn,genre,title,dir,y,cast);
    Movie diff = new Movie(f,isbn,genre,"unknown",dir,2000,cast);
    System.out.println(mov.compareTo(diff));
   }
}
