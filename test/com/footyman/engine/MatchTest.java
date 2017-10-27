package com.footyman.engine;

import com.footyman.domain.Player;
import com.footyman.domain.Team;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class MatchTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testPlay() {
        Match match = new Match();
        Team home = new Team();
        home.addPlayer(new Player(5, 6));
        home.addPlayer(new Player(6, 6));
        home.addPlayer(new Player(7, 6));
        home.addPlayer(new Player(3, 6));
        home.addPlayer(new Player(5, 6));
        home.addPlayer(new Player(4, 6));
        home.addPlayer(new Player(6, 6));
        home.addPlayer(new Player(7, 6));
        home.addPlayer(new Player(8, 6));
        home.addPlayer(new Player(9, 6));
        home.addPlayer(new Player(7, 6));

        Team away = new Team();
        away.addPlayer(new Player(7, 6));
        away.addPlayer(new Player(9, 6));
        away.addPlayer(new Player(7, 6));
        away.addPlayer(new Player(9, 6));
        away.addPlayer(new Player(10, 6));
        away.addPlayer(new Player(7, 6));
        away.addPlayer(new Player(10, 6));
        away.addPlayer(new Player(7, 6));
        away.addPlayer(new Player(8, 6));
        away.addPlayer(new Player(9, 6));
        away.addPlayer(new Player(8, 6));

        Result result = match.play(home, away);
    }

}