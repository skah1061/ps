import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        int[] answer = {};

      Map<String, String> map = new HashMap<>();
      Map<String, Integer> feeMap = new HashMap<>();

      for(int i = 0; i < records.length; i++){
        feeMap.put(records[i].split(" ")[1], 0);
      }

      for(int i = 0; i < records.length; i++){
        String[] infos = records[i].split(" ");

        if(map.containsKey(infos[1])){
          String[] inTime = map.remove(infos[1]).split(":");//IN시간 가져오기
          //remove는 해당 키값의 map을 지우고 그 값을 반환한다.
          String[] outTime = infos[0].split(":");//OUT시간 가져오기

          int hour = Integer.parseInt(outTime[0]) - Integer.parseInt(inTime[0]);  //시간 계산
          int minute = Integer.parseInt(outTime[1]) - Integer.parseInt(inTime[1]);

          feeMap.replace(infos[1], feeMap.get(infos[1]) + 60 * hour + minute);  //해당 키의 값을 변경

        }else{
          map.put(infos[1], infos[0]); // 차 번호, 시간
        }
      }

      for(String key : map.keySet()){ // map에서 지워지지 않은 나머지 값은 23:59 출차 계산
        String[] inTime = map.get(key).split(":");

        int hour = 23 - Integer.parseInt(inTime[0]);
        int minute = 59 -Integer.parseInt(inTime[1]);

        feeMap.replace(key, feeMap.get(key) + 60 * hour + minute);
      }

      List<Entry<String, Integer>> list = new ArrayList(feeMap.entrySet());
      Collections.sort(list, (o1, o2) -> {  //정렬
        return Integer.parseInt(o1.getKey()) > Integer.parseInt(o2.getKey())?1 :
            Integer.parseInt(o1.getKey()) < Integer.parseInt(o2.getKey())?-1 : 0;
      });


      answer = new int[list.size()];

      for(int i = 0; i < answer.length; i++){
        if(list.get(i).getValue() > fees[0]){
          answer[i] = fees[1] + (int) Math.ceil((list.get(i).getValue() - fees[0]) / (double)fees[2]) * fees[3];
        }else{
          answer[i] = fees[1];
        }
      }

      return answer;
    }
}