package HomeWork4;

import java.util.LinkedList;

public class homework4 {
  public static void main(String[] args) {
    LinkedList<Object> ll = new LinkedList<Object>();
    ll.add(1);
    ll.add("One");
    ll.add(2);
    ll.add("Two");
    ll.add(3);
    ll.add("Three");
    ll.add(4);
    ll.add("Four");
    System.out.println(ll);
    System.out.println(ll.size());
    System.out.println(revert(ll));
  }

  public static LinkedList<Object> revert(LinkedList<Object> ll) {
    LinkedList<Object> lltemp = new LinkedList<Object>();
    int size = ll.size();
    for (int i = 0; i < size; i++) {
      lltemp.add(ll.removeLast());
    }
    return lltemp;
  }

}
