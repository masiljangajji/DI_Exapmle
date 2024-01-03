package com.springframework.core.practice.domain.lang;

public class Korean implements Language {
    @Override
    public void hello() {
        System.out.println("안녕하세요");
    }
}
