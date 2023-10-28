import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String doc = br.readLine();
    String target = br.readLine();

    int targetCnt =0;



      for(int i = 0;i<doc.length();i++){  //문자열 doc 크기만큼 반복
        if(doc.charAt(i) == target.charAt(0)){  // target의 첫 문자와 같은 값을 검사
          if(i+target.length() > doc.length()){ //doc i 번째에서 target문자만큼 길이가 되는지 검사
            continue;
          }
          String result = doc.substring(i,i+target.length()); //i문자 target크기만큼 문자열 자르기

          if(result.equals(target)){  //위에서 검사한 해당 문자열이 target과 같은지 확인
            i+=target.length()-1; // 반복문으로 돌아가면 i가 증가할 것이기 때문에 1을 빼준다.
            targetCnt++;
          }
        }
      }
    System.out.println(targetCnt);
  }

}