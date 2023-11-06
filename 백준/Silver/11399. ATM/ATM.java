import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());

    int[] ATMCustomer = new int[N];
    int result =0;


    for(int i =0;i<N;i++){
      ATMCustomer[i] = Integer.parseInt(st.nextToken());
    }
    Arrays.sort(ATMCustomer);

    for(int i =0;i<N;i++){
      if(i ==0)
        result = ATMCustomer[i];
      if(i !=0) {
        ATMCustomer[i] = ATMCustomer[i - 1] + ATMCustomer[i];
        result += ATMCustomer[i];
      }
    }
    System.out.println(result);
  }
}