import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] A = new int[N]; //칸의 숫자
    int[] dp = new int[N];  //점프 뛴 횟수
    for(int i =0;i<N;i++){
      A[i] = Integer.parseInt(st.nextToken());
      dp[i] = Integer.MAX_VALUE;  //최솟값을 구할 것이므로 최대값들로 초기화
    }
    dp[0] = 0;  //첫번째 값은 0

    for(int i =0;i<N;i++){
      if(dp[i] == Integer.MAX_VALUE)  //밟은 칸 번째 dp가 최대값이라면 0을 만나 더 전진하지 못 했다는 이야기 -1
        break;
      for(int j = 1;j<=A[i];j++){ //점프 가능한 회수만큼 반복
        if(i+j >= N-1) {  //점프한 칸수가 최대 칸수를 넘어가면
          dp[N-1] = Math.min(dp[i]+1,dp[N-1]);  //마지막dp에 숫자에 최솟값 넣어주기
          break;
        }
        dp[i+j] = Math.min(dp[i]+1,dp[i+j]);  //dp 비교해서 최솟값으로 계속 초기화
      }
    }

    System.out.println(dp[N-1]==Integer.MAX_VALUE?-1:dp[N-1]);  // 마지막 dp값은 최솟값일 것이므로 출력 만약 MAX_VALUE라면 도달하지 못 했다는 뜻 -1

  }
}