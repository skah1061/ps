import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  static int fiveCnt = 0;
  static int threeCnt = 0;
  static int result =0;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());

    if(N%5 == 0){
      System.out.print(N/5);
    }
    else{
      fiveCnt = N/5;
      fiveCnt++;
      fibonacci(N);
      System.out.print(result);
    }
    
  }
  public static void fibonacci(int N) {
    fiveCnt--;
    threeCnt = (N-(fiveCnt*5))/3;

    if(fiveCnt ==0&&threeCnt*3 != N){
      result = -1;
      return;
    }
    if((fiveCnt*5 + threeCnt*3) == N){
      result = fiveCnt+threeCnt;
      return;
    }
    fibonacci(N);
  }
}
