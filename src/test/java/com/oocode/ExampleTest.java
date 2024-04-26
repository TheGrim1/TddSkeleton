package com.oocode;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

public class ExampleTest {
    @Test
    public void canAnswerTheUniversalQuestion() {
        assertThat(new Example().answer(), equalTo(42));
    }

    @Test
    public void WillFailIncorrect() {
        assertThat(new Example().answer(), not(24));
    }

}
