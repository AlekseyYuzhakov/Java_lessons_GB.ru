package HomeWork3;

import java.util.Arrays;

public class analizarr {
  public static void main(String[] args) {
    Integer[] arr = {};
    arr = new Integer[] { 4, 2, 7, 5, 1, 3, 8, 6, 9 };
    analyzeNumbers(arr);
  }

  public static void analyzeNumbers(Integer[] arr) {
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
    System.out.println("Minimum is " + arr[0]);
    System.out.println("Maximum is " + arr[arr.length - 1]);
    int Average = 0;
    int sum = 0;
    for (Integer integer : arr) {
      sum = sum + integer;
    }
    Average = sum / arr.length;
    System.out.println("Average  is " + Average);
  }
}
