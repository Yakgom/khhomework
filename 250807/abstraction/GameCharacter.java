package com.kh.pratice.abstraction;

import java.util.Scanner;

public class GameCharacter {

    private String characterName;
    private String job;
    private int exp;
    private int level;
    private String weapon;
    private String role;
    private int gold;

    public GameCharacter() {

    }

    public GameCharacter(String characterName, String job, int exp, int level, String weapon, String role, int gold) {
        this.characterName = characterName;
        this.job = job;
        this.exp = exp;
        this.level = level;
        this.weapon = weapon;
        this.role = role;
        this.gold = gold;
    }


    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public void makeMoney() {
        gold += 500;
        System.out.println("골드를 법니다.");
    }

    public void grinding() {
        System.out.println("캐릭터가 사냥을 합니다.");
        exp += 30;
        if (exp >= 100) {
            level++;
            System.out.println("경험치가 다차서 레벨업을 합니다.");
            exp = exp % 100;
        }
        System.out.println("경험치가 30 올랐습니다");
    }

    public void changeJob() {
        Scanner sc = new Scanner(System.in);
        System.out.println("현재 직업명 : " + job);
        System.out.print("변경할 직업명을 적어주세요 > ");
        job = sc.nextLine();
        System.out.println("직업이 " + job + "으로 변경되었습니다.");
    }

    public void characterInfo() {
        Scanner sc = new Scanner(System.in);

        while (true) {


            System.out.println();
            System.out.println("==========캐릭터 정보==========");
            System.out.println("캐릭터 " + characterName + "의 정보");
            System.out.println("캐릭터 직업 : " + job);
            System.out.println("캐릭터 레벨 : " + level);
            System.out.println("캐릭터 경험치 : " + exp + "/100");
            System.out.println("캐릭터 무기 : " + weapon);
            System.out.println("캐릭터 역할 : " + role);
            System.out.println("현재 캐릭터 골드 : " + gold + "Gold");
            System.out.println("=============================");
            System.out.println();


            System.out.println("1.골드 벌기 / 2.사냥하기 / 3.직업변경 /4.프로그램 종료");
            System.out.print("무엇을 할지 정해주세요 > ");
            int userInput = sc.nextInt();
            sc.nextLine();

            if (userInput == 1) {
                makeMoney();
            } else if (userInput == 2) {
                grinding();
            } else if (userInput == 3) {
                changeJob();
            } else if (userInput == 4) {
                System.out.println("종료합니다.");
                break;
            }


        }
    }

    public String info() {
        return "characterName : " + characterName +
                ", job : " + job +
                ", exp : " + exp +
                ", level : " + level +
                ", weapon : " + weapon +
                ", role : " + role +
                ", gold : " + gold;
    }
}
