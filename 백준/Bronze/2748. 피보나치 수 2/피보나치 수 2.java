import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  static long[] firstNum = {0,1};
  static long result =0;
  static int cnt =1;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    long n = Integer.parseInt(st.nextToken());
    fibonacci(n);
    System.out.print(result);
  }
  public static void fibonacci(long n){
    cnt++;

    long temp = firstNum[0] + firstNum[1];
    if(cnt >= n){
      result = temp;
      return;
    }
    firstNum[0] = firstNum[1];
    firstNum[1] = temp;

    fibonacci(n);
  }
}
