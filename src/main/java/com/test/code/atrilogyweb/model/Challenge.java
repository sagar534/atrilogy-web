package com.test.code.atrilogyweb.model;

import lombok.Data;

@Data
public class Challenge {
    private String question;
    private String answer;
    private boolean correct;
}
