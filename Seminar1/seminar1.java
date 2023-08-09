package Seminar1;

import java.util.Random;
import java.util.Scanner;

public class seminar1 {
  public static void main(String[] args) {
    // Integer[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    // for (Integer item : array) {
    // System.out.print(item);
    // }
    // Integer number=Integer.valueOf(15);
    // System.out.println(number.getClass().getName());
    guess_number(5);
  }

  static void guess_number(int n) {
    Scanner input = new Scanner(System.in);
    Boolean flag = true;
    Integer lives = n;
    while (flag) {
      System.out.print("Количество жизней ");
      System.out.println(lives);
      System.out.println("Введите цифру от 0 до 9");
      Integer number = input.nextInt();
      Integer gues_number = new Random().nextInt(0, 10);
      if (number == gues_number) {
        System.out.println("Вы угадали цифру ");
        System.out.printf("Осталось попыток %d", lives);
        flag = false;
      } else {
        lives--;
        System.out.println("Вы потеряли 1 попытку ");
      }
      if (lives == 0) {
        System.out.println("У вас не осталос попыток");
        flag = false;
      }
    }
    input.close();
  }
}

// Scanner in = new Scanner(System.in);
// System.out.print("Input data: ");
// int num = 5;
// int countNum = 3;
// for (int i = 0; countNum > i; countNum--) {
// Integer number = in.nextInt();
// System.out.println();
// if (number == num) {
// System.out.println("You guessed the number");
// break;
// }
// else{
// Integer count = countNum - 1;
// System.out.println("You have" +count + "attempts");
// }
// }
// System.out.println("You didn't guess the number");
// }
// }