package com.footyman.domain;

public class Player {
    private int ability;
    private int mentality;

    public Player(int ability, int mentality) {
        this.ability = ability;
        this.mentality = mentality;
    }

    public int getAbility() {
        return ability;
    }

    public void setAbility(int ability) {
        this.ability = ability;
    }

    public int getMentality() {
        return mentality;
    }

    public void setMentality(int mentality) {
        this.mentality = mentality;
    }
}
