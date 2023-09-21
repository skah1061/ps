
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      StringTokenizer sa = new StringTokenizer(br.readLine());

      int A = Integer.parseInt(st.nextToken());
      int B = Integer.parseInt(st.nextToken());

      int[] numbers = new int[A];
      for (int i = 0; i < A; i++) {
        numbers[i] = Integer.parseInt(sa.nextToken());
      }
      Integer finalResult  = 0;
      for(int i=0;i<A;i++){
        for(int j =i+1; j<A;j++){
          for(int l = j+1;l<A;l++) {
            Integer result = numbers[i] + numbers[j] + numbers[l];
            if(result<=B){
              if(finalResult < result) {
                finalResult = result;
              }
            }

          }
        }
      }
      System.out.println(finalResult);
  }
}