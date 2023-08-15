package com.lnd.ratingservice.domain;

public enum RATING1 {
    FIVE_STAR(5),
    FOUR_STAR(4),
    THREE_STAR(3),
    TWO_STAR(2),
    ONE_STAR(1);
    int starVal;
    RATING1(int number) {
        starVal = number;
    }

    public int getStarVal() {
        return starVal;
    }
}
