package com.kh.pratice.run;

import com.kh.pratice.abstraction.GameCharacter;

import java.util.Scanner;

public class GameCharacterRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        GameCharacter ch = new GameCharacter();

        System.out.println("게임 캐릭터 만들기");

        System.out.print("게임 캐릭터의 이름을 정해주세요 > ");
        ch.setCharacterName(sc.next());
        System.out.print("게임 캐릭터의 직업을 정해주세요 > ");
        ch.setJob(sc.next());
        System.out.print("게임 캐릭터의 레벨을 정해주세요 > ");
        ch.setLevel(sc.nextInt());
        sc.nextLine();
        System.out.print("게임 캐릭터의 무기를 정해주세요 > ");
        ch.setWeapon(sc.next());
        System.out.print("게임 캐릭터의 역할을 정해주세요 > ");
        ch.setRole(sc.next());
        System.out.print("게임 캐릭터의 초기자금을 정해주세요 > ");
        ch.setGold(sc.nextInt());
        sc.nextLine();


        ch.characterInfo();


    }
}
