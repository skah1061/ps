import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());
    int T = Integer.parseInt(st.nextToken());

    int[] A = new int[N];

    int result = 0;
    for(int i =0;i<N;i++){ // 배열 초기화
      A[i] = Integer.parseInt(br.readLine());
    }
    for(int i =N-1;i>=0;i--){
      if(A[i] > T)  //목표값보다 A가 크면 다시 반복으로 돌아가기
        continue;
       result +=(T/A[i]); // 나눈 동전갯수 더하기
       T%=A[i]; //나누고난 나머지 다시 T에 넣어주기
    }
    if(T !=0){  //다 나눠지지 않으면 -1
      System.out.println(-1);
    }
    else{
      System.out.println(result);
    }
  }
}