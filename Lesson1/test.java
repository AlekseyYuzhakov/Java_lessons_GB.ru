package Lesson1;

public class test {
  public static void main(String[] args) {
    class Calculator {
      public int calculate(char op, int a, int b) {
        switch (op) {
          case ('+'):
            return a + b;
          case ('-'):
            return a - b;
          case ('*'):
            return a * b;
          case ('/'):
            return a / b;
          default:
            return 0;
        }
      }
    }
    int a = 0;
    char op = ' ';
    int b = 0;

    if (args.length == 0) {
      // При отправке кода на Выполнение, вы можете варьировать эти параметры
      a = 7;
      op = '/';
      b = 7;
    } else {
      a = Integer.parseInt(args[0]);
      op = args[1].charAt(0);
      b = Integer.parseInt(args[2]);
    }

    Calculator calculator = new Calculator();
    int result = calculator.calculate(op, a, b);
    System.out.println(result);
  }
}
