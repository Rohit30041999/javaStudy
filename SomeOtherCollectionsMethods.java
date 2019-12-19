/*
  USE OF 'HASHTABLE' and 'DICTIONARY' FROM COLLECTIONS IN JAVA:>>
  and ALSO THE USE OF SORT, REVERSE, ROTATE methods FROM COLLECTIONS IN JAVA:>>
*/
import java.util.Dictionary;
import java.util.*;
import java.io.*;
import java.lang.*;
class Main {
  public static void main(String[] args) {
    Dictionary<Integer, Boolean> dict = new Hashtable<>();
    // (or) Dictionary<Integer, Boolean> dict = new Hashtable<Integer, Boolean>();
    // (or else) Hashtable<Integer, Boolean> hashtable = new Hashtable<>();
    List<Integer> alist = new ArrayList<Integer>();
    Integer[] arr = new Integer[]{4,2,2,4,5,6,7,7};
    for (Integer element: arr) {
      alist.add(element);
    }
    for (Integer element: alist) {
      if (dict.get(element) == null)
        dict.put(element, true);
      else dict.put(element, false);
    }
    System.out.println(dict);
    System.out.println(alist);
    
    //Sort method from Collections and Arrays classes:>>
    Collections.sort(alist);  //parameter should be a list from collections.
    //We can also use Arrays.sort(list) method to sort elements;
    System.out.println(alist);

    //reverse method from Collections:>>
    Collections.reverse(alist);
    System.out.println(alist);

    //rotate method form collections class:>>>
    Collections.rotate(alist, 0);    //Collections.rotate(list, fromWhere(index));
    System.out.println(alist);

    //binarySearch from Arrays class:>>>
    long[] longArr = new long[alist.size()];
    for (int i = 0; i < alist.size(); i++) {
      longArr[i] = alist.get(i);
    }
    int index1 = Arrays.binarySearch(longArr, 0, longArr.length-1, 7); // binarySearch from Arrays class takes an array and a ket to search as arguments or parameters and it returns an index where the key is present in negative form.
    System.out.println(index1);  // index1 = -8
    int index2 = Arrays.binarySearch(longArr, 0, longArr.length-1, 7) + longArr.length;
    System.out.println(index2);  // index2 = 0
    
    //Ternary operator:>>>>
    int index = index2;
    System.out.println((index >= 1) ? index : index+1);
  }
}
