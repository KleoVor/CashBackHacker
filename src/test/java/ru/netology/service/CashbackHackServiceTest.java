package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemain1000() {

        int amount = 1000;
        int expected = 0;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(actual, expected);

    }

    @Test
    public void testRemain999() {

        int amount = 999;
        int expected = 1;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(actual, expected);

    }

    @Test
    public void testRemain1001() {

        int amount = 1001;
        int expected = 999;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(actual, expected);

    }
}