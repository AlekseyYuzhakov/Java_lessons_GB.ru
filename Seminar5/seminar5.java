
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;


class Techerers {
  String name;
  String surename;

  Techerers(String name, String surename) {
    this.name = name;
    this.surename = surename;
  }

  String Name() {
    return name + " " + surename;
  }
}

class Students {
  String name;
  String surename;

  Students(String name, String surename) {
    this.name = name;
    this.surename = surename;
  }

  String Name() {
    return name + " " + surename;
  }
}

public class seminar5 {
  public static void main(String[] args) {
    // System.out.println("Hello ");
    // Map<Integer, String> st = new HashMap<Integer, String>();
    // st.put(1, "Москва");
    // st.put(2, "Воронеж");
    // st.put(3, "Тюмень");
    // System.out.println(st);
    // System.out.println(st.get(2));
    // Set<Integer> keys = st.keySet();
    // Collection<String> values = st.values();

    // System.out.println(keys);
    // System.out.println(values);

    // Map<Integer, LinkedList<String>> raik = new HashMap<Integer,
    // LinkedList<String>>();
    // LinkedList<String> books = new LinkedList<String>();
    // books.add("A");
    // books.add("B");
    // books.add("C");
    // LinkedList<String> books2 = new LinkedList<String>();
    // books2.add("X");
    // books2.add("Y");
    // books2.add("Z");

    // raik.put(1, books);
    // raik.put(2, books2);

    // System.out.println(raik);

    // System.out.println(raik.get(2).get(2));
    // for (Map.Entry<Integer, String> item : st.entrySet()) {
    // System.out.printf("[Key = %s : Values = %s]",item.getKey(), item.getValue());
    // }

    Map<Techerers, LinkedList<Students>> school = new HashMap<Techerers, LinkedList<Students>>();
    LinkedList<Students> students = new LinkedList<Students>();
    Techerers Dude = new Techerers("Sam", "Samovich");
    students.add(new Students("Иван", "Семёнов"));
    students.add(new Students("Алексей", "Волков"));
    students.add(new Students("Игорь", "Разов"));

    System.out.println(students);

    school.put(Dude, students);

    for (Map.Entry<Techerers, LinkedList<Students>> item : school.entrySet()) {
      System.out.printf("У преподователя %s учатся следующие студенты %s ", item.getKey().Name(), item.getValue());
    }

  }
}

// import java.util.*;

// class Student{
//     String Titles;
//     Integer ClassRoom;
//     Student(String title, Integer classroom){
//         Titles = title;
//         ClassRoom = classroom;
//     }
// }
// class Teachers{
//     String Name;
//     Teachers(String name){
//         Name = name;
//     }
// }

// public class program2 {
//     public static Student AddStudent(){
//         Scanner title = new Scanner(System.in);
//         System.out.print("Введите имя ученика: ");
//         String name = title.nextLine();


//         Scanner classroom = new Scanner(System.in);
//         System.out.print("Введите номер класса: ");
//         Integer c = classroom.nextInt();

//         Student temp = new Student(name, c);
//         title.close();
//         classroom.close();
//         return temp;

//     }
//     public static void main(String[] args) {
        
//         Map<Teachers, LinkedList<Student>> school = new HashMap<>();
//         LinkedList<Student> students1 = new LinkedList<Student>();
//         students1.add(AddStudent());
        
//         school.put(new Teachers("Marina Petriovna"), students1);


//         for(Map.Entry<Teachers, LinkedList<Student>> item : school.entrySet()){
//                 for(Student x :item.getValue()){

//                 System.out.printf("Key = %s, Valuse %s, Class-%s.", item.getKey().Name,x.Titles,x.ClassRoom);
//                 }
//         }

//     }

// }
