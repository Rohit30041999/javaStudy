/*
Some Collections: >>
*/

import java.io.*;
import java.util.*;
import java.lang.*;
class SomeCollections {

  private static Stack<Integer> returnStack() {
    Stack<Integer> stack = new Stack<Integer>();
    for (Integer i = 1; i <= 15; ++i) {
      if (i % 2 == 0) stack.push(i * i);
      else if (!stack.isEmpty()) stack.pop();
      // else if (stack.isEmpty()) stack.push(i + i);
    }
    return stack;
  }

  private static Queue<Integer> returnMaxQueue() {
    Queue<Integer> maxHeap = new PriorityQueue<Integer>((a, b) -> b - a);
    for (Integer i = 1; i <= 10; ++i) {
      if (i % 2 == 0) maxHeap.add(i * i);
      else maxHeap.add(i + i);
    }
    return maxHeap;
  }

  private static Queue<Integer> returnMinQueue() {
    Queue<Integer> minHeap = new PriorityQueue<Integer>();
    for (Integer i = 1; i <= 10; ++i) {
      if (i % 2 == 0) minHeap.add(i * i);
      else minHeap.add(i + i);
    }
    return minHeap;
  }

  private static List<Integer> returnArrayList(){
    Integer[] arr = new Integer[10];
    for (int i = 0; i < 10; ++i) {
      if (i % 2 == 0) arr[i] = i * i;
      else arr[i] = i + i;
    } 
    return Arrays.asList(arr);
  }
  public static void main(String[] args) {
    List<Integer> arr = returnArrayList();
    Queue<Integer> maxHeap = returnMaxQueue();
    Queue<Integer> minHeap = returnMinQueue();
    Stack<Integer> stack = returnStack();
    System.out.println(stack);
    System.out.println(arr);
    System.out.println(maxHeap);
    System.out.println(minHeap);
  }
}
