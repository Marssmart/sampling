package org.deer;

import java.io.ByteArrayInputStream;

public class AbusiveCodeExampleOne {

    public void doSomething(int input) {
        input = input + 27;
    }

    public int returnUnboxed() {
        Integer value = 4;
        return value;
    }

    public int unclosedInput() {
        final ByteArrayInputStream in = new ByteArrayInputStream("abdc".getBytes());
        final int read = in.read();
        return read;
    }

    public String getString() {
        return " dsa" + "ewqdsa " + "ewqdas ewq";
    }

    public int getVal() {
        return (int) 4F;
    }

    public int getVal2() {
        return (int) 4D;
    }

    public int getVal3() {
        return (int) 4F;
    }
}
