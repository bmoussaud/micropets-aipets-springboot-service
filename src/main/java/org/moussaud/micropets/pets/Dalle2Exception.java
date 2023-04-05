package org.moussaud.micropets.pets;

public class Dalle2Exception extends RuntimeException {

    private int value;

    public Dalle2Exception() {
    }

    public Dalle2Exception(String message, int value) {
        super(message);
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
