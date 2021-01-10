package com.cybertek.enums;

public enum Gender {
    FEMALE("Female"),MALE("Male");

    private final String value;

    Gender(String value) {
        this.value=value;
    }

    public String getValue(){
        return this.value;
    }
}
