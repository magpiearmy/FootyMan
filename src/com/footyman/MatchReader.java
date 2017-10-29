package com.footyman;

import com.footyman.domain.Player;
import com.footyman.domain.Team;
import com.footyman.engine.Match;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MatchReader {
    private static final String FILENAME = "resources/testMatch";

    private static final int POS = 0;
    private static final int ABILITY = 1;
    private static final int MENTALITY = 2;

    public Match readMatch() throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(FILENAME));

        Team home = new Team();
        Team away = new Team();

        boolean isHome = true;
        String line;
        while ((line = reader.readLine()) != null) {
            if (line.equals("=")) {
                isHome = false;
            } else if (isHome) {
                home.addPlayer(parsePlayer(line));
            } else {
                away.addPlayer(parsePlayer(line));
            }
        }

        return new Match(home, away);
    }

    private Player parsePlayer(String line) {
        String[] attributes = line.split(",");
        return new Player(Integer.parseInt(attributes[ABILITY]), Integer.parseInt(attributes[MENTALITY]));
    }
}
