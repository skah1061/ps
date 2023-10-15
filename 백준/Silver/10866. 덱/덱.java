import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] deque = new int[10001];

    static int first = 5000;

    static int last = 5001;


    public static void main (String[]args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int N = Integer.parseInt(br.readLine());
      StringBuilder sb = new StringBuilder();

      for (int i = 0; i < N; i++) {
        StringTokenizer st = new StringTokenizer(br.readLine());
        String S = st.nextToken();

        switch (S) {
          case "push_back":
            Integer x = Integer.parseInt(st.nextToken());
            push_back(x);
            break;
          case "push_front":
            Integer y = Integer.parseInt(st.nextToken());
            push_front(y);
            break;
          case "pop_front":
            sb.append(pop_front()).append("\n");
            break;
          case "pop_back":
            sb.append(pop_back()).append("\n");
            break;
          case "size":
            sb.append(size()).append("\n");
            break;
          case "empty":
            sb.append(empty()).append("\n");
            break;
          case "front":
            sb.append(front()).append("\n");
            break;
          case "back":
            sb.append(back()).append("\n");
            break;
        }
      }
      System.out.println(sb);
    }

    public static void push_back (int X){
      deque[last] = X;
      last++;
    }
    public static void push_front (int X){
      deque[first] = X;
      first--;
    }
    public static int pop_front () {
      if (last - first == 1) {
        return -1;
      } else {
        int P = deque[first+1];
        first++;
        return P;
      }
    }
    public static int pop_back () {
      if (last - first == 1) {
        return -1;
      } else {
        int P = deque[last-1];
        last--;
        return P;
      }
    }
    public static int size () {
      return last - first-1;
    }

    public static int empty () {
      if (last - first == 1) {
        return 1;
      } else {
        return 0;
      }
    }

    public static int front () {
      if (last - first == 1) {
        return -1;
      } else {
        int F = deque[first+1];
        return F;
      }
    }

    public static int back () {
      if (last - first == 1) {
        return -1;
      } else {
        int B = deque[last - 1];
        return B;
      }
    }
  }