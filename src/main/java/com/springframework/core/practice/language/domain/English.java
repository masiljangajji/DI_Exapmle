package com.springframework.core.practice.language.domain;

public class English implements Language{
    @Override
    public void hello() {
        System.out.println("Hello");
    }
}
