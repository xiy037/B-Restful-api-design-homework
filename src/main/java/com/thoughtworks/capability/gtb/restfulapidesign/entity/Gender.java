package com.thoughtworks.capability.gtb.restfulapidesign.entity;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Gender {
    MALE("male"), FEMALE("female");

    @JsonValue
    private String gender;

    Gender(String gender) {
        this.gender = gender;
    }
}
