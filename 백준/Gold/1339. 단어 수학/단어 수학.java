import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());
    Integer[] intArrays = new Integer[26];  //알파벳 크기만큼 초기화

    String str;

    Arrays.fill(intArrays,0); //배열 0으로 초기화
    for(int i=0;i<N;i++) {
      str= br.readLine();
      for(int j =0;j<str.length();j++) {
        char c = str.charAt(j);
        intArrays[c - 'A'] += (int) Math.pow(10, str.length() - 1 - j); //j번째 값 거듭제곱으로 가중치 구해서 더해주기
        //c-'A'로 알파벳 번째에 같은 알파벳은 가중치(점수)를 더해준다.
      }
    }
    Arrays.sort(intArrays, Collections.reverseOrder()); //내림차순으로 정렬 내림차순을 사용하려면 Integer배열이여야 한다.

    int result = 0;
    int cnt =9;
    for(int i : intArrays){
      if(i == 0||cnt==0)  
        break;
      result+=i*cnt;
      cnt--;
    }
    System.out.println(result);
  }
}