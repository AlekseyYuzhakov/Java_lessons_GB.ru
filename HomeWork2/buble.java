package HomeWork2;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;


public class buble {
  public static void main(String[] args) {
    int[] arr = {};
    arr = new int[] { 9, 4, 8, 3, 1 };

    System.out.println(Arrays.toString(arr));
    sort(arr);
    System.out.println(Arrays.toString(arr));
  }
  
  public static void sort(int[] mas) {
    writeLog(mas);
    int temp = 0;
    for (int i = 0; i < mas.length - 1; i++) {
      for (int j = 0; j < mas.length - 1 - i; j++) {
        if (mas[j] > mas[j + 1]) {
          temp = mas[j + 1];
          mas[j + 1] = mas[j];
          mas[j] = temp;
        }
      }
      writeLog(mas);
    }
  }

  public static void writeLog(int[] arr) {
    try {
      FileWriter fileWriter = new FileWriter("log.txt", true);
      LocalDateTime now = LocalDateTime.now();
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
      String formattedDate = now.format(formatter);
      String logEntry = formattedDate + " " + java.util.Arrays.toString(arr) + "\n";
      fileWriter.write(logEntry);
      fileWriter.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
