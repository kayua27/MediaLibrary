import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;

/**
This subclass of Music represents complete album.
*/
public class Album extends Music {
  /**
A list of strings representing the tracks on the album.
  */
  private List<String> trackList = new ArrayList<>() ;
  /**
 A constructor which sets the private data members
  */
  public Album
  (Format format, String isbn, String genre, String artist,String title,int year,List<String> trackList){
    super(format,isbn,genre,artist,title,year);
    this.trackList.addAll(trackList);
  }
// getters
  public final List<String> getTracklist(){
    return this.trackList;
  }
  public String getType(){
    return "Album";
  }
/**
A string representation of this object
*/
  @Override
   public String toString(){
     return (super.toString() + ", Tracks: "+ this.trackList);
   }
   public static void main(String[] args) {
     List <String> l = new ArrayList<>();
     List <String> arr = new LinkedList<>();
     l.add("song1");
     l.add("song2");
     arr.add("kpangor");
     arr.add("moto moto");
     Album f = new Album(Format.CD,"abc","urban","Arafat","Kong",2019,l);
     System.out.println(f.getTracklist());
     System.out.println(f.toString());
   }
}
