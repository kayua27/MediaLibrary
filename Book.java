/**
This subclass of Media represents books.
*/
public class Book extends Media{
  /**
  title: A string representing the title of the book.
  author: A string representing the author of the book.
  publisher: A string representing the publisher of the book.
  */
  private String title;
  private String author;
  private String publisher;

  // getter method
  public final String getTitle(){
    return this.title;
  }
  public final String getAuthor(){
    return this.author;
  }
  public final String getPublisher(){
    return this.publisher;
  }
  public String getType(){
    return "Book";
  }
  /**
constructor which sets the private data members.call the parent class constructor.
  */
  public Book
  (Format format, String isbn, String genre,String author,String title,String publisher){
    super(format,isbn,genre);
    this.author = author;
    this.title = title;
    this.publisher = publisher;
  }

  @Override
   public String toString(){
     return ("Title: "+this.title+", Author: "+this.author+", "+ super.toString());
   }
   @Override
   public int compareTo(Media otherMedia){
     if (otherMedia instanceof Book){
       Book other = (Book) otherMedia;
       if ( this.author.compareTo(other.author) < 0 ) {
            return -1;
         }
       else if ( this.author.compareTo(other.author) > 0 ) {
            return 1;
         }
      else{// authors are the same, so base the comparison on title
           return this.title.compareTo(other.title);
        }
      }
      return -1;
  }
}
