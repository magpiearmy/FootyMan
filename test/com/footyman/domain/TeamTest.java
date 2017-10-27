package com.footyman.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeamTest {

    @Test
    void testGetTotalAbility() {
        Team team = new Team();
        team.addPlayer(new Player(6, 3));
        team.addPlayer(new Player(4, 6));
        team.addPlayer(new Player(9, 8));
        assertEquals(19, team.getTotalAbility(), "Total team ability calculated wrong");
    }

}