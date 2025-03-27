package string;

import java.util.Scanner;

//강의 듣기 이해가 안돼
public class ShortestWordDistance {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      char t = sc.next().charAt(0);

      int[] distances = new int[s.length()];
      int distance = 1000;

      for(int i = 0; i < s.length(); i++){
          if(s.charAt(i) == t){
              distance = 0;
          }else {
              distance++;
          }distances[i] = distance;
      }

      //이번엔 역순으로 하기
      for(int i = distances.length - 1; i >= 0; i--){
          if(s.charAt(i) == t)
              distance = 0;
          else {
              distance++;
              if(distances[i] > distance){
                  distances[i] = distance;
              }
          }
      }

      for(int i = 0; i < distances.length; i++){
          System.out.print(distances[i]+" ");
      }

    }
}
