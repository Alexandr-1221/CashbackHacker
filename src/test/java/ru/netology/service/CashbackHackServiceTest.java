package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldRemainIfUnderThousand(){
        int actual = service.remain(499);
        int expected = 501;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldRemainIfZero(){
        int actual = service.remain(0);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldRemainIfThousand(){
        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldRemainIfOverThousand(){
        int actual = service.remain(1001);
        int expected = 999;

        assertEquals(actual, expected);
    }
}