package Seminar4;

import java.util.LinkedList;
import java.util.Scanner;

public class seminar4 {
  public static void main(String[] args) {
    Scanner User_value = new Scanner(System.in);
    boolean flag = true;
    LinkedList<String> list = new LinkedList<String>();
    while (flag) {
      String input = User_value.nextLine();
      String[] inputMass = input.split("~");
      Integer num = Integer.parseInt(inputMass[1]);
      if (inputMass[0].equals("print")) {
        System.out.println(list.get(num));
        list.remove(list.get(num));
      } else {
        list.add(num, inputMass[0]);
        System.out.println(list);
      }
    }
    User_value.close();
  }
}

// import java.util.Arrays;
// import java.util.Collections;
// import java.util.LinkedList;
// import java.util.List;
// import java.util.Scanner;

// public class Practic4 {
//     public static void main(String[] args) {
//         LinkedList<String> textList = new LinkedList<>();
//         Scanner textIn = new Scanner(System.in);

//         while(true) {
//             String text = textIn.nextLine();
//             String [] textSplit = text.split("~");
//             Integer num = Integer.parseInt(textSplit[1]);
//             if (textSplit[0].equals("print")) {
//                 System.out.println(textList.get(num));
//                 textList.remove(textList.get(num));
//             }
//             else if (textSplit[0].equals("0")) {
//                 break;
//             }
//             else {
//                 Collections.sort(textList);
//                 textList.add(num, textSplit[0]);
//                 System.out.println(textList);
//             }
//         }
//         textIn.close();
//     }
// }
