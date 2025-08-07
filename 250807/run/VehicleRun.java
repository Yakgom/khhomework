package com.kh.pratice.run;

import com.kh.pratice.abstraction.Vehicle;

import java.util.Scanner;

import java.util.Scanner;

public class VehicleRun {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" 🚗🚓🛺🚕🚙🚌 탈것 프로그램 🚗🚓🛺🚕🚙🚌 ");

        Vehicle vehicle = new Vehicle();

        System.out.print("이동수단 종류를 적어주세요 > ");
        vehicle.setType(sc.nextLine());

        System.out.print("이동수단의 이름을 적어주세요 > ");
        vehicle.setName(sc.nextLine());

        System.out.print("이동수단의 색깔을 적어주세요 > ");
        vehicle.setColor(sc.nextLine());

        boolean exit = false;
        while (!exit) {

            System.out.println();
            System.out.println("🚗🚓🛺🚕🚙🚌🚗🚓🛺🚕🚙🚌🚗🚓🛺🚕🚙🚌");
            System.out.println("현재 타고있는 이동수단 종류 : " + vehicle.getType());
            System.out.println("현재 타고있는 이동수단 이름 : " + vehicle.getName());
            System.out.println("현재 타고있는 이동수단 색깔 : " + vehicle.getColor());
            System.out.println("현재 타고있는 이동수단 속도 : " + vehicle.getSpeed() + "km/h");
            if (!vehicle.getEngine()) {
                System.out.println("현재 타고있는 이동수단 시동상태 : 엔진꺼져있음");
            } else {
                System.out.println("현재 타고있는 이동수단 시동상태 : 엔진이켜져있음");
            }
            System.out.println("🚗🚓🛺🚕🚙🚌🚗🚓🛺🚕🚙🚌🚗🚓🛺🚕🚙🚌");

            System.out.println("1.엔진키고끄기 / 2. 가속 / 3. 감속/ 4. 프로그램 종료");
            System.out.print("조작을 선택해주세요 > ");

            int operation = sc.nextInt();
            sc.nextLine();

            switch (operation) {
                case 1:
                    vehicle.engineOnOff();
                    break;
                case 2:
                    vehicle.acceleration();
                    break;
                case 3:
                    vehicle.deceleration();
                    break;
                case 4:
                    exit = true;
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("정확한 조작을 선택해주세요 !");
            }

        }
    }
}




