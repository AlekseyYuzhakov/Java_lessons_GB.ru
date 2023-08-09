import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class homework {

  static class Equation {
    public String getSolution(String str) {
      ArrayList<String> exemple = ReadFile();
      String temp = "";
      String[] tempMass = new String['a'];
      for (String item : exemple) {
        temp = item;
        tempMass = temp.split(" ");
      }
      System.out.printf("Given the equation: %s", temp + "\n");
      Integer[] a = new Integer[21];
      int step = 0;
      for (String elem : tempMass) {
        if (elem.contains("?")) {
          for (int i = 0; i < 10; i++) {
            int ex = Integer.parseInt(elem.replaceAll("\\?", Integer.toString(i)));
            a[step] = ex;
            step++;
          }
        }
      }
      a[20] = Integer.parseInt(tempMass[4]);
      step = 0;
      for (int i = 0; i < 10; i++) {
        for (int j = 10; j < 20; j++) {
          if (a[i] + a[j] == a[20]) {
            str = a[i].toString() + " + " + a[j].toString() + " = " + a[20].toString();
          }
        }
      }
      return str;
    }
  }

  // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
  public class Printer {
    public static void main(String[] args) {
      String file = "";

      if (args.length == 0) {
        file = "input.txt";
      } else {
        file = args[0];
      }

      Equation eq = new Equation();
      String result = eq.getSolution(file);
      System.out.println(result);
    }

  }

  public static ArrayList<String> ReadFile() {
    ArrayList<String> words = new ArrayList<String>();
    try (BufferedReader br = new BufferedReader(new FileReader("HomeWork1/input.txt"))) {
      String c;
      while ((c = br.readLine()) != null) {
        words.add(c);
      }
    } catch (IOException ex) {
      System.out.println(ex.getMessage());
    }
    return words;
  }
}

// В файле задано уравнение вида q + w = e (q, w, e >= 0). Некоторые цифры могут
// быть заменены знаком вопроса, например 2? + ?5 = 69.
// Восстановите выражение до верного равенства.
// Предложите хотя бы одно решение или сообщите, что его нет.
// Напишите класс Equation, содержащий метод getSolution, который будет
// считывать уравнение из файла и восстановит его до верного равенства.
// Выведите сначала строку формата "Given the equation: {выражение из файла}".
// А затем верните строку формата "Result: {цельное выражение}".
// Если выражение не имеет решений - верните строку "No solution".
// Пример
// Given the equation: ? + 4 = 9
// Result: 5 + 4 = 9
