package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class CashbackHackService1Test {

    @Test
    void remain999() {
        int amount = 999;
        int expected = 1;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    void remain1000() {
        int amount = 1000;
        int expected = 0;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    void remain1001() {
        int amount = 1001;
        int expected = 999;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
}
