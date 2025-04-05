package twopointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P1Ref {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[] arr1 = new int[n];
        for(int i = 0; i<n; i++) {
            if(!st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            arr1[i] = Integer.parseInt(st.nextToken());
        }
        int m = Integer.parseInt(br.readLine());
        int[] arr2 = new int[m];
        for(int i = 0; i<m; i++) {
            if(!st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            arr2[i] = Integer.parseInt(st.nextToken());
        }
        List<Integer> answer = solution(arr1, arr2);
        for(int i = 0; i< answer.size(); i++){
            System.out.print(answer.get(i)+" ");
        }


    }

    static List<Integer> solution(int[] arr1, int[]arr2){
        List<Integer> answer = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;
        while(p1 < arr1.length && p2 < arr2.length){
            if(arr1[p1] < arr2[p2]){
                answer.add(arr1[p1]);
                p1++; //그냥 arr1[p1++];라고 해도 똑같음
            } else{
                answer.add(arr2[p2++]);
            }
        }
        while(p1 < arr1.length){
            answer.add(arr1[p1++]);
        }
        while(p2 < arr2.length){
            answer.add(arr2[p2++]);
        }

        return answer;
    }
}
