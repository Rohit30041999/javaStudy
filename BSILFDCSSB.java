/*
Byte, Short, Integer, Long, Character, String, StringBuilder;
*/

import java.io.*;
import java.util.*;
import java.lang.*;
class BSILFDCSSB {
  private static StringBuilder returnSB() {
    StringBuilder sb = new StringBuilder("");
    for (int i = 97; i <= 100; ++i) {
      sb.append((char)i);
    }
    return sb;
  }

  private static String returnString() {
    StringBuilder sb = new StringBuilder("");
    for (int i = 65; i <= 72; ++i) {
      sb.append((char)i);
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    
    //Integer:>>>
    
    byte maxByte = Byte.MAX_VALUE;
    byte minByte = Byte.MIN_VALUE;
    short maxShort = Short.MAX_VALUE;
    short minShort = Short.MIN_VALUE;
    int maxInteger = Integer.MAX_VALUE;
    int minInteger = Integer.MIN_VALUE;
    long maxLong = Long.MAX_VALUE;
    long minLong = Long.MIN_VALUE;
    float maxFloat = Float.MAX_VALUE;
    float minFloat = Float.MIN_VALUE;
    double maxDouble = Double.MAX_VALUE;
    double minDouble = Double.MIN_VALUE;
    System.out.println(maxByte);
    System.out.println(minByte);
    System.out.println(maxShort);
    System.out.println(minShort);
    System.out.println(maxInteger);
    System.out.println(minInteger);
    System.out.println(maxLong);
    System.out.println(minLong);
    System.out.println(maxFloat);
    System.out.println(minFloat);
    System.out.println(maxDouble);
    System.out.println(minDouble);
    
    //Character:>>>
    
    System.out.println(Character.isLetter('c'));
    System.out.println(Character.isDigit('1'));
    System.out.println(Character.isLetterOrDigit('1'));
    System.out.println(Character.isLetterOrDigit('c'));
    System.out.printf("%d %d\n", (int)'c', (int)'a');
    System.out.println((long)'c');
    System.out.println('c' - 'a');
    
    //String:>>
    
    String string = "Rohit";
    System.out.println(string.charAt(0));
    System.out.println(string.charAt(1));
    System.out.println(string.charAt(2));
    System.out.println(string.charAt(3));
    System.out.println(string.charAt(4));
    // System.out.println(string.charAt(5)); shows error.
    System.out.println(string.length());
    
    //StringBuilder:>>
    
    StringBuilder stringB = new StringBuilder("");
    for (int i = 97; i <= 122; ++i) {
      stringB.append((char)i);
    }
    System.out.println(stringB.toString());
    System.out.println(stringB);
    stringB.insert(0, "rohit");
    System.out.printf("%s \n", stringB.toString());
    stringB.append("rohit");
    System.out.printf("%s \n", stringB.toString());
    char[] characters = {'a', 'b', 'A'};
    stringB.append(characters);
    System.out.println(stringB.toString());
    stringB.insert(4, characters);
    System.out.println(stringB.toString());
    
    //return StringBuilder:>>
    
    StringBuilder sb = returnSB();
    System.out.println(sb);

    //return string from StringBuilder:>>>
    
    String stringFSB = returnString();
    System.out.println(stringFSB);
  }
}
