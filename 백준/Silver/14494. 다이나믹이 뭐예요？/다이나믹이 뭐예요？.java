import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

  static long[][] F;
  static long result =0;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    F = new long[n][m];
    Arrays.fill(F[0], 1);
    for (int i = 0; i < n; i++) {
      F[i][0] = 1;
    }

    result = dp(n - 1, m - 1);
    
    System.out.print(result);
  }
  public static long dp(int n,int m) {
    long a,b,c;
    if(F[n][m] == 1){
      return 1;
    }
    if(F[n-1][m] != 0){
      a = F[n-1][m];
    }
    else{
      a = dp(n-1,m);
    }
    if(F[n][m-1] != 0){
      b = F[n][m-1];
    }
    else{
      b = dp(n,m-1);
    }
    if(F[n-1][m-1] != 0){
      c = F[n-1][m-1];
    }
    else{
      c = dp(n-1,m-1);
    }

    return F[n][m] = (a + b + c)%1000000007;
  }
}