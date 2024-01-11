class Solution {
    public long solution(int n) {
        long answer = 0;

        long[] dp = new long[n];
        dp[0] = 1;
        if(n !=1)
          dp[1] = 2;
        if(n != 2) {
          for(int i = 2;i<n;i++){
            dp[i] = (dp[i-1] + dp[i-2]) %1234567;
          }
          answer = dp[n-1];
        }
        else{
          return n;
        }

        return answer%1234567;
    }
}