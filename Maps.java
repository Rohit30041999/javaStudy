/*
Collections : Maps : >>>
*/

import java.io.*;
import java.util.*;
import java.lang.*;
class Maps {
  public static void main(String[] args) {

    // HashMap : keys randomized order.

    Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
    hm.put(3, 1);
    hm.put(12, 1);
    hm.put(22, 1);
    hm.put(78, 1);
    hm.put(51, 1);
    for (Map.Entry<Integer, Integer> entry: hm.entrySet()) {
      System.out.println(entry.getKey() + " => " + entry.getValue());
    }

    for (Integer i: hm.keySet()) {
      System.out.println(i);
    }

    for (Integer v: hm.values()) {
      System.out.println(v);
    }
    // LinkedHashMap : keys inserted order.

    Map<Integer, Integer> lhm = new LinkedHashMap<Integer, Integer>();
    lhm.put(3, 9);
    lhm.put(12, 9);
    lhm.put(22, 9);
    lhm.put(78, 9);
    lhm.put(51, 9);

    for (Map.Entry<Integer, Integer> entry: lhm.entrySet()) {
      System.out.println(entry.getKey() + " => " + entry.getValue());
    }

    for (Integer i: lhm.keySet()) {
      System.out.println(i);
    }

    for (Integer v: lhm.values()) {
      System.out.println(v);
    }

    // TreeMap : keys sorted order.

    Map<Integer, Integer> thm = new TreeMap<Integer, Integer>();
    thm.put(3, 2);
    thm.put(12, 2);
    thm.put(22, 2);
    thm.put(78, 2);
    thm.put(51, 2);

    for (Map.Entry<Integer, Integer> entry: thm.entrySet()) {
      System.out.println(entry.getKey() + " => " + entry.getValue());
    }

    for (Integer i: thm.keySet()) {
      System.out.println(i);
    }

    for (Integer v: thm.values()) {
      System.out.println(v);
    }
  }
}
