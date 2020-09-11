package model;

public class Operations {

  public static int sum(int num1, int num2) {
    int result = 0;
    result = num1 + num2;
    return result;
  }

  public static int subtraction(int num1, int num2) {
    int result = 0;
    result = num1 - num2 ;
    return result;
  }

  public static int greatest(int num1, int num2) {
    int result = 0;
    if(num1 > num2) {
      result = num1;
    }
    else {
      result = num2;
    }
    return result;
  }

  public static boolean isEven(int num) {
    boolean result = num%2 == 0;
    return result;
  }

  public static int sumOfSquares(int num1, int num2) {
    int result = num1*num1+num2*num2;
    return result;
  }
}
