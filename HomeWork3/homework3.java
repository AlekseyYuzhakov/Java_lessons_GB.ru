package HomeWork3;

import java.util.Arrays;

public class homework3 {
  public static void main(String[] args) {
    int[] arr = new int[] { 5, 7, 6, 8, 2, 3, 9, 0, 1, 4 };
    arr = mergeSort(arr);
    System.out.println(Arrays.toString(arr));

  }

  public static int[] mergeSort(int[] a) {
    if (a.length <= 1)
      return a;
    int[] left = Arrays.copyOfRange(a, 0, a.length / 2);
    int[] right = Arrays.copyOfRange(a, left.length, a.length);
    return merge(mergeSort(left), mergeSort(right));
  }

  private static int[] merge(int[] left, int[] right) {
    int resIn = 0, leftIn = 0, rightIn = 0;
    int[] result = new int[left.length + right.length];

    while (leftIn < left.length && rightIn < right.length)
      if (left[leftIn] < right[rightIn])
        result[resIn++] = left[leftIn++];
      else
        result[resIn++] = right[rightIn++];

    while (resIn < result.length)
      if (leftIn != left.length)
        result[resIn++] = left[leftIn++];
      else
        result[resIn++] = right[rightIn++];

    return result;
  }
}
