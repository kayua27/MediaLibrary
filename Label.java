/**
This is a generic class, with two type specifications. The first type can be
any type, the second type must implement the Comparable interface
and be comparable to other instances of the same type
*/
public class Label <T, S extends Comparable<S>> implements Comparable <Label<T,S>> {

/**
key: A reference of the first generic type.
value: A reference of the second generic type.
*/
  private T key;
  private S value;
  // getters
  public final T getKey(){
  return this.key;
  }
  public final S getValue(){
  return this.value;
  }
  // constructor
  public Label(T key,S value){
    this.key = key;
    this.value = value;
  }

  /**
Overrides the parent class version to return true if the given object is also
a Label instance, and this.value.equals(obj.value) returns true
  */
  @Override
  public boolean equals(Object obj) {
      try {
          Label other = (Label)obj;  // Type-cast obj to type Label
          return (this.value.equals(other.value));
        }
      catch (Exception e) {
         return false;  // if obj is null or is not of type Label
      }
   }

/**
Returns the result of comparing the value data members (value.compareTo(other.getValue()).
*/
   @Override
   public int compareTo(Label<T,S> other){
     return this.value.compareTo(other.getValue());
  }
}
