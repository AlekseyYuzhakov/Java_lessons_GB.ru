package Seminar2;

import java.io.*;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class seminar2 {
  public static void main(String[] args) {
    ArrayList<String> words = ReadFile();
    Scanner input = new Scanner(System.in);
    Boolean flag = true;
    while (flag) {
      String result = input.nextLine();
      if (Objects.equals(result, "start")) {
        System.out.println("Запущена запись лога ");
        while (flag) {
          result = input.nextLine();
          if (Objects.equals(result, "end")) {
            flag = false;
            Writefile(words);
            break;
          }
          words.add(result);
          System.out.println(words);
        }
      }
    }
    input.close();
  }

  public static void Writefile(ArrayList<String> words) {
    try (BufferedWriter bw = new BufferedWriter(new FileWriter("Seminar2/Seminar2.txt"))) {
      for (String item : words) {
        bw.append(item);
        bw.append("\n");
      }
    } catch (IOException ex) {
      System.out.println(ex.getMessage());
    }
  }

  public static ArrayList<String> ReadFile() {
    ArrayList<String> words = new ArrayList<String>();
    try (BufferedReader br = new BufferedReader(new FileReader("Seminar2/Seminar2.txt"))) {
      String c;
      while ((c = br.readLine()) != null) {
        words.add(c);
      }
    } catch (IOException ex) {
      System.out.println(ex.getMessage());
    }
    return words;
  }

  public static Integer ask_user_Integer(String msg) {
    System.out.print(msg);
    Scanner input = new Scanner(System.in);
    Integer result = input.nextInt();
    input.close();
    return result;
  }
}

// import java.io.BufferedWriter;
// import java.io.FileWriter;
// import java.io.IOException;
// import java.util.Objects;
// import java.util.Scanner;

// public class program2 {

// public static void WriteFile(String action){
// try(BufferedWriter bw = new BufferedWriter(new
// FileWriter("Client.txt",false))){
// bw.write(action);

// }
// catch(IOException ex){
// System.out.println("Error");
// }
// }

// public static void main(String[] args) {
// Scanner in = new Scanner(System.in);
// System.out.println("Введите start если хотите что то записать");
// boolean flag = false;
// while (true){
// String action = in.nextLine();
// if (Objects.equals(action, "start") || flag){
// flag = true;
// WriteFile(action);
// continue;
// }
// }
// }
// }