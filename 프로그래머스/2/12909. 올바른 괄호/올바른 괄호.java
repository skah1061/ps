class Solution {
    boolean solution(String s) {
    int cnt = 1;

    boolean swit;

    char[] chars = s.toCharArray();
    if(chars[0] ==  ')' || chars.length%2 != 0){
      return false;
    }
    if(chars[chars.length-1] == '('){
      return false;
    }

    for(int i =1; i<chars.length ;i++){
      swit = chars[i] == '(' ? false : true;

      if(!swit){

        cnt++;
      }
      else {
        cnt--;
      }
      if(cnt<0){
        return false;
      }
    }
    if(cnt == 0){
      return true;
    }
    return  false;
    }
}