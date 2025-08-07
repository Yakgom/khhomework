package com.kh.pratice.abstraction;

public class Fishing {

    private String location;
    private String fishType;
    private int totalFishCount;
    private int fishingTime;
    private boolean hasBait;

    public Fishing() {
    }

    public Fishing(String location, String fishType, int totalFishCount, int fishingTime, boolean hasBait) {
        this.location = location;
        this.fishType = fishType;
        this.totalFishCount = totalFishCount;
        this.fishingTime = fishingTime;
        this.hasBait = hasBait;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getFishType() {
        return fishType;
    }

    public void setFishType(String fishType) {
        this.fishType = fishType;
    }

    public int getTotalFishCount() {
        return totalFishCount;
    }

    public void setTotalFishCount(int totalFishCount) {
        this.totalFishCount = totalFishCount;
    }

    public int getFishingTime() {
        return fishingTime;
    }

    public void setFishingTime(int fishingTime) {
        this.fishingTime = fishingTime;
    }

    public boolean getIsHasBait() {
        return hasBait;
    }

    public void setHasBait(boolean hasBait) {
        this.hasBait = hasBait;
    }

    public void catchFishing() {
        if (!hasBait) {
            totalFishCount++;
        } else if (hasBait) {
            totalFishCount += 2;
        }
        fishingTime += 15;
        System.out.println("물고기를 낚았습니다!\n 현재 물고기 수 : " + totalFishCount + "마리입니다.");
    }

    public String info() {
        return "location : " + location + "fishType : " + fishType + "totalFishCount : " + totalFishCount + "fishingTime : " + fishingTime + "hasBait : " + hasBait;
    }

}