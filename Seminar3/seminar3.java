package Seminar3;

import java.util.ArrayList;

class People {
  String Name;
  Integer Age;

  People(String name, Integer age) {
    Name = name;
    Age = age;
  }
}

public class seminar3 {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("Some");
    list.add("Three some)");
    list.add(1, "Two some");
    System.out.println(list);
    System.out.println(list.get(1));
    for (String string : list) {
      System.out.println("Hello " + string);
    }
    if (list.contains("Some")) {
      System.out.println("Hello Some");
    } else {
      System.out.println("Нет Some");
    }
    System.out.println(list.size());
    list.remove("Some");
    System.out.println(list);
    ArrayList<People> people = new ArrayList<>();
    People p1 = new People("Vlad", 15);
    People p2 = new People("Dima", 27);
    people.add(p1);
    people.add(p2);
    for (People p : people) {
      System.out.println("Имя " + p.Name + " Возраст " + p.Age);
    }

  }
}
