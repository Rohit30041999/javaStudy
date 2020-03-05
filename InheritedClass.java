//A child class can extract properties of n parents (Interfaces in case of Java because multiple inheritence is not supported in java using classes).
public class InheritedClass implements Inherit, Inherit1 {

  //here we are just defining the method which is declared in the parent class(or Interface).
  public int returnANumber(int number) {
    return number;
  }
}
