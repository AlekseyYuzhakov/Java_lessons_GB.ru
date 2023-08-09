package HomeWork5;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class Person implements Comparable<Person> {
  String name;
  String family;
  Integer age;
  String region;

  Person(String name, String family, String region, Integer age) {
    this.name = name;
    this.family = family;
    this.region = region;
    this.age = age;
  }

  public String pullinfo() {
    String temp = "";
    temp = ('"' + name + " " + family + '"' + " " + '<' + region.toUpperCase() + '>' + " " + age.toString() + "y");
    return temp;
  }

  @Override
  public int compareTo(Person o) {
    return this.name.compareTo(o.name);

  }
}

public class homework5 {
  public static void main(String[] args) {
    LinkedList<String> firstList = new LinkedList<String>();
    LinkedList<String> secondList = new LinkedList<String>();
    LinkedList<String> thirdList = new LinkedList<String>();
    Map<Person, LinkedList<String>> phonebook = new HashMap<Person, LinkedList<String>>();
    Person bob = new Person("Bob", "Dilan", "us", 59);
    Person sam = new Person("Samuel", "Riegel", "us", 45);
    Person xerxes = new Person("Xerxes", "Done", "ru", 33);
    firstList.add("+7-920-919-11-12");
    firstList.add("+7-917-916-15-14");
    secondList.add("+7-915-912-10-09");
    secondList.add("+7-912-910-17-19");
    thirdList.add("+7-909-908-19-17");
    phonebook.put(xerxes, thirdList);
    phonebook.put(sam, secondList);
    phonebook.put(bob, firstList);
    phonebook = sortByKeys(phonebook);
    Integer step = 0;
    for (Map.Entry<Person, LinkedList<String>> col : phonebook.entrySet()) {
      step++;
      System.out.printf("%d Запись %s ", step, col.getKey().pullinfo());
      System.out.println(col.getValue().toString().replace('[', ' ').replace(']', ' '));
    }

  }

  public static <K, V> Map<K, V> sortByKeys(Map<K, V> unsortedMap) {
    return new TreeMap<>(unsortedMap);
  }

  public static LinkedList<String> addphone() {
    Scanner input = new Scanner(System.in);
    LinkedList<String> some = new LinkedList<String>();
    Boolean flag = true;
    while (flag) {
      try {
        some.add(input.nextLine());
      } catch (Exception e) {
        System.out.println("Ошибка ввода ");
        flag = false;
        break;
      }
    }
    input.close();
    return some;
  }
}
