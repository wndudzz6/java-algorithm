package ssafy;
import java.util.*;

//이게 왜 DFS일 수밖에 없을까?
public class P1244D3 {
    static int max;
    static int changeCount;
    static int len;
    static char[] digits;
    static HashSet<String> visited = new HashSet<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  // 테스트 케이스 수

        for (int tc = 1; tc <= T; tc++) {
            String num = sc.next(); // 숫자 문자열
            changeCount = sc.nextInt(); // 교환 횟수

            digits = num.toCharArray();
            len = digits.length;
            max = 0;
            visited.clear();

            dfs(0);

            System.out.println("#" + tc + " " + max);
        }
        sc.close();
    }

    static void dfs(int depth) {
        if (depth == changeCount) {
            int value = Integer.parseInt(new String(digits));
            max = Math.max(max, value);
            return;
        }

        String state = new String(digits) + " " + depth;
        if (visited.contains(state)) return;
        visited.add(state);

        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                swap(i, j);
                dfs(depth + 1);
                swap(i, j); // 백트래킹
            }
        }
    }

    static void swap(int i, int j) {
        char temp = digits[i];
        digits[i] = digits[j];
        digits[j] = temp;
    }
}
