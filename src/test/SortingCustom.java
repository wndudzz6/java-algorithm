package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/*
 문제 1: 시험 성적 정렬
학생의 이름과 점수가 주어진다.
점수가 높은 순으로, 점수가 같다면 이름의 알파벳 순서로 오름차순 정렬하라.
입력 예시
3
Alice 90
Bob 95
Charlie 90
출력 예시
Bob 95
Alice 90
Charlie 90
* */
public class SortingCustom {

    static class Student implements Comparable<Student> {
        String name;
        int score;

        Student(String name, int score) {
            this.name = name;
            this.score = score;
        }


        @Override
        public int compareTo(Student o) {
            if(this.score == o.score) return this.name.compareTo(o.name);
            else return o.score-this.score; //성적은 내림차순
        }
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Student> students = new ArrayList<Student>();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int score = sc.nextInt();
            students.add(new Student(name, score));
        }
        sc.close();
        Collections.sort(students);
        for(Student student : students) {
            System.out.println(student.name+" "+student.score);
        }
    }
}
