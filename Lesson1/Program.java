package Lesson1;

import java.util.Scanner;

public class Program {

  public static void main(String[] args) {
    System.out.printf("Введдите степень числа ");
    Scanner User_value = new Scanner(System.in);
    int power_sacale = User_value.nextInt();
    User_value.close();
    for (int i = 0; i < 11; i++) {
      System.out.println(Math.pow(i, power_sacale));
    }
    
    System.out.println(factorial(5));
  }

  static double factorial(int n){
    if (n == 1) return 1;
     return n*factorial(n-1);
  }

}
