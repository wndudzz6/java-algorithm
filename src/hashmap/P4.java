package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//4. 모든 아나그램 찾기
public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        sc.close();

        System.out.println(solution(s,t));
    }
    private static int solution(String s, String t) {
        Map<Character, Integer> mapT = new HashMap<>();
        Map<Character, Integer> mapS = new HashMap<>();

        //슬라이딩 윈도우
        int lt = 0, answer = 0;

        //t의 구성을 map에 저장해서 보자.
        for(int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            mapT.put(c, mapT.getOrDefault(c, 0) + 1);
        }

        //초기 윈도우 세팅
        for(int i = 0; i < t.length()-1; i++) {
            char c = s.charAt(i);
            mapS.put(c,mapS.getOrDefault(c,0) + 1);
        }//비교하기 딱 1칸 전까지만 초기 세팅을 해둔다.

        for(int rt = t.length()-1; rt<s.length(); rt++){
            char c = s.charAt(rt);
            mapS.put(c, mapS.getOrDefault(c,0) + 1);

            if(mapS.equals(mapT)) answer++;

            //그 다음에 오는 문자 처리 (그냥 mapS.remove(charAt(lt++)) 하면 1이 아닌 값이어도 다 날라감
            char leftChar = s.charAt(lt++);
            mapS.put(leftChar, mapS.getOrDefault(leftChar,0) - 1);
            if(mapS.get(leftChar) <= 0) mapS.remove(leftChar);
        }

        return answer;
    }
}
