package string;

import java.util.Scanner;

public class ExtractOnlyNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder onlyNumbers = new StringBuilder();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                onlyNumbers.append(ch);
            }
        }
        //0이 맨 앞에 있으면 안 됨 00010 -> 10
        String digit = onlyNumbers.toString();
        int number = Integer.parseInt(digit);
        System.out.println(number);


    }
}
