package Seminar3;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

class Books {
  String Name;
  int Price;
  Books(String name, int price) {
    Name = name;
    Price = price;
  }
}

public class bookstore {
  public static void main(String[] args) {
    ArrayList<Books> books = new ArrayList<Books>();
    boolean flag = true;
    Scanner User_value = new Scanner(System.in);
    Scanner User_value1 = new Scanner(System.in);
    while (flag) {
      System.out.println("1: Посмотреть список \n2: Добавить книгу \n3: Удалить книгу ");
      Integer shift = User_value1.nextInt();
      switch (shift) {
        case 1:
          System.out.println("В магазине имеются следующие книги ");
          for (Books b : books) {
            System.out.print("Книга " + b.Name + " стоит " + b.Price + " руб. \n");
          }
          break;
        case 2:
          System.out.println("Укажите название книги ");
          String Namebook = User_value.nextLine();
          System.out.println("Укажите стоимость книги ");
          int pricebook = User_value1.nextInt();
          Books b1 = new Books(Namebook, pricebook);
          books.add(b1);
          break;
        case 3:
          System.out.println("Какую книгу ищем ");
          String Namebook2 = User_value.nextLine();
          for (Books b : books) {
            if (Objects.equals(b.Name, Namebook2)) {
              books.remove(b);
              break;
            }
          }
          break;
        default:
          flag = false;
          break;
      }
    }
    User_value.close();
    User_value1.close();
  }
}
