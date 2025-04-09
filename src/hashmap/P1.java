package hashmap;

import java.util.HashMap;
import java.util.Scanner;

//학급 회장
public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        sc.close();
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            char candidate = s.charAt(i);
            map.put(candidate, map.getOrDefault(candidate, 0) + 1);
        }

        char answer = ' ';
        int maxVotes = 0;

        for (char key : map.keySet()) {
            if (map.get(key) > maxVotes) {
                maxVotes = map.get(key);
                answer = key;
            }
        }
        System.out.println(answer);

    }
}
