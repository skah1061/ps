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
    for (int i = 0; i < N; i++) { //배열 초기화
      numArray[i] = Integer.parseInt(st.nextToken());
    }
    //투포인터 사용
    int cnt = 0;  //M과 같은 경우의 수
    int result = 0; //i ~ j 까지의 합 0으로 초기화
    int start = 0;  //시작 포인트
    int end = 0;  //끝 포인트
    while (true) {
      if (result >= M) {  // 값이 목표 값보다 커지면 start번째 값을 빼고 시작포인트를 하나 오른쪽으로 옮긴다
        result -= numArray[start];
        start++;
      } else if (end == N) {  //값이 목표보다 크지 않고 끝 표인트가 N에 도달하면 종료
        break;
      } else {  //end번째 값만큼 더해주고 끝 포인트 한칸 이동
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
