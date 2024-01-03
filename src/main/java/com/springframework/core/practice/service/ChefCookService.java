package com.springframework.core.practice.service;

import com.springframework.core.practice.domain.chef.Chef;

public class ChefCookService {
    private final Chef chef;

    public ChefCookService(Chef chef) {
        this.chef = chef;
    }

    public void makeFood() {
        chef.cook();
    }

}
