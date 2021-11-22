/**
This class is an abstract class for representing different kinds of media
*/

public abstract class Media implements Comparable <Media>{
/**
  private fields
isbn: A string representing the ISBN of this media item
genre: A string representing the genre of this media item
format: An instance of the Format enum
*/
  private String isbn;
  private String genre;
  private Format format;
/**
constructor with 3 parameters. Initializes private data members.
*/
  public Media (Format format, String isbn, String genre) {
    this.format = format;
    this.isbn = isbn;
    this.genre = genre;
  }
  // getters
  public final String getIsbn(){
  return this.isbn;
  }
  public final String getGenre(){
    return this.genre;
  }
  public final Format getFormat(){
    return this.format;
  }
  // abstract method
  public abstract String getType();
/**
 Overrides the parent class version to return true if the given object is also
 a media item, and their ISBNs match. Otherwise, return false.
*/
  @Override
  public boolean equals(Object obj) {
      try {
          Media other = (Media)obj;  // Type-cast obj to type Media
          return (this.isbn.equals(other.isbn));
        }
      catch (Exception e) {
         return false;  // if obj is null or is not of type Media
      }
   }
  /**returns a string representation of this media.
  */
   public String toString(){
     return ( "Type: "+ this.getType()+ ", ISBN: " + this.isbn + ", Genre: " + this.genre + ", Format: " + this.format);
   }
}
