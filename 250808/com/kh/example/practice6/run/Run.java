package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {
    public static void main(String[] args) {

        Book book = new Book();

        Book book2 = new Book("해리포터","블룸즈버리 퍼블리싱","J.K.롤링");

        String title = "반지의 제왕";
        String publisher = "앨런 & 언윈";
        String author = "J.R.R.톨킨";
        int price = 49000;
        double discountRate = 10;


        Book book3 = new Book(title,publisher,author,price,discountRate);

        book.inform();
        book2.inform();
        book3.inform();


    }
}
