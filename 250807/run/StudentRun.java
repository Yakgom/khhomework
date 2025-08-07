package com.kh.pratice.run;

import com.kh.pratice.abstraction.Student;

import java.util.Scanner;

public class StudentRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.println("학생 프로그램");

        System.out.print("학생 이름을 적어주세요 > ");
        student.setName(sc.nextLine());

        System.out.print("학생의 나이를 적어주세요 >  ");
        student.setAge(sc.nextInt());

        if (student.getAge() >= 17) {
            student.setSchoolLevel("고등학생");
        } else if (student.getAge() >= 14) {
            student.setSchoolLevel("중학생");
        } else if (student.getAge() >= 8) {
            student.setSchoolLevel("초등학생");
        } else {
            student.setSchoolLevel("???");
        }

        System.out.print("학생의 학년을 적어주세요 > ");
        student.setGrade(sc.nextInt());

        System.out.print("학생의 수학 점수를 적어주세요 > ");
        student.setMath(sc.nextInt());

        System.out.print("학생의 영어 점수를 적어주세요 > ");
        student.setEnglish(sc.nextInt());

        System.out.print("학생의 과학 점수를 적어주세요 > ");
        student.setScience(sc.nextInt());

        System.out.print("학생의 국어 점수를 적어주세요 > ");
        student.setKoreanLanguage(sc.nextInt());

        sc.nextLine(); // 버퍼 클리어

        boolean exit = false;
        while (!exit) {
            System.out.println();
            System.out.println("📝📝📝📝📝📝📝📝📝📝📝");
            System.out.println("학생의 이름 : " + student.getName());
            System.out.println("학생의 나이 : " + student.getAge());
            System.out.println("학생의 정보 : " + student.getSchoolLevel() + " " + student.getGrade() + "학년");
            System.out.println("학생의 수학점수 : " + student.getMath());
            System.out.println("학생의 영어점수 : " + student.getEnglish());
            System.out.println("학생의 과학점수 : " + student.getScience());
            System.out.println("학생의 국어점수 : " + student.getKoreanLanguage());
            student.avg();
            System.out.println();
            System.out.println("📝📝📝📝📝📝📝📝📝📝📝");

            System.out.println("1.공부하기 / 2. 놀기 / 3. 종료");
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
                default:
                    System.out.println("올바른 번호를 입력해주세요.");
            }
        }
    }
}
