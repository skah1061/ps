import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    //해당 값을 차례로 입력해보면
    //1  2  3  4  5  6  7  8  9  10
    //C  S  C  S  C  S  C  S  C  S
    //1개 혹은 3개만 가져갈 수 있기 때문에 먼저 시작하는 사람은 홀수턴에 이길수가 없는 구조다.

    if(n%2 == 0){
      System.out.println("SK");
    }
    else{
      System.out.println("CY");
    }
  }
}