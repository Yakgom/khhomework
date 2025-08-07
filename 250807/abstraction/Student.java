package com.kh.pratice.abstraction;

public class Student {

    private String name;
    private int age;
    private String schoolLevel;
    private int grade;
    private int math;
    private int english;
    private int koreanLanguage;
    private int science;

    public Student() {

    }

    public Student(String name, int age, String schoolLevel, int grade, int math, int english, int koreanLanguage, int science) {
        this.name = name;
        this.age = age;
        this.schoolLevel = schoolLevel;
        this.grade = grade;
        this.math = math;
        this.english = english;
        this.koreanLanguage = koreanLanguage;
        this.science = science;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchoolLevel() {
        return schoolLevel;
    }

    public void setSchoolLevel(String schoolLevel) {
        this.schoolLevel = schoolLevel;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getKoreanLanguage() {
        return koreanLanguage;
    }

    public void setKoreanLanguage(int koreanLanguage) {
        this.koreanLanguage = koreanLanguage;
    }

    public int getScience() {
        return science;
    }

    public void setScience(int science) {
        this.science = science;
    }

    public void avg() {
        double avg = (double) (math + english + koreanLanguage + science) / 4;
        System.out.printf("학생의 평균 점수는 %.2f 입니다.", avg);
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

    public String info() {
        return "name : " + name +
                ", age : " + age +
                ", schoolLevel : " + schoolLevel +
                ", grade : " + grade +
                ", math : " + math +
                ", english : " + english +
                ", koreanLanguage : " + koreanLanguage +
                ", science : " + science;
    }


}
