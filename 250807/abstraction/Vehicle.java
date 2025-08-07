package com.kh.pratice.abstraction;

public class Vehicle {

    private String type;
    private String name;
    private int speed = 0;
    private String color;
    private boolean engine = false;

    public Vehicle() {

    }

    public Vehicle(String type, String name, int speed, String color, boolean engine) {
        this.type = type;
        this.name = name;
        this.speed = speed;
        this.color = color;
        this.engine = engine;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getEngine() {
        return engine;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

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

    public String info() {
        return "type : " + type +
                ", name : " + name +
                ", speed : " + speed +
                ", color : " + color +
                ", engine : " + engine;
    }
}
