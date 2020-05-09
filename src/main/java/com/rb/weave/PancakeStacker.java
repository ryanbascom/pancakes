package com.rb.weave;

import java.util.Collections;
import java.util.List;

public class PancakeStacker {

    public int calculateNumberOfFlips(List<Pancake> pancakes) {

        // lets reverse the stack so we can work from the bottom up logically
        Collections.reverse(pancakes);

        int flips = 0;
        for (int i = 0; i < pancakes.size(); i++) {
            if (pancakes.get(i).isBlankSideUp()) {
                flip(pancakes, i);
                flips++;
            }
        }

        return flips;
    }

    private void flip(List<Pancake> pancakes, int start) {
        for (int i = start; i < pancakes.size(); i++) {
            pancakes.get(i).flip();
        }
    }


}
