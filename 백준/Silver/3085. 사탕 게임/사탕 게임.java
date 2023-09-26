import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  static int result = 1;
  static int T;
  static char[][] map;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    T = Integer.parseInt(br.readLine());

    map = new char[T][T];
    for (int i = 0; i < T; i++) {
      String ns = br.readLine().trim();

      for (int j = 0; j < T; j++) {
        map[i][j] = ns.charAt(j);
      }
    }

    for (int x = 0; x < T; x++) {
      for (int y = 0; y < T - 1; y++) {
        swap(x, y, x, y + 1);
        maxCount();
        swap(x, y + 1, x, y); // 원래 상태로 다시 바꿈
      }
    }
    for (int x = 0; x < T - 1; x++) {
      for (int y = 0; y < T; y++) {
        swap(x, y, x + 1, y);
        maxCount();
        swap(x + 1, y, x, y); // 원래 상태로 다시 바꿈
      }
    }

    System.out.println(result);
  }

  static void swap(int x1, int y1, int x2, int y2) {
    char temp = map[x1][y1];
    map[x1][y1] = map[x2][y2];
    map[x2][y2] = temp;
  }

  static void maxCount() {
    for (int i = 0; i < T; i++) {
      int cnt = 1;
      for (int j = 0; j < T - 1; j++) {
        if (map[i][j] == map[i][j + 1]) {
          cnt++;
          result = Math.max(result, cnt);
        } else {
          cnt = 1;
        }
      }
    }
    for (int i = 0; i < T; i++) {
      int cnt = 1;
      for (int j = 0; j < T - 1; j++) {
        if (map[j][i] == map[j + 1][i]) {
          cnt++;
          result = Math.max(result, cnt);
        } else {
          cnt = 1;
        }
      }
    }
  }
}