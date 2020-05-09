package com.rb.weave;


import org.assertj.core.api.Assertions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

public class PancakeStackerTest {

    private PancakeStacker sut;

    @BeforeMethod
    public void setUp() {
        sut = new PancakeStacker();
    }

    @DataProvider(name = "pancake-data")
    public Object[][] pancakeData() {
        return new Object[][]{
                {Pancake.fromString("-"), 1},
                {Pancake.fromString("-+"), 1},
                {Pancake.fromString("+-"), 2},
                {Pancake.fromString("+++"), 0},
                {Pancake.fromString("--+-"), 3},
        };
    }


    @Test(dataProvider = "pancake-data")
    public void testHappySideUp(List<Pancake> pancakes, int minimumNumberOfFlips) {

        int actual = sut.calculateNumberOfFlips(pancakes);

        Assertions.assertThat(actual).isEqualTo(minimumNumberOfFlips);
    }
}