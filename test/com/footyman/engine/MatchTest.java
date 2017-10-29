package com.footyman.engine;

import com.footyman.MatchReader;
import com.footyman.domain.Player;
import com.footyman.domain.Team;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.io.IOException;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class MatchTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testPlay() {
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

        Match match = new Match(home, away);
        Result result = match.play();
    }

    @Test
    void testMatchFromFile() throws Exception {

        for (int i = 0; i < 20; i++) {
            MatchReader matchReader = new MatchReader();
            Match match = matchReader.readMatch();

            Result result = match.play();
            System.out.println(result.getHomeGoals() + " - " + result.getAwayGoals());
        }
    }
}