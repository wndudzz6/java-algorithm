package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 문제 3: 도서 정렬 시스템
 * 도서의 제목과 출판 연도가 주어진다.
 * 정렬 기준
 * 출판 연도가 오래된 순
 * 같다면 제목이 사전 순으로 앞선 것이 먼저
 *
 * 입력예시
 * 3
 * DeepLearning 2016
 * Algorithms 2010
 * AIResearch 2016
 *
 * 출력예시
 * Algorithms 2010
 * AIResearch 2016
 * DeepLearning 2016
 */
public class SortingCustom3 {

    static class Book implements Comparable<Book>{
        String name;
        int year;

        Book(String name, int year) {
            this.name = name;
            this.year = year;
        }

        @Override
        public int compareTo(Book o) {
            if(this.year == o.year) return this.name.compareTo(o.name); //출판년도 먼저 체크, 이름 오름차
            else return this.year- o.year; //출판년도 오름차(오래된 순이니까 더 작아야지 숫자가)
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<Book>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int year = sc.nextInt();
            books.add(new Book(name, year));
        }
        sc.close();
        Collections.sort(books);
        for(Book b : books) System.out.println(b.name+" "+b.year);
    }

}
