import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());
    int head = -1;
    int[] resultArray = new int[N];
    int[] tempArray = new int[N];
    for(int i =0;i<N;i++){
      tempArray[i] = i+1;
    }
    for(int i =0;i<N;i++){
      for(int k = 0;k<K;k++){
        head+=1;
        if(head>=N){
          head= head%N;
        }
        while(tempArray[head] == 0){
          head+=1;
          if(head>=N){
            head= head%N;
          }
        }
      }
      resultArray[i] = tempArray[head];
      tempArray[head] = 0;
    }
    System.out.print("<");
    for(int i=0;i<N;i++){
      if(i ==N-1){
        System.out.print(resultArray[i]);
      }
      else {
        System.out.print(resultArray[i] + ", ");
      }
    }
    System.out.print(">");
  }
}
