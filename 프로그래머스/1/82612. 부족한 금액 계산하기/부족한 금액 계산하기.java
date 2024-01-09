class Solution {
    public long solution(int price, int money, int count) {
        long answer = money;

        for(long i =1;i<=count;i++){
          answer-= ((long) price *i);
        }

        if(answer>=0)
          answer =0;
        else
          return -answer;
        return answer;
    }
}