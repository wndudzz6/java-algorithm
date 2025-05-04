package baehw;

public class Score {
    public static void main(String[] args) {
        int num = 202113094;
        int CODE = ( (num % 10000) * 3897 + (num / 100000)*(num/ 100000) ) % 10000;
        System.out.println(CODE);
    }
}
