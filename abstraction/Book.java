package com.kh.pratice.abstraction;

import java.util.Scanner;

public class Book {
    public String title;
    public String author;
    public int totalPages;
    public int page=0;
    public String genre;
    public String language;


    public void changeLanguage() {
        Scanner sc = new Scanner(System.in);
        System.out.println("현재 언어 : " + language);
        System.out.print("바꾸실 책의 언어를 정해주세요 > " );
        language = sc.nextLine();
        System.out.println("책의 언어가 : "+ language +"로 변경되었습니다.");
    }
    public void readBook(){
        page += 15;
        if(page >= totalPages){
            System.out.println("책을 전부 읽었습니다.");
            page=totalPages;
        }
    }




}
