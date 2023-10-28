import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    int[] numArray = new int[N];

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      numArray[i] = Integer.parseInt(st.nextToken());
    }
    int cnt = 0;
    int result = 0; //i ~ j 까지의 합 0으로 초기화
    int start = 0;
    int end = 0;
    while (true) {
      if (result >= M) {
        result -= numArray[start];
        start++;
      } else if (end == N) {
        break;
      } else {
        result += numArray[end];
        end++;
      }
      if (result == M) {
        cnt++;
      }

    }
    System.out.println(cnt);
  }
}