class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        while(left<=right){
            int measurecount = measureCount(left);
            if(measurecount%2 == 0){
                answer += left;
            }
            else{
                answer -= left;
            }
            
            left++;
        }
        return answer;
    }
    public int measureCount(int left){
        int measurecnt = 0;
        for(int i =1;i*i <= left;i++){
          if(i*i ==left) measurecnt++;
          else if(left%i == 0) measurecnt+=2;
        }
        return measurecnt;
    }
}