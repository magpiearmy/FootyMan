package com.footyman.engine;

import com.footyman.domain.Player;
import com.footyman.domain.Team;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Match {

    private Team home;
    private Team away;

    public Match(Team home, Team away) {
        this.home = home;
        this.away = away;
    }

    public Result play(/*Team home, Team away*/) {
        Random rand = new Random();

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

        double mentalityFactor = rand.nextDouble() % 1;
        double homeMent = getAverageMentality(home.getPlayers()) * mentalityFactor;
        double awayMent = getAverageMentality(away.getPlayers()) * mentalityFactor;

        int homeGoals = rand.nextInt(10);
        int awayGoals = rand.nextInt(10);

        return new Result(homeGoals, awayGoals);
    }

    private double getAverageAbility(Collection<Player> players) {
        return players.stream()
                .mapToInt(Player::getAbility)
                .average()
                .orElse(0);
    }

    public double getAverageMentality(Collection<Player> players) {
        return players.stream()
                .mapToInt(Player::getMentality)
                .average()
                .orElse(0);
    }
}
