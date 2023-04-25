package ru.netology.service;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void remain1000() {
        int amount = 1000;
        int expected = 0;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(expected,actual);
    }
    @org.junit.Test
    public void remain999() {
        int amount = 999;
        int expected = 1;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(expected,actual);
    }
    @org.junit.Test
    public void remain1001() {
        int amount = 1001;
        int expected = 999;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(expected,actual);
    }
    @org.junit.Test
    public void remain2000() {
        int amount = 2000;
        int expected = 0;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(expected,actual);
    }
}