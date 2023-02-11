package com.michau.hltvclone.match;

public enum MatchFormat {
    BO1(1),
    BO3(3),
    BO5(5);

    public final int value;
    MatchFormat(int value) {
        this.value = value;
    }
}
