package org.alexia.poc;


public class Hook {
    private int count;
    public Hook(int countInit) {
        this.count = countInit;
    }

    public int addOne() {
        return ++count;
    }

}
