/*
Conversion of integer to binary number example:>>>

function or method used:>>
Integer.toBinaryString(required_number);   // returns a String value.

*) if you want to a Binary Number but not String convert the String format value into Integer by parsing it. i.e.,
  Integer.parseInt(binary_number_String_format);
*/

import java.io.*;
import java.util.*;
import java.lang.*;

class Main {
  public static String integerToBinaryExample(int number) {
    String binary_number = Integer.toBinaryString(number);
    Integer binaryString_to_number = Integer.parseInt(binary_number);
    return "Normal Decimal number: " + number + "\n" + "Binary number in String format: " + binary_number + "\n" + "Binary number after converting to Integer: " + binaryString_to_number;
  }
  public static void main(String[] args) {
    for(int number=0; number<=10; number++) {
      System.out.println(binaryExample(number));
    }
  }
}
