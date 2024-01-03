package com.springframework.core.practice.service;

import com.springframework.core.practice.domain.lang.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class LanguageSpeakService {

    // 필드주입
    @Autowired
    @Qualifier("english")
    private Language language;


    public void speak() {
        language.hello();
    }

}
