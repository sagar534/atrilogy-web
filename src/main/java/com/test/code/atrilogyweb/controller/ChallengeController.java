package com.test.code.atrilogyweb.controller;


import com.test.code.atrilogyweb.model.Challenge;
import com.test.code.atrilogyweb.service.InterviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class ChallengeController {

    @Autowired
    private InterviewService interviewService;

    @GetMapping("/interviews/{interviewId}")
    public List<Challenge> sendChallengeService(@PathVariable String interviewId) {
        return interviewService.getInterview(interviewId);
    }
}