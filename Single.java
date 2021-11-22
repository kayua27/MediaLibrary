/**
This subclass of Music represents singles
*/
public class Single extends Music{
  public String getType(){
    return "Single";
  }
/**
Simply calls the parent class constructor with the given arguments.
*/
  public Single
  (Format format, String isbn, String genre,String artist,String title,int year)
  {
    super(format,isbn,genre,artist,title,year);
  }
}
