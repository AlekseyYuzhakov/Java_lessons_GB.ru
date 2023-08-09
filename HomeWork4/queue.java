package HomeWork4;

import java.util.LinkedList;

class MyQueue<T> {
  LinkedList<T> ll = new LinkedList<T>();

  public void enqueue(T element) {
    ll.add(element);
  }

  public T dequeue() {
    return ll.removeFirst();
  }

  public T first() {
    return ll.getFirst();

  }

  public LinkedList<T> getElements() {
    return ll;

  }
}

public class queue {
  public static void main(String[] args) {
    MyQueue<Integer> queue;
    queue = new MyQueue<>();
    queue.enqueue(1);
    queue.enqueue(10);
    queue.enqueue(15);
    queue.enqueue(5);
    System.out.println(queue.getElements());
    queue.dequeue();
    queue.dequeue();
    System.out.println(queue.getElements());
    System.out.println(queue.first());
  }

}
