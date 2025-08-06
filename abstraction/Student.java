package com.kh.pratice.abstraction;

public class Student {

    public String name;
    public int age;
    public String schoolLevel;
    public int grade;
    public int math;
    public int english;
    public int koreanLanguage;
    public int science;


    public void avg() {
        double avg = (double) (math + english + koreanLanguage + science) / 4;
        System.out.printf("학생의 평균 점수는 %.2f 입니다." , avg);
    }

    public void studying() {
        System.out.println("공부를 합니다!");

        int num1 = (int) (Math.random() * 6) + 1;
        int num2 = (int) (Math.random() * 6) + 1;
        int num3 = (int) (Math.random() * 6) + 1;
        int num4 = (int) (Math.random() * 6) + 1;

        math += num1;
        if (math > 100) {
            math = 100;
        }


        english += num2;
        if (english > 100) {
            english = 100;
        }


        science += num3;
        if (science > 100) {
            science = 100;
        }


        koreanLanguage += num4;
        if (koreanLanguage > 100) {
            koreanLanguage = 100;
        }
    }

    public void hangOut() {
        System.out.println("놉니다!");

        int num1 = (int) (Math.random() * 6) + 1;
        int num2 = (int) (Math.random() * 6) + 1;
        int num3 = (int) (Math.random() * 6) + 1;
        int num4 = (int) (Math.random() * 6) + 1;

        math -= num1;
        if (math < 0) math = 0;

        english -= num2;
        if (english < 0) english = 0;

        science -= num3;
        if (science < 0) science = 0;

        koreanLanguage -= num4;
        if (koreanLanguage < 0) koreanLanguage = 0;


    }


}
