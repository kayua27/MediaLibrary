/**
This exception represents the situation where two or more labeled media items
 with the same ISBN are added to the media library.
*/
public class MediaAlreadyInLibrary extends Exception {

  /**
  name: A string that stores the label of the duplicate media item that was being added.
  media: A reference to the duplicate media item.
  */
  private String name;
  private Media media;
// constructor
  public MediaAlreadyInLibrary(String name,Media media){
    super("Media already in library.");
    this.media = media;
    this.name = name;
  }
// getters
  public final String getName(){
    return this.name;
  }
  public final Media getMedia(){
    return this.media;
  }
}
