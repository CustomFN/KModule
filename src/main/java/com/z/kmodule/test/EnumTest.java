package com.z.kmodule.test;

public enum EnumTest {
    A("A", 100),
    B("B", 222),
    C("C", 32),
    AC("AC", 223),
    ;

    private String name;
    private int rank;

    EnumTest(String name, int rank) {
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public int getRank() {
        return rank;
    }
}
