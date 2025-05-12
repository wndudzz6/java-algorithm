package DFS;

// 6. 부분집합 구하기
public class P6T {
    static int n;
    static int[] ch; // 체크 배열

    static void DFS(int L){
        if (L == n + 1) {
            StringBuilder subset = new StringBuilder();
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 1) subset.append(i);
            }
            if (subset.length() > 0) System.out.println(subset); //공집합 필터
        } else {
            ch[L] = 1;       // L을 포함 (선택을 설정)
            DFS(L + 1); //(반영)
            ch[L] = 0;       // L을 포함하지 않음
            DFS(L + 1);
        }
    }

    public static void main(String[] args) {
        n = 5;
        ch = new int[n + 1];
        DFS(1);
    }
}
