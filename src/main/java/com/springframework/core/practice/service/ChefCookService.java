package com.springframework.core.practice.service;

import com.springframework.core.practice.domain.chef.Chef;

public class ChefCookService {
    private Chef chef;

    public ChefCookService() {
    }

    public void setKoreanChef(Chef chef) {
        this.chef = chef;
    }

    public void makeFood() {
        chef.cook();
    }

}
