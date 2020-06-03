import java.util.*;

// util (utility) package contains the methods and class related to streams API.
import java.util.stream.*;

class MyStream {

  public void applyBasicStreamMethodsOnIntegers(List<Integer> listOfIntegerElements) {

    System.out.println("Integer values: ");
    System.out.println();

    List<Integer> myList = listOfIntegerElements;

    System.out.println("Original List: " + myList);

    // Basic stream. Getting a stream of values from the list.
    Stream<Integer> myStream = myList.stream();

    System.out.println("Stream of values or elements from a list: ");

    myStream.forEach((element) -> System.out.print(element + " "));

    System.out.println();

    // sorted stream.
    Stream<Integer> sortedStream = myList.stream().sorted();

    System.out.println("Sorted Stream of elements: ");

    sortedStream.forEach((element) -> System.out.print(element + " "));

    System.out.println();

    // filtered stream. Filtering the odd elements.
    Stream<Integer> filteredStream = myList.stream().sorted().filter((element) -> element%2 == 1);

    System.out.println("Filtered Stream of values or elements: ");

    filteredStream.forEach((element) -> System.out.print(element + " "));

    System.out.println();

    // accessing the min element using Optional<T> Generic class.
    Stream<Integer> myStream1 = myList.stream();

    System.out.println("Min Element of the stream of element: ");

    Optional<Integer> minElement = myStream1.min(Integer::compare);

    if(minElement.isPresent()) System.out.println(minElement.get());

    // accessing the max element using Optional<T> Generic class.
    Stream<Integer> myStream2 = myList.stream();

    System.out.println("Max Element of the stream of element: ");

    Optional<Integer> maxElement = myStream2.max(Integer::compare);

    if(maxElement.isPresent()) System.out.println(maxElement.get());

    System.out.println("---------------------------------------------");

    /*
    
      Note: As you can observe we creating new instance for the stream every time we are getting the stream of elements from the list provided. Because after the usage of the stream the there will no value will be present in stream. (that stream can be used only for one time. We need to form another stream from the list provided to use or iterate over the list). 
    
    */
  }

  public void applyBasicStreamMethodsOnDoubles(List<Double> listOfIntegerElements) {

    System.out.println("Double point values: ");
    System.out.println();

    List<Double> myList = listOfIntegerElements;

    System.out.println("Original List: " + myList);

    // Basic stream. Getting a stream of values from the list.
    Stream<Double> myStream = myList.stream();

    System.out.println("Stream of values or elements from a list: ");

    myStream.forEach((element) -> System.out.print(element + " "));

    System.out.println();

    // sorted stream.
    Stream<Double> sortedStream = myList.stream().sorted();

    System.out.println("Sorted Stream of elements: ");

    sortedStream.forEach((element) -> System.out.print(element + " "));

    System.out.println();

    // filtered stream. Filtering the odd elements.
    Stream<Double> filteredStream = myList.stream().sorted().filter((element) -> element%2 == 1);

    System.out.println("Filtered Stream of values or elements: ");

    filteredStream.forEach((element) -> System.out.print(element + " "));

    System.out.println();

    // accessing the min element using Optional<T> Generic class.
    Stream<Double> myStream1 = myList.stream();

    System.out.println("Min Element of the stream of element: ");

    Optional<Double> minElement = myStream1.min(Double::compare);

    if(minElement.isPresent()) System.out.println(minElement.get());

    // accessing the max element using Optional<T> Generic class.
    Stream<Double> myStream2 = myList.stream();

    System.out.println("Max Element of the stream of element: ");

    Optional<Double> maxElement = myStream2.max(Double::compare);

    if(maxElement.isPresent()) System.out.println(maxElement.get());

    System.out.println("---------------------------------------------");

    /*
    
      Note: As you can observe we creating new instance for the stream every time we are getting the stream of elements from the list provided. Because after the usage of the stream the there will no value will be present in stream. (that stream can be used only for one time. We need to form another stream from the list provided to use or iterate over the list). 
    
    */
  }

  public void applyBasicStreamMethodsOnLongValues(List<Long> listOfIntegerElements) {

    System.out.println("Long integer values: ");
    System.out.println();

    List<Long> myList = listOfIntegerElements;

    System.out.println("Original List: " + myList);

    // Basic stream. Getting a stream of values from the list.
    Stream<Long> myStream = myList.stream();

    System.out.println("Stream of values or elements from a list: ");

    myStream.forEach((element) -> System.out.print(element + " "));

    System.out.println();

    // sorted stream.
    Stream<Long> sortedStream = myList.stream().sorted();

    System.out.println("Sorted Stream of elements: ");

    sortedStream.forEach((element) -> System.out.print(element + " "));

    System.out.println();

    // filtered stream. Filtering the odd elements.
    Stream<Long> filteredStream = myList.stream().sorted().filter((element) -> element%2 == 1);

    System.out.println("Filtered Stream of values or elements: ");

    filteredStream.forEach((element) -> System.out.print(element + " "));

    System.out.println();

    // accessing the min element using Optional<T> Generic class.
    Stream<Long> myStream1 = myList.stream();

    System.out.println("Min Element of the stream of element: ");

    Optional<Long> minElement = myStream1.min(Double::compare);

    if(minElement.isPresent()) System.out.println(minElement.get());

    // accessing the max element using Optional<T> Generic class.
    Stream<Long> myStream2 = myList.stream();

    System.out.println("Max Element of the stream of element: ");

    Optional<Long> maxElement = myStream2.max(Double::compare);

    if(maxElement.isPresent()) System.out.println(maxElement.get());

    System.out.println("---------------------------------------------");

    /*
    
      Note: As you can observe we creating new instance for the stream every time we are getting the stream of elements from the list provided. Because after the usage of the stream the there will no value will be present in stream. (that stream can be used only for one time. We need to form another stream from the list provided to use or iterate over the list). 
    
    */
  }

}

public class Streams {
  public static void main(String[] args) {

    List<Integer> integers = new ArrayList<>();
    integers.add(7);
    integers.add(16);
    integers.add(1);
    integers.add(90);
    integers.add(4);

    List<Double> doubles = new ArrayList<>();
    doubles.add(7.45);
    doubles.add(16.89);
    doubles.add(1.9);
    doubles.add(7.46);
    doubles.add(7.47);

    // to add long numbers into Long valued List provide or mention 'L' 
    // at the end of the number in JAVA. Example: long number = 3464564756765767L.
    List<Long> longerIntegers = new ArrayList<>();
    longerIntegers.add(782377657865L);
    longerIntegers.add(Long.MAX_VALUE-(long)10);
    longerIntegers.add(83579695865L);
    longerIntegers.add(45L);
    longerIntegers.add(689999L);
    longerIntegers.add(40000000000L);

    MyStream myStreamReference = new MyStream();

    // Streams for Doubles.
    myStreamReference.applyBasicStreamMethodsOnDoubles(doubles);

    // Streams for Integers.
    myStreamReference.applyBasicStreamMethodsOnIntegers(integers);
    
    // Streams for Longer (Long) Integers.
    myStreamReference.applyBasicStreamMethodsOnLongValues(longerIntegers);
  }
}
