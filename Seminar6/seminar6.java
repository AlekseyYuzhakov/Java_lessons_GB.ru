public class seminar6 {
  public static void main(String[] args) {
    System.out.println("Hello ");



  }
}
// // Общий метод для сортировки карты по ключам с помощью `TreeMap`
//     public static <K, V> Map<K, V> sortByKeys(Map<K, V> unsortedMap)
//     {
//         // создать `TreeMap` из заданной карты и вернуть ее
//         return new TreeMap<>(unsortedMap);
//     }
 
//     public static void main(String[] args)
//     {
//         Map<String, String> country = new HashMap<>();
 
//         country.put("India", "New Delhi");
//         country.put("USA", "Washington D.C.");
//         country.put("Japan", "Tokyo");
//         country.put("China", "Beijing");
 
//         country = sortByKeys(country);
//         System.out.println("Sorted map by keys :\n" + country);
//     }

// import java.util.*;
// class Book{
//   String Name;
//   String A;
//   Integer Size;
//   Book(String name,String a,Integer size){
//     Name = name;
//     A = a;
//     Size = size;
//   }
//   public void Open(){
//     System.out.println("open is book " + Name);
//   }
//   public Integer GetSize(){
//     return Size;
//   }
// }

// class Main {
//   public static void main(String[] args) {
//     Map<String, String> states = new HashMap<String, String>();
//     states.put("Rus","Moscow"); 
//     states.put("Ger","CE");
//     states.put("Yam","RE");
//     System.out.println(states.get("Rus"));
//      // получим весь набор ключей
//     Set<String> keys = states.keySet();
//     // получить набор всех значений
//     Collection<String> values = states.values();
//     System.out.println(keys);
    
//     System.out.println(values);

//     Map<Integer, LinkedList<Book>> rack = new HashMap<Integer, LinkedList<Book>>();
//     LinkedList<Book> books = new LinkedList<Book>();
//     books.add(new Book("a","b",15));
//     books.add(new Book("c","b",15));
//     books.add(new Book("b","b",15));
// LinkedList<Book> books2 = new LinkedList<Book>();
//     books2.add(new Book("D","A",151));
//     books2.add(new Book("E","A",1));
//     books2.add(new Book("F","A",152));

// rack.put(1, books);
    
// rack.put(2, books2);
    
// System.out.println(rack.get(2));
   
//     for(Map.Entry<Integer, LinkedList<Book>> item :rack.entrySet()){
//       for(Book bookFor : item.getValue()) {
//         System.out.printf("Key = %s Value %s ",item.getKey(), bookFor.Name);
//         bookFor.Open();
//         System.out.println(bookFor.GetSize());
//       }
      
//     }
    
//   }
// }
