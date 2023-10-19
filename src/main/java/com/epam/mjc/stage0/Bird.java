package com.epam.mjc.stage0;

public class Bird extends Animal {

    private static final String DESCRIPTION_MESSAGE = " Moreover, it has 2 wings and can fly.";
    private static final String BIRD_COLOR = "blue";
    private static final int NUMBER_OF_PAWS = 2;

    public Bird() {
        super(BIRD_COLOR, NUMBER_OF_PAWS, false);
    }

    @Override
    public String getDescription() {
        return super.getDescription().concat(DESCRIPTION_MESSAGE);
    }
}