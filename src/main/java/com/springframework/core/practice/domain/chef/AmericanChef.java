package com.springframework.core.practice.domain.chef;

public class AmericanChef implements Chef{
    @Override
    public void cook() {
        System.out.println("양식 조리");
    }
}
