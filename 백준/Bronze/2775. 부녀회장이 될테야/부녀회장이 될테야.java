import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

  static long result =0;
  static int k;
  static int n;
  static int cnt = 0;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int T = Integer.parseInt(st.nextToken());
    List<Long> resultList = new ArrayList<>();
    long[] firstNum;

    for(int i =0;i<T;i++) {
      cnt = 0;
      result =0;
      st = new StringTokenizer(br.readLine());
      k = Integer.parseInt(st.nextToken());
      st = new StringTokenizer(br.readLine());
      n = Integer.parseInt(st.nextToken());
      firstNum = new long[n];
      for(int j =1;j<=n;j++){
        firstNum[j-1] = j;
      }
      fibonacci(firstNum);
      resultList.add(result);

    }
    for(long res:resultList){
      System.out.println(res);
    }
  }
  public static void fibonacci(long[] firstNum){
      long[] tempNum = new long[n];
      cnt++;
      if(k == 0){
        for(int i =0;i<n;i++){
          result+= firstNum[i];
          return;
        }
      }
      for(int i=0;i<n;i++){
        int temp=0;
        for(int j =0;j<=i;j++){
          temp +=firstNum[j];
        }
        tempNum[i] = temp;
      }
      if(k==cnt){
        result = tempNum[n-1];
        return;
      }
      fibonacci(tempNum);
  }
}
