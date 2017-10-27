package com.footyman.domain;

import com.footyman.engine.Formation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Team {
    private List<Player> players = new ArrayList<>();

    public List<Player> getPlayers() {
        return players;
    }


    public int getTotalAbility() {
        return players.stream()
                .mapToInt(p -> p.getAbility())
                .sum();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public Formation buildFormation() {
        assert(players.size() >= 11);
        Formation f = new Formation();
        f.addKeeper(players.get(0));
        for (int i = 1; i < 11; i++) {
            if (f.getTotalPlayers() < 5) {
                f.addDefender(players.get(i));
            } else if (f.getTotalPlayers() < 9) {
                f.addMidfielder(players.get(i));
            } else if (f.getTotalPlayers() < 11) {
                f.addForward(players.get(i));
            }
        }
        return f;
    }
}
