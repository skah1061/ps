class Solution {
    public int solution(int n) {
        int answer = 0;
        String disit = Digit(n);  //3진법 변환
        char[] cArray = disit.toCharArray();
        for(int i =cArray.length-1;i>=0;i--){ //3진수를 10진수로 변환하는 부분
          Integer iValue = Integer.parseInt(String.valueOf(cArray[i]));

          double result = Math.pow(3.0,cArray.length-i-1);  //거듭제곱 (몇번째 3진수 숫자인지)
          iValue *= (int)result;  //거듭제곱 값과 3진수 숫자 곱해주기

          answer +=iValue;  //결과값으로 더해주기
        }

        return answer;  //반복이 끝나면 반환
    }
    public String Digit(int m){
        StringBuilder sb = new StringBuilder();
        int rest;
        int result =m;
        while(result>=3){
          rest = result%3;
          result= result/3;

          sb.append(rest); //뒤쪽으로 붙여주며 뒤집기 효과
        }
        sb.append(result); //반복이 끝나고 남은 나머지 붙여주기
        return sb.toString();
        }
}