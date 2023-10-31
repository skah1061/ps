import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

  static int n, k, ans;
  static int[] kArr;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    n = Integer.parseInt(st.nextToken());
    k = Integer.parseInt(st.nextToken());

    kArr = new int[k];
    st = new StringTokenizer(br.readLine());

    for (int i = 0; i < k; i++) {
      kArr[i] = Integer.parseInt(st.nextToken());
    }
    Arrays.sort(kArr);  //크기대로 정렬
    dfs(0);
    System.out.println(ans);

  }

  public static void dfs(int num) {
    if(num >  n) return;  // n보다 값이 높아지면 재귀 종료

    if(ans < num) ans = num;  //위 결과가 아니라면 결과값에 num넣어주기

    for (int i = k - 1; i >= 0; i--) {
      dfs(num * 10 + kArr[i]);  //원소갯수 만큼 돌면서 해당값 자릿수 하나 올리고 1의 자리 더하기
    }
  }
}