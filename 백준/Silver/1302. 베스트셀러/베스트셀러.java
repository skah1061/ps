import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());
    HashMap<String,Integer> map = new HashMap<String,Integer>();

    String str = new String();
    for(int i=0; i<N; i++){
      str = br.readLine();
      if(map.containsKey(str)){
        map.replace(str, map.get(str)+1);
      }
      else{
        map.put(str, 1);
      }
    }
    int max = 0;

    for(String mapValue:map.keySet()){
      max = Math.max(max,map.get(mapValue));
    }
    ArrayList<String> maxValueList = new ArrayList<>(map.keySet());
    Collections.sort(maxValueList);
    for(String check:maxValueList){
      if(max == map.get(check)){
        System.out.println(check);
        break;
      }
    }
  }
}