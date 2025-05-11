package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//7. 좌표정렬 ~ compareTo() 부분 Test의 SortingCustom 참고
public class P7T {
    static class Point implements Comparable<Point> {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point o) {
            if(this.x == o.x) return this.y - o.y; //외워서 하는거라고 함.
            else return this.x - o.x; //음수가 리턴되어야 한다는데?
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Point> points = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            points.add(new Point(x, y));
        }
        sc.close();
        Collections.sort(points);
        for(Point p : points) {
            System.out.println(p.x + " " + p.y);
        }

    }


}
