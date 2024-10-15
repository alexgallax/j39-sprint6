package edu.praktikum.sprint6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SailTest {

    @Test
    public void getMaxPowerTest() {
        Sail sail = new Sail(2);

        int actual = sail.getMaxPower();

        assertEquals(6, actual);
    }
}
