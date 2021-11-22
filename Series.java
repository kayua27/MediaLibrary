import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;

/**
This subclass of Media represents TV series.
*/
public class Series extends Media {

/**
title: A string representing the title of the series.
cast: A list of strings representing the names of the cast in this series.
episodes: A list of strings representing the names of the episodes in the series
*/
  private String title;
  private List<String> cast = new ArrayList<>();
  private List<String> episodes = new ArrayList<>();

  // getter method
  public final String getTitle(){
    return this.title;
  }
  public final List<String> getCast(){
    return this.cast;
  }
  public final List<String> getEpisodes(){
    return this.episodes;
  }
  public String getType(){
    return "Series";
  }

/**
A constructor which sets the private data members.Call the parent
class constructor. The arguments cast and episodes are Lists of strings
which should be added to the corresponding private data members using addAll(...)
*/
  public Series
  (Format format,String isbn,String genre,String title,List<String> cast,List<String> episodes){
    super(format,isbn,genre);
    this.title = title;
    this.cast.addAll(cast);
    this.episodes.addAll(episodes);
  }

  @Override
   public String toString(){
     return ("Title: "+this.title+", "+ super.toString());
   }

/**
Returns the relative ordering of this media item.
*/
   @Override
   public int compareTo(Media otherMedia){
     if (otherMedia instanceof Series){
       Series other = (Series) otherMedia;
       return this.title.compareTo(other.title);
    }
    else{
      if (otherMedia instanceof Movie) {
        return 1;
      }
      else if (otherMedia instanceof Music) {
        return -1;
      }
      else {
        return 1;
      }
    }
  }
}
