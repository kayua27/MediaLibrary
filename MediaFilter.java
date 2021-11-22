/**
This interface describes a single method, matches,
which returns true if a given labeled media item matches the criteria of this filter.
*/
public interface MediaFilter{
  public boolean matches(Label<String, Media> label);
}
