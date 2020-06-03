import java.util.*;

import java.util.Random;

class MyRandom {

  // method to get a random Integer value within the given range from 0.
  public int getRandomIntegerValueWithinRange(int upperValue) {

    Random randomReference = new Random();

    return randomReference.nextInt(upperValue);

  }

  // method to get a random Integer value.
  public int getRandomIntegerValue() {

    Random randomReference = new Random();

    return randomReference.nextInt();

  }


  // method to get a random Boolean value.
  public boolean getRandomBooleanValue() {
    
    Random randomReference = new Random();

    return randomReference.nextBoolean();

  }

  // method to get a random Long value.
  public long getRandomLongValue() {
    
    Random randomReference = new Random();

    return randomReference.nextLong();

  }

  // method to get a random Double value.
  public double getRandomDoubleValue() {
    
    Random randomReference = new Random();

    return randomReference.nextDouble();

  }

  // method to get a random Float value.
  public float getRandomFloatValue() {
    
    Random randomReference = new Random();

    return randomReference.nextFloat();

  }

}

public class RandomsModule {
  public static void main(String[] args) {

    // Random Methods.

    MyRandom myRandom = new MyRandom();

    System.out.println("All Basic Random module methods :");
    System.out.println();

    System.out.print("Random integer within the range (0, number) : ");
    System.out.println(myRandom.getRandomIntegerValueWithinRange(24));
    System.out.println();

    System.out.print("Random integer value : ");
    System.out.println(myRandom.getRandomIntegerValue());
    System.out.println();

    System.out.print("Random positive integer value : ");
    int randomInteger = myRandom.getRandomIntegerValue();
    System.out.println((randomInteger < 0) ? randomInteger*(-1) : randomInteger);
    System.out.println();

    System.out.print("Random Boolean Value : ");
    System.out.println(myRandom.getRandomBooleanValue());
    System.out.println();

    System.out.print("Random Double Value : ");
    System.out.println(myRandom.getRandomDoubleValue());
    System.out.println();

    System.out.print("Random Float Value : ");
    System.out.println(myRandom.getRandomFloatValue());
    System.out.println();

    System.out.print("Random Long Value : ");
    System.out.println(myRandom.getRandomLongValue());
    System.out.println();

  }
}
