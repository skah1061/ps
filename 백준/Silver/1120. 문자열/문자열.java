import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());

      String A = st.nextToken();
      String B = st.nextToken();
      Integer result;

      result = containsCharCnt(A,B);  //최솟값 구하는 함수에 문자열 2개 매개변수로 전달

      System.out.println(result);
    }
    private static Integer containsCharCnt(String a, String b){
      char[] arrayA = a.toCharArray();
      int cnt;
      int min = a.length(); //최솟값을 찾을 것이므로 최대로 나올 수 있는 값으로 초기화
      for(int i = 0;i<=b.length()-a.length();i++){  //a가 b에 들어갈 수 있는 경우의 수만큼 반복
        cnt = 0;
        int lastIndex =i+a.length();  //문자열을 자를 때 마지막 인덱스 값 초기화

        String temp = b.substring(i,lastIndex); //b문자열을 a크기만큼 한칸씩 옮기며 자르기

        char[] arrayTemp = temp.toCharArray();
        
        for(int j =0;j<arrayTemp.length;j++){
          if(arrayA[j] != arrayTemp[j]){  //문자마다 같은지 검사
            cnt++;
          }
        }
        min = Math.min(min,cnt);  //최소값 초기화
      }
      return min;
    }

}