class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        answer[0] = -1; //첫번째는 같은 문자 있는 경우의 수가 없으므로 -1
        char[] cArray = s.toCharArray();  //문자 배열형으로 변환

        for(int i =1;i<cArray.length;i++){  //2번째부터 반복
          for(int j =i-1;0<=j;j--){ //해당 번째-1 부터 내려가면서 같은지 비교
            if(cArray[i] == cArray[j]){ //문자가 같다면 가장 가까운 문자이고, answer에 몇번째인지 넣고 반복 탈출
              answer[i] = i-j;
              break;
            } 
            else  //같은게 없다면 -1
              answer[i] = -1;
          }
        }

        return answer;
    }
}