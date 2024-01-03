package com.springframework.core.practice.domain.chef;

public class KoreanChef implements Chef{
    @Override
    public void cook() {
        System.out.println("한식 조리");
    }
}
