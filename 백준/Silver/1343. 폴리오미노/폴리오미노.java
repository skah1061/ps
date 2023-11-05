import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();
    StringBuilder sb = new StringBuilder();
    char[] charArray = str.toCharArray();
    int cnt = 0;
    for (int i = 0; i < charArray.length; i++) {
      if (charArray[i] == '.') {
        int AAAA = cnt / 4;
        int BB = (cnt % 4) / 2;
        if ((cnt % 4) % 2 != 0) {
          sb.setLength(0);
          sb.append(-1);
          break;
        }
        for (int a = 0; a < AAAA; a++) {
          sb.append("AAAA");
        }
        for (int b = 0; b < BB; b++) {
          sb.append("BB");
        }
        cnt = 0;

          sb.append(".");

        continue;
      }
      cnt++;
    }
    if (cnt != 0) {
      int AAAA = cnt / 4;
      int BB = (cnt % 4) / 2;
      if ((cnt % 4) % 2 != 0) {
        sb.setLength(0);
        sb.append(-1);
      } else {
        for (int a = 0; a < AAAA; a++) {
          sb.append("AAAA");
        }
        for (int b = 0; b < BB; b++) {
          sb.append("BB");
        }
      }

    }
    System.out.println(sb);
  }
}