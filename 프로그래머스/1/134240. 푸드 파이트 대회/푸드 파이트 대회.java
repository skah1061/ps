class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();

      for(int i=1;i<food.length;i++){
        int result = food[i]/2;
        if (result!=0) {
          sb.append(String.valueOf(i).repeat(Math.max(0, result)));
        }
      }
      StringBuffer stringBuffer = new StringBuffer(sb.toString());
      sb.append(0);
      sb.append(stringBuffer.reverse().toString());

      return sb.toString();
    }
}