package string;

import java.util.Scanner;

//강의 듣기 이해가 안돼
public class ShortestWordDistance {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      char t = sc.next().charAt(0);

      int[] distances = new int[s.length()];
      int distance = 100;

      for(int i = 0; i < s.length(); i++){
          if(s.charAt(i) == t){
              distance = 0;
          }else {
              distance++;
          }distances[i] = distance;
      }

    }
}
