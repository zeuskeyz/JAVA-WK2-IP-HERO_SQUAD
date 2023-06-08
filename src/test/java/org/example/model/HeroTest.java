package org.example.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeroTest {

    Hero testHero = new Hero("Hero Name", 99,"Some Power",10, "Some Weakness", 1, "Avengers", false);

    @Test
    @DisplayName(value = "HEROES NAME")
    void getHero() {
        assertEquals("Hero Name", testHero.getHero());
    }

    @Test
    @DisplayName(value = "AGE TEST")
    void getAge() {
        assertEquals(99, testHero.getAge());
    }

    @Test
    @DisplayName(value = "POWER TYPE TEST")
    void getPower() {
        assertEquals("Some Power", testHero.getPower());
    }

    @Test
    @DisplayName(value = "POWER SCORE TEST")
    void getPower_score() {
        assertEquals(10,testHero.getPower_score());
    }

    @Test
    @DisplayName(value = "WEAKNESS TEST")
    void getWeakness() {
        assertEquals("Some Weakness", testHero.getWeakness());
    }

    @Test
    @DisplayName(value = "WEAKNESS SCORE TEST")
    void getWeakness_score() {
        assertEquals(1,testHero.getWeakness_score());
    }

    @Test
    @DisplayName(value = "SQUAD ASSIGNMENT TEST")
    void getSquad() {
        assertEquals("Avengers",testHero.getSquad());
    }

    @Test
    @DisplayName(value = "HERO DELETION STATE")
    void getDeleted() {
        assertEquals(false,testHero.getDeleted());
    }
}