import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int T = Integer.parseInt(br.readLine());
    int[] minute = {300,60,10};
    for(int i =0;i<minute.length;i++){
      sb.append(T/minute[i]).append(" ");
      T-= minute[i]*(T/minute[i]);
    }
    if(T!=0)
      System.out.println(-1);
    else
      System.out.println(sb);

  }
}