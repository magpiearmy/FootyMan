package com.footyman.engine;

import com.footyman.domain.Player;
import com.footyman.domain.Team;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Match {

    public Result play(Team home, Team away) {
        int homeAbility = home.getTotalAbility();
        int awayAbility = away.getTotalAbility();

        Formation homeFormation = home.buildFormation();
        Formation awayFormation = away.buildFormation();

        Set<Player> defence = new HashSet<>(homeFormation.getDefenders());
        defence.add(homeFormation.getKeeper());
        double homeDef = getAverageAbility(defence);
        double homeMid = getAverageAbility(homeFormation.getMidfielders());
        double homeAtt = getAverageAbility(homeFormation.getForwards());

        defence = new HashSet<>(awayFormation.getDefenders());
        defence.add(awayFormation.getKeeper());
        double awayDef = getAverageAbility(defence);
        double awayMid = getAverageAbility(awayFormation.getMidfielders());
        double awayAtt = getAverageAbility(awayFormation.getForwards());

        Random rand = new Random();
        return new Result(0, 0);
    }

    private double getAverageAbility(Collection<Player> players) {
        return players.stream()
                .mapToInt(Player::getAbility)
                .average()
                .orElse(0);
    }
}
