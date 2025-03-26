package baehw;

import java.util.Arrays;

public class Hw1 {
    public static void main(String[] args) {

        int[] arr = { 4, 5, 6, 1, 3, 2, 7};
        int min = arrMin(arr);
        System.out.println("배열 최솟값: "+min);

        int sum = arrSum(arr);
        System.out.println("배열 합: "+sum);

        int[] selArr = selectSort(arr);
        printArr(selArr);

    }

    public static int arrMin(int[] arr) {
        int[] minArr = arr.clone();
        Arrays.sort(minArr);
        int min = minArr[0];
        return min;
    }

    public static int arrSum(int[] arr) {
        return arrSum(arr,0);
    }
    private static int arrSum(int[] arr, int index){
        if(index == arr.length-1){
            return 0; //0을 더한 후 마지막 요소부터 더해서 반환 (호출 스택)
        }
        return arr[index] + arrSum(arr, index+1);
    }
    public static int[] selectSort(int[] arr){
        int[] selArr = arr.clone();
        return selArr;
    }
    private static void selectSort(int[]arr, int index){
        if(index== arr.length-1){
            return;
        }
        int minIndex = index;

    }
    public static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
