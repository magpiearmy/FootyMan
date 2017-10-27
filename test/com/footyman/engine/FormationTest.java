package com.footyman.engine;

import com.footyman.domain.Player;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FormationTest {

    @Test
    public void testValidFormation() {
        assertTrue(buildValidFormation().validate());
    }

    @Test
    public void testInvalidFormation() {
        Formation f = buildValidFormation();
        f.removeKeeper();
        assertFalse(f.validate());
    }

    private Formation buildValidFormation() {
        Formation f = new Formation();
        f.addKeeper(new Player(0,0));
        f.addDefender(new Player(0,0));
        f.addDefender(new Player(0,0));
        f.addDefender(new Player(0,0));
        f.addDefender(new Player(0,0));
        f.addMidfielder(new Player(0,0));
        f.addMidfielder(new Player(0,0));
        f.addMidfielder(new Player(0,0));
        f.addMidfielder(new Player(0,0));
        f.addForward(new Player(0,0));
        f.addForward(new Player(0,0));
        return f;
    }
}