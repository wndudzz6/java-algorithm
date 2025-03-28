package string;

import java.util.Scanner;

//5. 특정 문자 뒤집기
public class P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        int[] index = new int[sb.length()];

        for(int i =0; i<sb.length(); i++){
            char ch = sb.charAt(i);
            if(Character.isLetter(ch)){
                index[i] = 1;
            } else {
                index[i] = 0;
            }
        }
        StringBuilder letter = new StringBuilder();
        for(int i =0; i<sb.length(); i++){
            if(index[i] == 1){
                letter.append(sb.charAt(i));
            }
        }letter.reverse();

        int letterIndex = 0; //뒤집은 알파벳을 원래 위치에 넣기 / 한번에 생각 못함

        for(int i =0; i<sb.length(); i++){
            if(index[i] == 1){
                sb.setCharAt(i, letter.charAt(letterIndex++));
            }
        }
        System.out.println(sb.toString());
    }
}
