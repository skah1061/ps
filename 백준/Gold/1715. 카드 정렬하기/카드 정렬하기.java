import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());
    PriorityQueue<Long> priorityQueue = new PriorityQueue<>();
    int result = 0;

    for(int i =0;i<N;i++){
     priorityQueue.add(Long.parseLong(br.readLine()));  //값 우선순위 큐에 넣어주기
    }
    while (priorityQueue.size() > 1){
      long tempNum1 = priorityQueue.poll(); //최소값 삭제(빼오기)
      long tempNum2 = priorityQueue.poll();

      result+=tempNum1+tempNum2;  //최소값 2개를 더한 값을 result에 더하기
      priorityQueue.add(tempNum1+tempNum2); //우선순위 큐에 최소값 2개를 합한 값을 다시 넣어주기
    }
    System.out.println(result);
  }
}