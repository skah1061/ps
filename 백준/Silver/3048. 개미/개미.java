import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  static class Ant {

    char name;  //개미 이름 알파벳
    boolean isRight;  //이동방향이 오른쪽 방향이면 true 아니라면 false

    public Ant(char name, boolean isRight) {
      this.name = name;
      this.isRight = isRight;
    }
  }

    public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());

      int N1 = Integer.parseInt(st.nextToken());
      int N2 = Integer.parseInt(st.nextToken());

      StringBuilder sb = new StringBuilder();
      sb.append(br.readLine());
      sb.append(br.readLine());
      char[] tempCharArray = sb.toString().toCharArray();
      Ant[] ants = new Ant[N1+N2];
      int cnt = 0;
      for(int i=N1-1;i>=0;i--){ //N1번 개미부대 값은 반대로 넣어주기 ABC라면 CBA순으로
        ants[cnt] = new Ant(tempCharArray[i],true);
        cnt++;
      }
      for(int i=N1;i<N1+N2;i++){  //N2개미 부대값은 받은 순서 그대로 넣어주기
        ants[i] = new Ant(tempCharArray[i],false);
      }

      int T = Integer.parseInt(br.readLine());
      sb.setLength(0);  //sb초기화
      for(int i =0;i<T;i++){

        for(int j=0;j<ants.length;j++){
          if(j == ants.length-1)  //확인하는 개미 수가 끝에 도달하면 반복탈출
            break;

          if(ants[j].isRight != ants[j+1].isRight&& (ants[j].isRight||!ants[j+1].isRight)){ //바로 오른쪽 개미와 진행방향 비교하고 자리 바꿔주기
            char tempAntName = ants[j].name;
            ants[j].name = ants[j+1].name;
            ants[j+1].name = tempAntName;
            ants[j].isRight = !ants[j].isRight;
            ants[j+1].isRight = !ants[j+1].isRight;
            j++;  //자리 바꿀 시 개미 검사 하나 건너뛰기
          }
        }
      }
      for(Ant ant : ants){  //br 개미 이름순서로 초기화
        sb.append(ant.name);
      }

      System.out.println(sb);
    }
  }