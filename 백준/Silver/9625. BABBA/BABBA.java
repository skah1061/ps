import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
  static int cntA =0;   //최종 A갯수
  static int cntB = 1;  //최종 B갯수
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int K = Integer.parseInt(br.readLine());  //버튼을 누르는 횟수 받아오기
    StringBuilder stringBuilder = new StringBuilder();

    for(int i=0;i<K-1;i++){ //규칙적으로 더해주기
      int tempB = cntB;
      cntB = cntA+tempB;
      cntA = tempB;
    }

    stringBuilder.append(cntA).append(" ").append(cntB);

    System.out.println(stringBuilder);
  }
}