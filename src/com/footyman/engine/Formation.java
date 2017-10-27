package com.footyman.engine;

import com.footyman.domain.Player;

import java.util.HashSet;
import java.util.Set;

public class Formation {

    private Player keeper;
    private Set<Player> defenders = new HashSet<>();
    private Set<Player> midfielders = new HashSet<>();

    private Set<Player> forwards = new HashSet<>();

    public void addDefender(Player player) {
        defenders.add(player);
    }

    public void addMidfielder(Player player) {
        midfielders.add(player);
    }

    public void addForward(Player player) {
        forwards.add(player);
    }

    public boolean validate() {
        if (keeper == null) return false;
        return defenders.size() + midfielders.size() + forwards.size() == 10;
    }

    public void addKeeper(Player player) {
        keeper = player;
    }

    public void removeKeeper() {
        keeper = null;
    }

    public Player getKeeper() {
        return keeper;
    }

    public Set<Player> getDefenders() {
        return defenders;
    }

    public Set<Player> getMidfielders() {
        return midfielders;
    }

    public Set<Player> getForwards() {
        return forwards;
    }

    public int getTotalPlayers() {
        return defenders.size() + midfielders.size() + forwards.size() + (keeper != null ? 1 : 0);
    }
}
