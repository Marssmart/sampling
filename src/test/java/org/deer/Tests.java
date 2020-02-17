package org.deer;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.fail;

public class Tests {

    @Test
    void testFail() {
        fail("Should allways fail");
    }

    @Test
    void testSuccess() {
        //NOOP
    }

    @Test
    void testUnstable() {
        if (new Random().nextBoolean()) {
            fail("Conditionally failed");
        }
    }

}
