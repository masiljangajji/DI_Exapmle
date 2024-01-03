package com.springframework.core.practice.service;

import com.springframework.core.practice.domain.chef.Chef;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class ChefCookService {

    private final Chef chef;

    public ChefCookService(Chef chef) {
        this.chef = chef;
    }

    public void makeFood() {
        chef.cook();
    }

}
