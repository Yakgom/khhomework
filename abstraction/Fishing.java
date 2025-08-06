package com.kh.pratice.abstraction;

public class Fishing {

    public String location;
    public String fishType;
    public int totalFishCount;
    public int fishingTime;
    public boolean hasBait;




    public void catchFishing() {
        if(!hasBait) {
            totalFishCount++;
        }
        else if(hasBait) {
            totalFishCount +=2;
        }
        fishingTime += 15;
        System.out.println("물고기를 낚았습니다!\n 현재 물고기 수 : " + totalFishCount +"마리입니다.");
    }

}
