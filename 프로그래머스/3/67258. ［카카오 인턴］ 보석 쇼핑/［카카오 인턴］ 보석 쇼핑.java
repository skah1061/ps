import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public int[] solution(String[] gems) {
        int[] answer = new int[2];

      HashSet<String> set = new HashSet<>();

      for(String gem:gems){ //Set으로 중복제거 하고 보석 종류 알아내기
        set.add(gem);
      }

      int n = gems.length;

      int distance = Integer.MAX_VALUE;

      int left = 0;  //투포인터 사용 값
      int right = 0;

      int start = 0;  //최종값
      int end = 0;

      HashMap<String, Integer> map = new HashMap<>();

      while (true) {

        if (set.size() == map.size()) {
          //크기 같은 경우 원하는 범위 좁히기
          map.put(gems[left], map.get(gems[left])-1); //시작점을 오른쪽으로 한칸 이동하기위해 보석 개수를 하나 빼준다.

          if (map.get(gems[left]) == 0) { //개수를 하나 뺐을 때 0 이 되면 Map에서 제거
            map.remove(gems[left]);
          }
          left++; //시작점 1 증가
        } else if (right == n) {  //마지막에 도달했으면 반복문 break;
          break;
        } else {
          //right 오른쪽으로 이동
          //set에 해당하는 보석들을 다 찾아야함
          //해당 보석의 개수 +1
          map.put(gems[right], map.getOrDefault(gems[right], 0) + 1); //right문자의 키값을 가진 map이 없으면 값을 0으로 초기화해서 추가해주고 +1 아니라면 +1
          right++;  //끝점 1 증가
        }

        if (map.size() == set.size()) { //보석 종류와 map의 크기가 같을 때
          if (right-left < distance){ //최소범위 구해서 distance에 넣기
            distance = right-left;
            start = left+1;
            end = right;
          }
        }

      }//while

      answer[0] = start;
      answer[1] = end;

      return answer;
    }
}