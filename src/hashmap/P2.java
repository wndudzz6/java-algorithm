package hashmap;

import java.util.HashMap;
import java.util.Scanner;

//2. 아나그램(해쉬) - 내가 불편하게 푼 버전 HashMap 2개 사용
public class P2 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        sc.close();
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(int i = 0 ; i < s1.length() ; i++){
            char ch = s1.charAt(i);
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }
        for(int i = 0 ; i < s2.length() ; i++){
            char ch = s2.charAt(i);
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        }
        String answer = "";
        for(char key : map1.keySet()){
            if(map1.get(key) != map2.get(key)){
                answer = "NO";
            }
        }
        if(answer.equals("")){
            answer = "YES";
        }

        System.out.println(answer);
    }
}
