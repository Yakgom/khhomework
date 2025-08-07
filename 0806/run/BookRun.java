package com.kh.pratice.run;

import com.kh.pratice.abstraction.Book;

import java.util.Scanner;

public class BookRun {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book book = new Book();

        System.out.println("📙📙📙📙📙📙독서 프로그램📙📙📙📙📙📙");

        System.out.print("책의 타이틀명을 적어주세요 > ");
        book.title=sc.nextLine();
        System.out.print("책의 작가를 적어주세요 > ");
        book.author=sc.nextLine();
        System.out.print("책의 총 페이지를 적어주세요 > ");
        book.totalPages=sc.nextInt();
        sc.nextLine();
        System.out.print("책의 장르를 적어주세요 > ");
        book.genre=sc.nextLine();
        System.out.print("책의 현재 언어를 적어주세요 > ");
        book.language=sc.nextLine();

        boolean exit = false;
        while (!exit) {

            System.out.println();
            System.out.println("📙📙📙📙📙📙📙📙📙📙📙📙📙📙📙📙📙📙📙📙📙📙📙📙");
            System.out.println("현재 읽고있는 책의 타이틀명 : " + book.title);
            System.out.println("현재 읽고있는 책의 작가 : " + book.author);
            System.out.println("현재 읽고있는 책의 장르 : " + book.genre);
            System.out.println("현재 읽고있는 책의 현재 언어 : " + book.language);
            System.out.println("현재 읽고있는 책의 페이지 : " + book.page +"/" + book.totalPages);
            System.out.println("📙📙📙📙📙📙📙📙📙📙📙📙📙📙📙📙📙📙📙📙📙📙📙📙");

            System.out.println("1.책읽기 2.책의 언어변경 3.독서 프로그램 종료");

            System.out.print("무엇을 하시겠습니까 > " );
            int choice = sc.nextInt();

            switch (choice){
                case 1: book.readBook(); break;
                case 2: book.changeLanguage(); break;
                case 3: System.out.println("종료합니다."); exit = true; break;
            }




            }

        }




    }
