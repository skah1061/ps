import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());

    Integer[] dp = new Integer[11];

    dp[0] =1;
    dp[1] =2;
    dp[2] =4;
    for(int i=3;i<dp.length;i++){
      dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
    }
    for(int i =0;i<T;i++){
      int n = Integer.parseInt(br.readLine());
      System.out.println(dp[n-1]);
    }


  }
//  private static String input()throws IOException{
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    StringTokenizer st = new StringTokenizer(br.readLine());
//
//    return st.nextToken();
//  }
}