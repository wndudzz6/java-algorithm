package twopointers;
import java.util. *; //import 기억해두도록 하자.

//1. 두 배열 합치기 ~ 병합 정렬 생각함 : 런타임 에러 + 오답 -> 그냥 sort쓰자.
public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            list.add(sc.nextInt());
        }

        list.sort(Comparator.naturalOrder());

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }


    }

}
