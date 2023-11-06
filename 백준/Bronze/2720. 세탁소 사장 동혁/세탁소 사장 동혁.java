import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int T = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    
    for(int i =0;i<T;i++){
      int change = Integer.parseInt(br.readLine());
      sb.setLength(0);
      sb.append(change / 25).append(" ");
      change=change%25;
      sb.append(change/10).append(" ");
      change=change%10;
      sb.append(change/5).append(" ");
      change=change%5;
      sb.append(change/1);

      System.out.println(sb);
    }
  }
}