import java.util.ArrayList;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
      ArrayList<Integer> answerList = new ArrayList<>();
      int day;

      for(int i =0;i<progresses.length;i++){
        day = 0;
        int cnt =0;

        if((100-progresses[i]) < speeds[i]){
          day =1;
        }
        else{
          if((100-progresses[i]) % speeds[i] !=0){
            day = (100-progresses[i]) / speeds[i] + 1;
          }
          else {
            day = (100-progresses[i]) / speeds[i];
          }
        }
        for(int k=i;k<progresses.length;k++){
          progresses[k] = progresses[k] + speeds[k]*day;
        }
        int check =i;

        while (check < progresses.length){
          if(progresses[check] >= 100) {
            cnt++;
          }
          else{
            break;
          }
          check++;
        }
        answerList.add(cnt);
        i = i+cnt-1;
      }
      int[] answer = new int[answerList.size()];
      for(int i=0;i<answerList.size();i++){
        answer[i] = answerList.get(i);
      }

    return answer;
    }
}