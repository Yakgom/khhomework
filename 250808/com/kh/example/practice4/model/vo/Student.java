package com.kh.example.practice4.model.vo;

public class Student {

    private static int grade;
    private int classroom;
    private String name;
    private double height;
    private char gender;

    public Student() {
        grade = 3;
        classroom = 1;
        name = "월요일싫어";
        height = 180;
        gender = 'm';
    }


    public static int getGrade() {
        return grade;
    }

    public static void setGrade(int grade) {
        Student.grade = grade;
    }

    public int getClassroom() {
        return classroom;
    }

    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void infomation(){
            System.out.println(grade + "학년 " + classroom + "반 " + "이름 : " + name + " 키 : " + height + " 성별 : " + gender);
        }
    }



