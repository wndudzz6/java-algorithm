package twopointers;

import java.util.*;

//2. 공통 원소 구하기 Set을 받고 List로 변경 후 버블 정렬로 정렬 / 그냥 list.sort(Comparator.naturalOrder());
public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Set<Integer> set1 = new HashSet<>();
        for(int i = 0; i<n ; i++){
            set1.add(sc.nextInt());
        }sc.nextLine();
        int m = sc.nextInt();
        Set<Integer> set2 = new HashSet<>();
        for(int i = 0; i<m ; i++){
            set2.add(sc.nextInt());
        }
        sc.close();

        set1.retainAll(set2);
        List<Integer> list = new ArrayList<>(set1);

        list.sort(Comparator.naturalOrder());

//        for(int i = 0 ; i < list.size()-1 ; i++){
//            for(int j = 0 ; j < list.size()-1-i ; j++){
//                if(list.get(j)>list.get(j+1)){
//                    Integer temp = list.get(j);
//                    list.set(j, list.get(j+1));
//                    list.set(j+1, temp);
//                }
//            }
//        }

        for(int i = 0; i < list.size() ; i++){
            System.out.print(list.get(i)+" ");
        }

    }
}
