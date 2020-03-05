public class Main {
  public static void main(String[] args) {
    //Consider these numbers as examples to understand the multiple and hierarchal inheritance. 
    int thatNumber = 23;
    int thatNumber1 = 231;
    int thatNumber2 = 123;
    int thatNumber3 = 12345;

    //child(InheritedClass) extracting(inherit) the properties of parent(InheritInterface).
    InheritInterface newIn = new InheritedClass();

    //same thing happens in the following object creations.
    Inherit1Interface newInherit = new InheritedClass();
    Inherit newIn1 = new Inherited1Class();
    Inherit newIn2 = new Inherited2Class();

    //Applying the methods declared in the parents.
    Integer number = newIn.returnANumber(thatNumber);
    Integer number1 = newIn1.returnANumber(thatNumber1);
    Integer number2 = newIn2.returnANumber(thatNumber2);
    Integer number3 = newInherit.returnANumber(thatNumber3);

    //Checking weather the applied method working correctly or not.
    System.out.println(number);
    System.out.println(number1);
    System.out.println(number2);
    System.out.println(number3);
  }
}
