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
    StringTokenizer st2 = new StringTokenizer(br.readLine());

    Integer numberCount = Integer.parseInt(st.nextToken());

    List<Integer> firstResult = new ArrayList<>();

    Integer input;

    for (int i = 0; i < numberCount; i++) {
      input= Integer.parseInt(st2.nextToken());
      if(input % 2 != 0 || input == 2){
        boolean isPrime = true;
        for(int j = 3 ;j <= input/2;j++){
          if(input%j == 0){
            isPrime = false;
          }
        }
        if(isPrime && input!=1) {
          firstResult.add(input);
        }
      }
    }

    System.out.println(firstResult.size());
  }

}