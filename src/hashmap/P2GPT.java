package hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class P2GPT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        sc.close();

        // 문자열 길이가 다르면 바로 "NO" 반환
        if (s1.length() != s2.length()) {
            System.out.println("NO");
            return;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        // 첫 번째 문자열에 대한 빈도 수 증가
        for (char ch : s1.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // 두 번째 문자열에 대한 빈도 수 감소
        for (char ch : s2.toCharArray()) {
            if (!map.containsKey(ch) || map.get(ch) == 0) {
                System.out.println("NO");
                return;
            }
            map.put(ch, map.get(ch) - 1);
        }

        System.out.println("YES");
    }
}
