class Solution {
    public int solution(int n, int k) {
      int answer = 0;
      StringBuilder sb = new StringBuilder();

      while(n!=0){  //N진법 변환
        sb.insert(0,n%k);
        n/=k;
      }

      String[] arr = sb.toString().split("0");  //0을 기준으로 문자열 자르기

      for(String s: arr){
        if(s.equals("")) continue;  //split시 공백을 같이 출력하기 때문에 공백은 건너뛰기
        long num=Long.parseLong(s); //Integer타입으로는 더 큰값이 있어서 받지 못 함
          
        if(isPrime(num)){ //소수라면 answer 1증가
          answer++;
        }
      }

      return answer;
    }
    
    public boolean isPrime (long a){

    if(a<2) return false;
        
    //에라토스테네스의 체
    for(int i=2;i<=Math.sqrt(a);i++){ //2부터 해당값의 제곱근까지 반복
      if(a%i==0){  //만약 나눠지는 값이 존재하면 false를  리턴
        return false;
      }
    }
    return true;  // 반복문을 다 돈 뒤 나눠지는 값이 존재하지 않으면 소수이므로 true리턴
    }
}