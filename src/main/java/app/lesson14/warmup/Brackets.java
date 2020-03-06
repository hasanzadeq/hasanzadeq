package app.lesson14.warmup;

public class Brackets {

  public int calc(String text) {

      int ob = 0;
      int cnt = 0;


      for (int i = 0; i < text.length()-1; i++) {

        if (text.charAt(i) == '(' && text.charAt(i+1) == ')') {
          cnt=1;
          continue;

        }
        else if (text.charAt(i) == '(')
          ob++;


      }
      return ob+cnt;

  }

}
