package com.z.kmodule.mockito.demo02;

import org.mockito.ArgumentMatcher;

import java.util.List;

public class ListOfTwoElements implements ArgumentMatcher<List> {
    @Override
    public boolean matches(List argument) {
        return argument.size() == 2;
    }
}
