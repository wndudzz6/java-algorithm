package baehw;

import java.util.Arrays;

public class Hw1 {
    public static void main(String[] args) {

        int[] arr = { 4, 5, 6, 1, 3, 2, 7};
        int min = arrMin(arr, 0);
        System.out.println("배열 최솟값: "+min);

        int sum = arrSum(arr,0);
        System.out.println("배열 합: "+sum);

        int[] selArr = selectSort(arr,0);
        printArr(selArr);

    }

    public static int arrMin(int[] arr, int index) {
        if(index == arr.length-1) { //여기서부터
            return arr[index];
        }else {
            int min = arrMin(arr, index+1);
            return arr[index] < min ? arr[index] : min;
        }
    }
    private static int arrSum(int[] arr, int index){
        if(index == arr.length-1){
            return 0; //0을 더한 후 마지막 요소부터 더해서 반환 (호출 스택)
        }
        return arr[index] + arrSum(arr, index+1);
    }

     static int[] selectSort(int[]arr, int index){
        if(index== arr.length-1){
            return arr;
        }
        int minIndex = findMinIndex(arr, index, arr.length-1);
        swap(arr, index, minIndex);
        selectSort(arr, index+1);
        return arr;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int findMinIndex(int[] arr, int current, int end) {
        if (current == end) {
            return current;
        }
        int minIndex = findMinIndex(arr, current + 1, end);
        return arr[current] < arr[minIndex] ? current : minIndex;
    }


    public static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
