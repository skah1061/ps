import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());

    int[][] arr = new int[N][N];
    long[][] dp = new long[N][N];

    for(int i=0;i<N;i++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      for(int j =0; j<N;j++){
        arr[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    dp[0][0] = 1; //첫번째 dp 1
    for(int i =0;i<N;i++){
      for(int j =0;j<N;j++){
          if(dp[i][j] == 0) continue;
          int value = arr[i][j];  // 해당 번째 값 구하기
          if(value>0){  // 값이 0 이면 이동 불가.
            if(i+value < N) // 아래이동이 칸을 벗어나지 않는다면
              dp[i + value][j] += dp[i][j]; //dp를 이전 만큼 더해준다.
            if(j+value <N) // 오른이동이 칸을 벗어나지 않는다면
              dp[i][j+value] += dp[i][j]; //dp를 이전 만큼 더해준다.
          }
        }

    }

    System.out.println(dp[N-1][N-1]); //결과 출력
  }
}