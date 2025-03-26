package string;

import java.util.Scanner;

public class WordInSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");

        int length = 0;
        int index = 0;
        for(int i = 0; i < words.length; i++) {
            if(words[i].length() > length) {
                length = words[i].length();
                index = i;
            }
        }
        System.out.println(words[index]);
    }
}
