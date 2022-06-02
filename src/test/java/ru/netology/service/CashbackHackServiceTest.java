package ru.netology.service;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldGetRemains200() {

        int amount = 800;

        int actual = service.remain(amount);
        int expected = 200;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldGetRemains1000() {

        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldGetRemains1100() {

        int amount = -100;

        int actual = service.remain(amount);
        int expected = 1100;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldGetRemains1() {

        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldGetRemains1000ToNextCashBack() {

        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldGetRemains999() {

        int amount = 1001;

        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldGetRemains1000WhenBigAmount() {

        int amount = 1000000000;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }
}