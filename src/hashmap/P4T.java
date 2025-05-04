package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//모든 아나그램 찾기 ~ 매출액 종류와 거의 동일
public class P4T {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        sc.close();
        System.out.println(solution(a,b));
    }

    static int solution(String a, String b){
        Map<Character,Integer> am = new HashMap<>();
        Map<Character,Integer> bm = new HashMap<>();
        for(char x : b.toCharArray()){ //일단 b의 map부터
            bm.put(x, bm.getOrDefault(x,0)+1);
        }
        int L = b.length()-1;
        for(int i = 0; i<L ; i++){ //L-1 전처리
            am.put(a.charAt(i),am.getOrDefault(a.charAt(i),0)+1);
        }
        int lt = 0; int answer = 0;
        for(int rt = L; rt <a.length() ; rt++){
            am.put(a.charAt(rt),am.getOrDefault(a.charAt(rt),0)+1);
            if(am.equals(bm)) answer++;
            am.put(a.charAt(lt), am.get(a.charAt(lt))-1);
            if(am.get(a.charAt(lt)) == 0) am.remove(a.charAt(lt));
            lt++;
        }
        return answer;
    }
}
