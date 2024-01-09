import java.util.Arrays;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length]; //결과 저장할 배열
        int[] kArray = new int[k];  // 명예의 전당 배열
        Arrays.fill(kArray, Integer.MAX_VALUE); //최솟값을 구할 것이기 때문에 기본점수 int최고값으로 초기화
        int kTemp =k;
        if(k>score.length)
          kTemp = score.length;
        for(int i =0;i<kTemp;i++){  // 명예의 전당 개수 동안은 비교할 필요없으므로 그냥 넣고 가장작은수 찾기
          kArray[i] = score[i]; 
          Arrays.sort(kArray);
          answer[i] = kArray[0];
        }
        if(k>=score.length)
            return answer;

        for(int i=k;i<score.length;i++){  //이후 가장 작은 점수와 비교해서 바꾸고 정렬해서 가장 작은 수 찾기
          if(kArray[0] < score[i]){
            kArray[0] = score[i];
            Arrays.sort(kArray);
            answer[i] = kArray[0];
          }
          else
            answer[i] = kArray[0];
        }

        return answer;
    }
}