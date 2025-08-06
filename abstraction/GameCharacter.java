package com.kh.pratice.abstraction;

import java.util.Scanner;

public class GameCharacter {

    public String characterName;
    public String job;
    public int exp;
    public int level;
    public String weapon;
    public String role;
    public int gold;


    public void makeMoney(){
        gold += 500;
        System.out.println("골드를 법니다.");
    }
    public void grinding(){
        System.out.println("캐릭터가 사냥을 합니다.");
        exp += 30;
        if(exp >= 100){
            level++;
            System.out.println("경험치가 다차서 레벨업을 합니다.");
            exp = exp %100;
        }
        System.out.println("경험치가 30 올랐습니다");
    }
    public void changeJob(){
        Scanner sc = new Scanner(System.in);
        System.out.println("현재 직업명 : " + job);
        System.out.print("변경할 직업명을 적어주세요 > ");
        job = sc.nextLine();
        System.out.println("직업이 " + job + "으로 변경되었습니다.");
    }

}
