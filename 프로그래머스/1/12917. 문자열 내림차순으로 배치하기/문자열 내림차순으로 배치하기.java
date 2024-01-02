import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
          char[] c = s.toCharArray();
          String[] str = new String[c.length];
          for(int i =0;i<c.length;i++){
            str[i] = Character.toString(c[i]);
          }
          Arrays.sort(str, Collections.reverseOrder());
          for(String ch:str){
            sb.append(ch);
          }

          return sb.toString();
    }
}