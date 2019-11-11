package com.z.kmodule.mockito.demo02;

import org.mockito.ArgumentMatcher;

public class GuessArgumentMatcher implements ArgumentMatcher<Integer> {

    @Override
    public boolean matches(Integer argument) {
        return argument % 2 == 0;
    }
}
