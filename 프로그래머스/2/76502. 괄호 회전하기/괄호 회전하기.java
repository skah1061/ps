import java.util.ArrayList;
class Solution {
    public int solution(String s) {
      int answer =0;

      char[] chars = s.toCharArray();
      int head =0;

      for(int i =0;i<chars.length;i++){
        if(isCollect(head,chars)){
          answer++;
        }
        head++;
      }


      return answer;
    }
    public static boolean isCollect(int head, char[] chars){
    ArrayList<String> charList = new ArrayList<>();
    int smallBracketCnt =0;
    int mediumBracketCnt =0;
    int largeBracketCnt =0;
      for(int i =0;i<chars.length;i++){
          if(smallBracketCnt <0){
          return false;
        }
        if(mediumBracketCnt <0){
          return false;
        }
        if(largeBracketCnt <0){
          return false;
        }
        if(i ==0) {
          if (chars[head] == ')'||chars[head] == '}') {
            return false;
          }
          if(chars[head] ==']'){
            return false;
          }
        }
        if(i==chars.length-1){
          if (chars[head] == '('||chars[head] == '{') {
            return false;
          }
          if(chars[head] =='['){
            return false;
          }
        }
        charList.add(String.valueOf(chars[head]));
        if(chars[head] == '('){
          smallBracketCnt++;
          int temphead = (head+1) > chars.length-1?0:head+1;
          if(chars[temphead] =='}'||chars[temphead] == ']'){
            return false;
          }
        }
        else if(chars[head] == '{'){
          mediumBracketCnt++;
          int temphead = (head+1) > chars.length-1?0:head+1;
          if(chars[temphead] ==']'||chars[temphead] == ')'){
            return false;
          }
        }
        else if(chars[head] == '['){
          largeBracketCnt++;
          int temphead = (head+1) > chars.length-1?0:head+1;
          if(chars[temphead] ==')'||chars[temphead] == '}'){
            return false;
          }
        }
        else if(chars[head] == ')'){
          smallBracketCnt--;
          if(!charList.contains("(")){
            return false;
          }
        }
        else if(chars[head] == '}'){
          mediumBracketCnt--;
          if(!charList.contains("{")){
            return false;
          }
        }
        else if(chars[head] == ']'){
          largeBracketCnt--;
          if(!charList.contains("[")){
            return false;
          }
        }

        head++;
        if(head>chars.length-1){
          head=0;
        }
      }
    if(smallBracketCnt !=0){
      return false;
    }
    if(mediumBracketCnt !=0){
      return false;
    }
    if(largeBracketCnt !=0){
      return false;
    }
      return true;
  }
}