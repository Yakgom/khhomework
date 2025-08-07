package com.kh.pratice.run;

import com.kh.pratice.abstraction.Student;

import java.util.Scanner;

public class StudentRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.println("학생 프로그램");

        System.out.print("학생 이름을 적어주세요 > ");
        student.name = sc.nextLine();
        System.out.print("학생의 나이를 적어주세요 >  ");
        student.age = sc.nextInt();
        if (student.age >= 17) {
            student.schoolLevel = "고등학생";
        } else if (student.age >= 14) {
            student.schoolLevel = "중학생";
        } else if (student.age >= 8) {
            student.schoolLevel = "초등학생";
        } else {
            student.schoolLevel = "???";
        }
        System.out.print("학생의 학년을 적어주세요 > ");
        student.grade = sc.nextInt();
        sc.nextLine();
        System.out.print("학생의 수학 점수를 적어주세요 > ");
        student.math = sc.nextInt();
        sc.nextLine();
        System.out.print("학생의 영어 점수를 적어주세요 > ");
        student.english = sc.nextInt();
        sc.nextLine();
        System.out.print("학생의 과학 점수를 적어주세요 > ");
        student.science = sc.nextInt();
        sc.nextLine();
        System.out.print("학생의 국어 점수를 적어주세요 > ");
        student.koreanLanguage = sc.nextInt();
        sc.nextLine();


        boolean exit = false;
        while (!exit) {

            System.out.println();
            System.out.println("📝📝📝📝📝📝📝📝📝📝📝");
            System.out.println("학생의 이름 : " + student.name);
            System.out.println("학생의 나이 : " + student.age);
            System.out.println("학생의 정보 : " + student.schoolLevel + " " + student.grade + "학년");
            System.out.println("학생의 수학점수 : " + student.math);
            System.out.println("학생의 영어점수 : " + student.english);
            System.out.println("학생의 과학점수 : " + student.science);
            System.out.println("학생의 국어점수 : " + student.koreanLanguage);
            student.avg();
            System.out.println();
            System.out.println("📝📝📝📝📝📝📝📝📝📝📝");

            System.out.println("1.공부하기 / 2. 놀기 /3. 종료");
            System.out.print("오늘은 무엇을 합니까? > ");


            int menuNo = sc.nextInt();
            switch (menuNo) {
                case 1:
                    student.studying();
                    break;
                case 2:
                    student.hangOut();
                    break;
                case 3:
                    exit = true;
                    System.out.println("종료를 합니다.");
                    break;


            }

        }
    }

}
