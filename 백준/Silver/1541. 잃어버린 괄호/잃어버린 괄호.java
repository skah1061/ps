import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //이 문제는 -기준 뒤 계산식들을 모두 묶어 더해준 뒤 큰 -로 빼주는 방법으로 풀 수 있다.
    String[] cal = br.readLine().split("-"); // 빼기를 기준으로 분리
    int res = 0;
    for(int i=0;i<cal.length;i++) {
      int sum = 0;
      String[] cal2 = cal[i].split("\\+");  //정규표현식을 사용 +기준으로 다시 분리
      for(int j=0;j<cal2.length;j++) {
        sum += Integer.parseInt(cal2[j]); //값을 모두 더해 sum 만들어주기
      }
      if(i==0) {  //첫번 째만 더해주고 나머진 다 빼주기 (-기준으로 잘랐기 때문에 나머지는 모두 -기호)
        res += sum;
      }else {
        res -= sum;
      }
    }
    System.out.println(res);
  }
}