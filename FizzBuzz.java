import java.util.ArrayList;
import java.util.Collections;

public class FizzBuzz {
  
  public static String InsertFezz(String cur) {

    StringBuffer curBuffer = new StringBuffer(cur);

    char[] chars = cur.toCharArray();

    boolean foundB = false;

    for (int i = 0; i < cur.length(); i++) {

      if (chars[i] == "B".charAt(0)) {
        foundB = true;
        curBuffer.insert(i, "Fezz");
        break;
      }

    }

    if (!foundB) {
      curBuffer.append("Fezz");
    }

    return curBuffer.toString();

  }

  public static String Reverse(String cur) {

    ArrayList<String> wordList = new ArrayList<String>();
    char[] chars = cur.toCharArray();
    int start = -1;
    boolean started = false;

    for (int i = 0; i < cur.length(); i++) {

      if (Character.isUpperCase(chars[i])) {

        if (!started) {
          started = true;
          start = i;
        }
        else {
          wordList.add(cur.substring(start, i));
          started = false;
          start = i;
        }

      }

    }

    if (cur.length() > 0) {
      wordList.add(cur.substring(start, cur.length()));
    }

    Collections.reverse(wordList);

    String result = "";

    for (String item : wordList) {
      result += item;
    }

    return result;

  }

  public static void main(String []args) {

		for (int i = 1; i <= 255; i++) {

      String out = "";

      if (i % 11 == 0) { 
        out += "Bong";
      }
      else if (i % 3 == 0 && i % 5 == 0) {   // MULTIPLES 3 + 5
        out += "FizzBuzz";
      }
      else if (i % 3 == 0) {            // MULTIPLES 3
        out += "Fizz";
      }
      else if (i % 5 == 0) {            // MULTIPLES 5
        out += "Buzz";
      }

      if (i % 7 == 0) {            // MULTIPLES 7
        out += "Bang";
      }

      if (i % 13 == 0) {
        out = InsertFezz(out);
      }

      if (i % 17 == 0) {            
        out = Reverse(out);
      }

      if (out == "") {
        out = Integer.toString(i);
      }

      System.out.println(out);

		}

  }

}