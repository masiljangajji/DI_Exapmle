package com.springframework.core.practice.service;

import com.springframework.core.practice.domain.lang.Language;

public class LanguageSpeakService {

    private  Language language;

    // setter 주입을 위한 기본 생성자
    public LanguageSpeakService(){
    }
    public LanguageSpeakService(Language language) {
        this.language = language;
    }


    public void setLanguage(Language language) {
        this.language = language;
    }

    public void speak() {
        language.hello();
    }

}
