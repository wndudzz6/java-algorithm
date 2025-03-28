package baehw;

import java.util.Stack;

public class Hw1Pancake {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] pancakes = new int[]{9, 2, 1, 10, 4, 12, 7, 8};
        pancakes = pancakeSort(pancakes,stack);
        for (int i = 0; i < pancakes.length; i++) {
            System.out.print(pancakes[i]+" ");
        }

    }

    static int[] pancakeSort(int[] pancakes, Stack<Integer> stack) {
        for (int currSize = pancakes.length; currSize > 1; currSize--) {
            // 최대 값의 인덱스를 찾기
            int maxIdx = findMax(pancakes, currSize);

            // 최대 값이 이미 올바른 위치에 있지 않다면
            if (maxIdx != currSize - 1) {
                // 최대 값이 첫 번째 위치에 있지 않은 경우, 최대 값을 맨 위로
                if (maxIdx != 0) {
                    flip(pancakes, maxIdx, stack);
                }

                // 전체 배열을 뒤집어서 최대 값을 마지막 위치로 이동
                flip(pancakes, currSize - 1, stack);
            }
        }
        return pancakes;
    }

    private static int findMax(int[] pancakes, int n) {
        int maxIdx = 0;
        for (int i = 1; i < n; i++) {
            if (pancakes[i] > pancakes[maxIdx]) {
                maxIdx = i;
            }
        }
        return maxIdx;
    }

    static void flip(int[] pancakes, int end, Stack<Integer> stack) {
        for (int i = 0; i <= end; i++) {
            stack.push(pancakes[i]);
        }
        for (int i = 0; i <= end; i++) {
            pancakes[i] = stack.pop();
        }
    }


}
