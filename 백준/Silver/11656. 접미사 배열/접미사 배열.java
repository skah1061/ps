import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    String S = st.nextToken();
    int length = S.length();
    ArrayList stringList = new ArrayList();

    for(int i =0; i<length;i++){
      stringList.add(S.substring(i));
    }
    Collections.sort(stringList);
    for(int i =0;i<length;i++){
      System.out.println(stringList.get(i));
    }
  }
}