import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
  static int staticSquareSize;  //변하지 않는 사각형 크기 처음 초기화하는 값
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    
    int squareSize = (N-1)*4+1; //사각형 한변 크기 구하기
    char[][] charArray = new char[squareSize][squareSize];
    
    staticSquareSize = squareSize;
    
    for(int i =0;i<squareSize;i++){ //2차원 배열 공백으로 초기화
      for(int j =0;j<squareSize;j++){
        charArray[i][j] = ' ';
      }
    }

    recursion(squareSize,charArray,0); //재귀 시작

    for(int i =0;i<squareSize;i++){ //2차원 배열 출력
      for(int j =0;j<squareSize;j++){
        System.out.printf(String.valueOf(charArray[i][j]));
      }
      System.out.println();
    }
  }
  public static void recursion(int squareSize, char[][] charArray,int squareCnt){
    if(squareSize<1){ //재귀 종료
      return;
    }
    //for문 4개로 사각형 변을 하나식 그려준다 시작
    for(int i =squareCnt*2;i<staticSquareSize-(squareCnt*2);i++){ 
      charArray[squareCnt*2][i] = '*';
    }
    for(int i =squareCnt*2;i<staticSquareSize-(squareCnt*2);i++){
      charArray[i][squareCnt*2] = '*';
    }
    for(int i =staticSquareSize-(squareCnt*2)-1;i>squareCnt*2;i--){
      charArray[i][staticSquareSize-(squareCnt*2)-1] = '*';
    }
    for(int i =staticSquareSize-(squareCnt*2)-1;i>squareCnt*2;i--){
      charArray[staticSquareSize-(squareCnt*2)-1][i] = '*';
    }
    //for문 4개로 사각형 변을 하나식 그려준다 끝
    squareCnt++;  
    squareSize-=4;  //그려줄 변 크기 4 만큼 감소
    recursion(squareSize,charArray,squareCnt);
  }
}