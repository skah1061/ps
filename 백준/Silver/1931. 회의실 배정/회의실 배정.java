import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st;

    int[][] intArray = new int[N][2];
    for(int i =0;i<N;i++) {
      st = new StringTokenizer(br.readLine());
      intArray[i][0] = Integer.parseInt(st.nextToken());
      intArray[i][1] = Integer.parseInt(st.nextToken());
    }
    Arrays.sort(intArray, new Comparator<int[]>() {
      @Override
      public int compare(int[] o1, int[] o2) {
        if(o1[1]==o2[1]){
          return o1[0] - o2[0];
        }
        return o1[1]-o2[1];
      }

    });
    int count = 0;
    int prev_end_time = 0;

    for(int i = 0; i < N; i++) {

      // 직전 종료시간이 다음 회의 시작 시간보다 작거나 같다면 갱신
      if(prev_end_time <= intArray[i][0]) {
        prev_end_time = intArray[i][1];
        count++;
      }
    }

    System.out.println(count);
}
}