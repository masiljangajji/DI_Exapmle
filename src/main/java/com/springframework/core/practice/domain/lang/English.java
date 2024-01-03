package com.springframework.core.practice.domain.lang;

import org.springframework.stereotype.Component;

@Component
public class English implements Language{
    @Override
    public void hello() {
        System.out.println("Hello");
    }
}
