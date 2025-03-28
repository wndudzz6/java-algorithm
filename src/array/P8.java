package array;

import java.util.Scanner;

//8. 등수구하기
public class P8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] nums = new int[n];
        int rank = n;

        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                if(nums[i] > nums[j]) {
                    rank--;
                } else if(nums[i] < nums[j]) {
                    rank++;
                } else{

                }
            }nums[i] = rank;
        }

        for(int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
