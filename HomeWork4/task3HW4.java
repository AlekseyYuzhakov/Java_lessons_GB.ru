package HomeWork4;

import java.util.ArrayDeque;

class Calculator {
  ArrayDeque<Integer> qu = new ArrayDeque<Integer>();

  public int calculate(char op, int a, int b) {
    int some = 0;
    switch (op) {
      case ('+'):
        some = a + b;
        qu.add(some);
        return some;
      case ('-'):
        some = a - b;
        qu.add(some);
        return some;
      case ('*'):
        some = a * b;
        qu.add(some);
        return some;
      case ('/'):
        some = a / b;
        qu.add(some);
        return some;
      case ('<'):
        qu.removeLast();
        some = qu.getLast();
        return some;
      default:
        return 0;
    }
  }
}

public class task3HW4 {
  public static void main(String[] args) {
    int a, b, c, d;
    char op, op2, undo;
    a = 3;
    op = '+';
    b = 7;
    c = 4;
    op2 = '+';
    d = 7;
    undo = '<';

    Calculator diCalculator = new Calculator();
    int result = diCalculator.calculate(op, a, b);
    System.out.println(result);
    int result2 = diCalculator.calculate(op2, c, d);
    System.out.println(result2);
    int prevResult = diCalculator.calculate(undo, 0, 0);
    System.out.println(prevResult);

  }
}
