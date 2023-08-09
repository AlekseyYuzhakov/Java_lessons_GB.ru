package HomeWork3;

import java.util.Arrays;

public class removeeven {
  public static void main(String[] args) {
    Integer[] arr = {};
    arr = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    removeEvenNumbers(arr);
  }

  public static void removeEvenNumbers(Integer[] arr) {
    int countint = 0;
    for (Integer integer : arr) {
      if (integer % 2 != 1) {
        countint++;
      }
    }
    Integer[] tempArr = new Integer[countint];
    int step = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 != 1) {
        tempArr[step] = arr[i];
        step++;
      }
    }
    System.out.println(Arrays.toString(tempArr));
  }
}
