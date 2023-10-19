package com.epam.mjc.stage0;

public class Animal {
    private static final String DESCRIPTION_FORMAT = "This animal is mostly %s. It has %d %s and %s fur.";
    private static final String TRUE_HAS_FUR_PREPOSITION = "a";
    private static final String FALSE_HAS_FUR_PREPOSITION = "no";
    private static final String PAW_PLURAL = "paws";
    private static final String PAW_SINGULAR = "paw";
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        return DESCRIPTION_FORMAT.formatted(color, numberOfPaws, numberOfPaws == 1 ? PAW_SINGULAR : PAW_PLURAL,
                hasFur ? TRUE_HAS_FUR_PREPOSITION : FALSE_HAS_FUR_PREPOSITION);
    }
}
