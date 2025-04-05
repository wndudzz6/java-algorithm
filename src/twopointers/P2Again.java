package twopointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P2Again {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i<n; i++) {
            if(!st.hasMoreTokens()){
                st = new StringTokenizer(br.readLine());
            }
            set.add(Integer.parseInt(st.nextToken()));
        }

        int m = Integer.parseInt(br.readLine());
        Set<Integer> set2 = new HashSet<>();
        for(int i = 0; i<m; i++) {
            if(!st.hasMoreTokens()){
                st = new StringTokenizer(br.readLine());
            }
            set2.add(Integer.parseInt(st.nextToken()));
        }

        solution(set,set2);

    }

    static void solution(Set<Integer> set1, Set<Integer> set2) {
        set1.retainAll(set2);
        List<Integer> answer = new ArrayList<>(set1);
        answer.sort(Comparator.naturalOrder());
        for(Integer i : answer) {
            System.out.print(i+" ");
        }
    }
}
