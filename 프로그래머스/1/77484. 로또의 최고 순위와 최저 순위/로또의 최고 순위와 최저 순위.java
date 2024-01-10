import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        Arrays.sort(lottos);
        List<Integer> list = Arrays.stream(lottos)
            .boxed()// arr의 요소 박싱
            .collect(Collectors.toList());
        int cnt = Collections.frequency(list, 0);
        int collectCnt = 0;
        for(int win:win_nums) {
          int result = Arrays.binarySearch(lottos, win);
          if(result >=0)
            collectCnt++;
        }
        answer[0] = 6-(collectCnt+cnt)+1;
        answer[1] = 6-(collectCnt)+1;

        if(answer[1] >6){
            answer[1] = 6;
        }
        if(answer[0] > 6){
            answer[0] = 6;
        }
        
        return answer;
    }
}