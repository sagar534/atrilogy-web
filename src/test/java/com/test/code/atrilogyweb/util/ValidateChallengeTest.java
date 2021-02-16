package com.test.code.atrilogyweb.util;

import com.test.code.atrilogyweb.model.Challenge;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class ValidateChallengeTest {


    @Test
    public void testIsPassingTrue() {

        Collection<Challenge> challengeCollection = TestDataUtil.buildChallengeCollectionValid();

        Boolean isPassing = ValidateChallenge.isPassing(challengeCollection);
        assertTrue(isPassing);
    }

    @Test
    public void testIsPassingFalse() {
        Collection<Challenge> challengeCollection = TestDataUtil.buildChallengeCollectionInvalid();

        Boolean isPassing = ValidateChallenge.isPassing(challengeCollection);
        assertFalse(isPassing);
    }

    @Test
    public void testIsPassingNull() {
        Collection<Challenge> challengeCollection = Arrays.asList();
        Boolean isPassing = ValidateChallenge.isPassing(challengeCollection);
        assertNull(isPassing);
    }
}