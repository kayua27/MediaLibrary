import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;

/**
This class represents the library of media items.
*/
public class MediaLibrary{
  /**
A list of labeled media items. A labeled media item is an instance of the
Label class with the first type specified to be a string, and the second type
specified to be Media (Label<String, Media>).
  */
  private List<Label<String,Media>> library;

  /**
A default constructor which initializes the library.
  */
  public MediaLibrary(){
    this.library = new ArrayList<>();
  }
  /**
A method for adding media to the library.
The first argument is a string, the second the media item.
  */
  public void add(String name,Media media) throws MediaAlreadyInLibrary {
    Label<String, Media> newMedia = new Label<>(name,media); // create a new Label<String, Media> instance
    if (this.library.contains(newMedia)) { //If this media item is already in the library
      throw new MediaAlreadyInLibrary(name,media); // a new MediaAlreadyInLibrary exception should be thrown
    }
    else {
      this.library.add(newMedia); // add to library
    }
  }

/**
This method creates and returns a new list of labeled media items.
This new list should contain all of the labeled media items from the library
for which the given mediaFilter's matches method returned true.
*/
  public List<Label<String,Media>> filter(MediaFilter mediaFilter){
    List<Label<String,Media>> labeledList = new ArrayList<>(); // create ArrayList
    for (Label<String,Media> e : this.library ) { // iterate through library
      if (mediaFilter.matches(e)) { // call matches() method
        labeledList.add(e); // add to ArrayList
      }
    }
    return labeledList;
  }

/**
This method sorts the data member library
*/
  public void sort(){
    Collections.sort(this.library); // automatically sort using the compareTo(...)
  }
}
