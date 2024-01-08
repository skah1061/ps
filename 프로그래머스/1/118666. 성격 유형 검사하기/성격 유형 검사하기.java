import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] survey, int[] choices) {
        StringBuilder answer = new StringBuilder();
    Map<Character, Integer> ticketStatus = new HashMap<>();
    ticketStatus.put('R',0);
    ticketStatus.put('T',0);
    ticketStatus.put('C',0);
    ticketStatus.put('F',0);
    ticketStatus.put('J',0);
    ticketStatus.put('M',0);
    ticketStatus.put('A',0);
    ticketStatus.put('N',0);

    for(int i =0;i<survey.length;i++) {
      char[] c = survey[i].toCharArray();
      int value = choices[i] -4;
      if(value  >0) {
        ticketStatus.merge(c[1], value, Integer::sum);
      }
      else{
        value*=-1;
        if (ticketStatus.get(c[0]) != null)
          ticketStatus.put(c[0], ticketStatus.get(c[0]) + value);
        else {
          ticketStatus.put(c[0], value);
        }
      }
    }
      if(ticketStatus.get('R')>=ticketStatus.get('T')){
        answer.append("R");
      }
      else{
        answer.append("T");
      }
      if(ticketStatus.get('C')>=ticketStatus.get('F')){
        answer.append("C");
      }
      else{
        answer.append("F");
      }
      if(ticketStatus.get('J')>=ticketStatus.get('M')){
        answer.append("J");
      }
      else{
        answer.append("M");
      }
      if(ticketStatus.get('A')>=ticketStatus.get('N')){
        answer.append("A");
      }
      else{
        answer.append("N");
      }

    return answer.toString();
    }
}