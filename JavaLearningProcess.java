import java.io.*;
import java.util.*;
import java.lang.*;

class JavaLearningProcess {
  public static void main(String[] args) throws Exception {                   // Exception is thrown because of the BufferedReader class (created Especially for strings).
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s = br.readLine();
    char[] str = s.toCharArray();
    Character[] charArray = {'1', 'r', '6', '8', 'i'};
    StringBuilder sb = new StringBuilder(s);              // StringBuffer has same methods and functionalities of a StringBuilder.
    // sb.insert(1, "rohit");
    sb.insert(0, str);
    sb.insert(0, 'r');
    sb.append('a');
    sb.append(str);
    sb.append("rohit");
    List<Character> characters = new ArrayList<Character>();
    for (char c: str) {                    // for item or element in array loop or for Each loop.
      characters.add(c);
    }
    System.out.println(characters);
    System.out.println(Arrays.asList(charArray));
    Collections.sort(Arrays.asList(charArray));
    System.out.println(Arrays.asList(charArray));
    System.out.println((int)'r'-(int)'a');
    System.out.println(new String(sb));
    System.out.println(sb.substring(1, 6));
    System.out.println(sb.substring(6, 11));
    System.out.println(sb.substring(11));
    System.out.println(sb.lastIndexOf("rohit"));
    System.out.println(sb.lastIndexOf("r"));
    System.out.println(sb.indexOf("rohit"));
    System.out.println(sb.indexOf("r"));

    Character[] array = {'a', 'd', '1', 'p', 't', '8'};
    Arrays.sort(array);
    System.out.println(Arrays.asList(array));
    System.out.println(Arrays.asList(Arrays.asList(array).toArray()));

    char[] arr = {'a', 'd', '1', 'p', 't', '8'};
    Arrays.sort(arr);
    System.out.println(arr);

    Set<Integer> sets = new HashSet<>();
    int[] a = {11, 1, 1, 2, 2, 3, 4, 5, 5, 5, 5, 6};
    for (int item: a) {
      sets.add(item);
    }

    System.out.println(Arrays.asList(sets));
    System.out.println(sets);
  }
}
