import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());
    int[] levelArray = new int[N];

    int resultCnt =0; //최종 -1 카운트

    int minValue; //현재 설정된 최소값

    for(int i =0;i<N;i++){
      levelArray[i] = Integer.parseInt(br.readLine());

    }
    minValue =levelArray[N-1];  //마지막 레벨 값 최소값으로 설정
    for(int i =2;i<=N;i++){
      if(minValue >levelArray[N-i]){  //해당값이 더 낮을 시 minValue 초기화
        minValue =  levelArray[N-i];

      }else{  //아닐시 minvalue-1이 될 만큼 -1 카운트 
        resultCnt+=levelArray[N-i] - minValue +1;
        minValue -=1; //minValue -1
      }

    }
    System.out.println(resultCnt);
  }
}