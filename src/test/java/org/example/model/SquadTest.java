package org.example.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquadTest {

    Squad testSquad = new Squad("Coders", "Write Code", 7);

    @Test
    @DisplayName(value = "SQUAD NAME")
    void getSquad() {
        assertEquals("Coders", testSquad.getSquad());
    }

    @Test
    @DisplayName(value = "SQUAD CAUSE")
    void getCause() {
        assertEquals("Write Code", testSquad.getCause());
    }

    @Test
    @DisplayName(value = "SQUAD SIZE")
    void getSize() {
        assertEquals(7, testSquad.getSize());
    }

}