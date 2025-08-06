package com.kh.pratice.run;

import com.kh.pratice.abstraction.Character;

import java.util.Scanner;

public class CharacterRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Character ch = new Character();

        System.out.println("게임 캐릭터 만들기");

        System.out.print("게임 캐릭터의 이름을 정해주세요 > ");
        ch.characterName = sc.nextLine();
        System.out.print("게임 캐릭터의 직업을 정해주세요 > ");
        ch.job = sc.nextLine();
        System.out.print("게임 캐릭터의 레벨을 정해주세요 > ");
        ch.level = sc.nextInt();
        sc.nextLine();
        System.out.print("게임 캐릭터의 무기를 정해주세요 > ");
        ch.weapon = sc.nextLine();
        System.out.print("게임 캐릭터의 역할을 정해주세요 > ");
        ch.role = sc.nextLine();
        System.out.print("게임 캐릭터의 초기자금을 정해주세요 > ");
        ch.gold = sc.nextInt();
        sc.nextLine();


        while(true){

            System.out.println();
            System.out.println("==========캐릭터 정보==========");
            System.out.println("캐릭터 " + ch.characterName + "의 정보" );
            System.out.println("캐릭터 직업 : " + ch.job);
            System.out.println("캐릭터 레벨 : " + ch.level);
            System.out.println("캐릭터 경험치 : " + ch.exp + "/100");
            System.out.println("캐릭터 무기 : " + ch.weapon);
            System.out.println("캐릭터 역할 : " + ch.role);
            System.out.println("현재 캐릭터 골드 : " + ch.gold);
            System.out.println("=============================");
            System.out.println();


            System.out.println("1.골드 벌기 / 2.사냥하기 / 3.직업변경 /4.프로그램 종료");
            System.out.print("무엇을 할지 정해주세요 > ");
            int userInput =sc.nextInt();
            sc.nextLine();

            if(userInput == 1){
            ch.makeMoney();
            }
            else if(userInput == 2){
            ch.grinding();
            }
            else if(userInput == 3){
               ch.changeJob();
            }
            else if(userInput == 4){
                System.out.println("종료합니다.");
                break;
            }



        }







    }
}
