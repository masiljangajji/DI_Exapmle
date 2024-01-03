package com.springframework.core.practice.domain.lang;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class Korean implements Language{
    @Override
    public void hello() {
        System.out.println("안녕하세요");
    }
}
