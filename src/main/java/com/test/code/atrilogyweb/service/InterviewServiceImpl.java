package com.test.code.atrilogyweb.service;

import com.test.code.atrilogyweb.model.Challenge;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class InterviewServiceImpl implements InterviewService {
    @Override
    public List<Challenge> getInterview(String id) {
        Challenge challenge1 = buildChallenge("question1", "answer1", true);
        Challenge challenge2 = buildChallenge("question2", "answer2", false);
        Challenge challenge3 = buildChallenge("question3", "answer3", true);
        Challenge challenge4 = buildChallenge("question4", "answer4", true);
        Challenge challenge5 = buildChallenge("question5", "answer5", true);
        Challenge challenge6 = buildChallenge("question6", "answer6", true);
        Challenge challenge7 = buildChallenge("question7", "answer7", true);
        Challenge challenge8 = buildChallenge("question8", "answer8", true);
        Challenge challenge9 = buildChallenge("question9", "answer9", true);
        List<Challenge> challengeCollection = Arrays.asList(challenge1, challenge2, challenge3, challenge4, challenge5, challenge6, challenge7, challenge8, challenge9);
        return challengeCollection;
    }

    private static Challenge buildChallenge(String question, String answer, boolean correct) {
        Challenge challenge = new Challenge();
        challenge.setQuestion(question);
        challenge.setAnswer(answer);
        challenge.setCorrect(correct);
        return challenge;
    }
}
