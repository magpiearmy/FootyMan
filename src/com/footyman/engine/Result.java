package com.footyman.engine;

public class Result {
    private int homeGoals = 0;
    private int awayGoals = 0;

    public Result(int homeGoals, int awayGoals) {
        this.homeGoals = homeGoals;
        this.awayGoals = awayGoals;
    }

    public int getHomeGoals() {
        return homeGoals;
    }

    public int getAwayGoals() {
        return awayGoals;
    }
}
