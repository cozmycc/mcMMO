package com.gmail.nossr50.datatypes.validation;

public class NonNullRule<T> extends Rule<T> {
    @Override
    public void applyRule(T object) throws NullPointerException {
        if(object == null)
            throw new NullPointerException();
    }
}
