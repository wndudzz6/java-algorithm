package hashmap;

import java.util.*;

//확실히 나나 GPT보다 넓은 범위를 포괄하고 깔끔함
public class P2T {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        sc.close();

        String answer = "YES";
        Map<Character, Integer> map = new HashMap<>();
        for(char x : s1.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for(char x :s2.toCharArray()) {
            if(!map.containsKey(x) || map.get(x) == 0) {
                System.out.println("NO");
                return;
            }
            map.put(x, map.get(x) -1);
        }
        System.out.println(answer);
    }
}
