import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    BigInteger[] dp = new BigInteger[n+1];  //long타입보다 더 큰수를 처리할 수 있는 BigInteger타입으로 배열 만들기
    if(n ==0){
      System.out.println(0);
    }
    else {
      dp[0] = BigInteger.ZERO;
      dp[1] = BigInteger.ONE;

      for (int i = 2; i <= n; i++) { //배열 초기화
        dp[i] = dp[i - 1].add(dp[i - 2]);
      }

      System.out.println(dp[n]);  //출력
    }
  }
}