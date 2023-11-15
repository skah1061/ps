import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int N = Integer.parseInt(br.readLine());
    String str = br.readLine();
    char[] c = str.toCharArray();
    sb.append("*"); //첫번째 컵홀더
    for(int i =0;i<N;i++){
      if(c[i] == 'S'){
        sb.append("S").append("*");// 그리고 오른쪽에 컵홀더 추가
      }
      else{
        sb.append("LL").append("*");// 그리고 오른쪽에 컵홀더 추가
        i++;  //2명이므로 한명 건너뛰기
      }
    }
    long i = sb.toString().chars().filter(ch -> ch == '*').count(); //그린 sb stream으로 컵홀더 개수 세기
    if(N<i){  //컵홀더가 더 많을 때 모두 꽂을 수 있음
      System.out.println(N);
    }
    else {  //아닐 때 전체에서 컵홀더 수 빼기
      N -= N - i;
      System.out.println(N);
    }
  }
}