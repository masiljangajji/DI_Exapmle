package com.springframework.core.practice.service;

import com.springframework.core.practice.domain.chef.Chef;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ChefCookService {

    //// Autowired 어노테이션 기반 설정
    @Autowired
    // americanChef 이름을 가진 빈을 사용하겠다
    @Qualifier("americanChef")
    private  Chef chef;

    public ChefCookService() {
    }

    public void makeFood() {
        chef.cook();
    }

}
