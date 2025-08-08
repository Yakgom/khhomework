package com.kh.example.practice1.run;

import com.kh.example.practice1.model.vo.Member;

public class Run {
    public static void main(String[] args) {

        Member member = new Member();

        String name = "고길동";

        member.changeName(name);

        member.printName();

    }
}
