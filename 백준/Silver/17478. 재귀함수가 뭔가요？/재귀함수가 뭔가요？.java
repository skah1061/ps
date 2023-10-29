import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
  static String underbar =""; //재귀 들어갈 때 늘어날 언더바 개수 초기화 해줄 변수
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");  //처음 1회 출력
    recursion(N); //재귀 시작
  }
  public static void recursion(int N){
    String tempBar = underbar;
    if(N == 0){
      System.out.println(tempBar+"\"재귀함수가 뭔가요?\"");       //\"는 따옴표 출력이다.
      System.out.println(tempBar+"\"재귀함수는 자기 자신을 호출하는 함수라네\"");
      System.out.println(tempBar+"라고 답변하였지.");
      return;
    }
    System.out.println(tempBar+"\"재귀함수가 뭔가요?\"");
    System.out.println(tempBar+"\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.");
    System.out.println(tempBar+"마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.");
    System.out.println(tempBar+"그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");
    underbar+="____"; //재귀함수 들어가기전 underbar 더해주기
    recursion(N-1); //N을 1 감소시킨 상태로 다시 재귀함수 호출
    System.out.println(tempBar+"라고 답변하였지.");
  }
}
