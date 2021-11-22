/**
This class implements the MediaFilter interface,
and represents a search style filter, matching labeled media items which contain
a given search string among their data members, or in their label.
*/
public class SearchFilter implements MediaFilter {
  /**
searchTerm: the string to search for in each media item.
  */
  private String searchTerm;
  //constructor
  public SearchFilter(String searchTerm){
    this.searchTerm = searchTerm;
  }

  /**
returns true if the label contains the searchTerm, or if the searchTerm is in
the string returned by the toString method of the media item.
  */
  public boolean matches(Label<String, Media> label){
    String matchStr = label.getValue().toString();
    if ((label.getKey().indexOf(searchTerm) != -1) || (matchStr.indexOf(searchTerm) != -1)) { //((label.getKey().indexOf(searchTerm) != -1) ||
      return true;
    }
    else {
      return false;
    }
  }
}
