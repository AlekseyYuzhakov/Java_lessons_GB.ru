package HomeWork2;


class Answer {
  public  static StringBuilder answer(String QUERY, String PARAMS) {
    StringBuilder temp = new StringBuilder("");
    temp.append(QUERY);
    PARAMS = PARAMS.replace('"', '{');
    PARAMS = PARAMS.replace(',', '{');
    PARAMS = PARAMS.replace("{", "");
    PARAMS = PARAMS.replace("}", "");
    String[] str = PARAMS.split(" ");
    for (String line : str) {
      String[] quick = line.split(":");
      if (quick[1].equals("null")) {
        temp.delete(temp.length() - 5, temp.length());
        break;
      } else {
        temp.append(quick[0]);
        temp.append("=");
        temp.append("'");
        temp.append(quick[1]);
        temp.append("'");
        temp.append(" and ");
      }
    }
    return temp;
  }
}

// select * from students where name='Ivanov' and country='Russia' and
// city='Moscow'
public class jstring {
  public static void main(String[] args) {
    String QUERY = "";
    String PARAMS = "";
    QUERY = "select * from students where ";
    PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
    
    System.out.println(Answer.answer(QUERY, PARAMS));

  }
}
