package ui;
import model.*;
import java.util.Scanner;
public class Main {
  public static int[] getData(Scanner sc) {
    int[] data = new int[2];
    System.out.println("Ingrese el primer número entero");
    data[0] = sc.nextInt();
    System.out.println("Ingrese el segundo número entero");
    data[1] = sc.nextInt();
    sc.nextLine();
    return data;
  }

  public static void showData(Scanner sc) {
    int[] data = getData(sc);
    System.out.println("El número mayor es "+Operations.greatest(data[0],data[1]));
    if(Operations.isEven(data[0])) {
      System.out.println("El número "+data[0]+" es par");
    }
    else {
      System.out.println("El número "+data[0]+" no es par");
    }
    if(Operations.isEven(data[1])) {
      System.out.println("El número "+data[1]+" es par");
    }
    else {
      System.out.println("El número "+data[1]+" no es par");
    }
    System.out.println("La suma entre "+data[0]+" y "+data[1]+" es "+Operations.sum(data[0],data[1]));
    System.out.println("La resta entre "+data[0]+" y "+data[1]+" es "+Operations.subtraction(data[0],data[1]));
    System.out.println("La suma de cuadrados entre "+data[0]+" y "+data[1]+" es "+Operations.sumOfSquares(data[0],data[1]));
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    showData(sc);
  }
}
