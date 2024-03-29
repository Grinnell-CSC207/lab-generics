/**
 * Some simple search utilities.
 */
public class SearchUtils {
  /**
   * Return the first value in vals for which the predidcate holds. 
   * Return null if nothing is found.
   */
  public static <T> T search(T[] vals, Predicate<T> pred) {
    for (int i = 0; i < vals.length; i++) {
      if (pred.holds(vals[i])) {
        return vals[i];
      } // if
    } // for
    return null;
  } // search(T[], Predicate<T>)
} // class SearchUtils
