package searching;

import java.util.Arrays;
import java.util.Scanner;
/*이해가 잘 안됨 ㅠㅠ*/
//9. 뮤직비디오(결정알고리즘) ~ stream 부분 이것이 자바다 참고
//Test BinarySearching 참고
public class P9T {
    static int count(int[] arr, int capacity){
        int cnt=1, sum=0;
        for(int x : arr){
            if(sum+x>capacity){
                cnt++;
                sum=x;
            }
            else sum+=x;
        }
        return cnt;
    }

    static int solution(int n, int m, int[] arr){
        int answer=0;
        int lt=Arrays.stream(arr).max().getAsInt();
        int rt=Arrays.stream(arr).sum();
        while(lt<=rt){
            int mid=(lt+rt)/2;
            if(count(arr, mid)<=m){
                answer=mid;
                rt=mid-1;
            }
            else lt=mid+1;
        }
        return answer;
    }
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int m=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) arr[i]=kb.nextInt();
        System.out.println(solution(n, m, arr));
    }
}
