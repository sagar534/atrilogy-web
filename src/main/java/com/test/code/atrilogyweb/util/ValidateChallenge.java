package com.test.code.atrilogyweb.util;

import com.test.code.atrilogyweb.model.Challenge;
import org.springframework.util.CollectionUtils;

import java.util.Collection;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoublePredicate;

public interface ValidateChallenge {
    public static final double PASSING_SCORE = 87.5;

    static Boolean isPassing(Collection<Challenge> challengeCollection) {
        double totalCorrectResponse = 0;

        //Return null if there are no challenges in the collection input.
        if (CollectionUtils.isEmpty(challengeCollection)) {
            return null;
        }

        //Calculate the count of challenges whole value is correct
        int validChallengeCount = (int) challengeCollection
                .stream()
                .filter(Challenge::isCorrect)
                .count();

        //Binary operator to perform on double values and return as double
        DoubleBinaryOperator totalCorrectSum = (a, b) -> (a / b) * 100;
        totalCorrectResponse = totalCorrectSum.applyAsDouble(validChallengeCount, challengeCollection.size());

        DoublePredicate db = (x) -> x > PASSING_SCORE;
        return db.test(totalCorrectResponse);
    }
}
