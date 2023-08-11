package HomeWork6;

import java.util.Map;
import java.util.TreeMap;

public class HomeWork6 {
  public static void main(String[] args) {
    Map<String, String> phonebook = new TreeMap<String, String>();
    phonebook.put("79129102233", "Sergey");
    phonebook.put("79129102244", "Sergey");
    phonebook.put("79119125566", "Igor");
    phonebook.put("79139146677", "Peter");
    phonebook.put("79149157788", "Ivan");
    phonebook.put("79159168899", "Lumos");
    phonebook.put("79169179900", "Nox");

    System.out.println(phonebook);
    Integer step = 0;
    for (Map.Entry<String, String> some : phonebook.entrySet()) {
      step++;
      System.out.printf("Record # %s + %s telNumber for %s", step, some.getKey(), some.getValue());
      System.out.println();

    }

  }
}
