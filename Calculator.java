// Simple calculator
public class Calculator {
  public Calculator() {
  }

  // add
  public int add(int a, int b) {
    int sum = a + b;
    return sum;
  }

  // subtract
  public int subtract(int a, int b) {
    int difference = a - b;
    return difference;
  }

  // multiply
  public int multiply(int a, int b) {
    int product = a * b;
    return product;
  }

  // divide
  public int divide(int a, int b) {
    int result = a / b;
    return result;
  }

  // modulo
  public int modulo(int a, int b) {
    int calc = a % b;
    return calc;
  }

  public static void main(String[] args) {
    Calculator myCalculator = new Calculator();
    System.out.println(myCalculator.add(5,7));
    System.out.println(myCalculator.subtract(45,11));
    System.out.println(myCalculator.multiply(11,12));
    System.out.println(myCalculator.divide(100,2));
    System.out.println(myCalculator.modulo(7,3));
  }
}
