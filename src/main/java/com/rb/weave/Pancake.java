package com.rb.weave;

import java.util.List;
import java.util.stream.Collectors;

public class Pancake {

    private char side;

    public Pancake(char side) {
        this.side = side;
    }

    public boolean isBlankSideUp() {
        return side == '-';
    }

    public void flip() {
        if (side == '+') {
            side = '-';
        } else {
            side = '+';
        }
    }

    @Override
    public String toString() {
        return String.valueOf(side);
    }

    public static List<Pancake> fromString(String pancakes) {
        return pancakes.chars()
                .mapToObj(c -> (char) c)
                .map(Pancake::new)
                .collect(Collectors.toList());
    }
}
