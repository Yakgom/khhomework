package com.kh.pratice.abstraction;

public class Vehicle {

    public String type;
    public String name;
    public int speed = 0;
    public String color;
    public boolean engine = false;

    public void engineOnOff() {

        if (!engine) {
            engine = true;
            System.out.println(type + "의 엔진을 켭니다.");
        } else if (engine) {
            engine = false;
            System.out.println(type + "의 엔진을 끕니다.");
            speed = 0;
        }
    }

    public void acceleration() {
        if (engine) {
            speed += 10;
            System.out.println("가속합니다. 현재 속도 : " + speed + "km/h");

        } else if (!engine) {
            System.out.println("먼저 시동을 켜주세요.");
        }
    }

    public void deceleration() {
        if (engine && speed > 0) {
            speed -= 10;
            System.out.println("감속합니다. 현재 속도 : " + speed + "km/h");
        } else if (!engine) {
            System.out.println("먼저 시동을 켜주세요.");
        } else if (speed <= 0) {
            System.out.println("현재 속도는 " + speed + "km/h라서 감속할 수 없습니다.");
        }
    }

}
