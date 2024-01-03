package com.springframework.core.practice.language.service;

import com.springframework.core.practice.language.domain.Language;

public class LanguageSpeakService {

    private final Language language;

    public LanguageSpeakService(Language language) {
        this.language = language;
    }

    public void speak() {
        language.hello();
    }

}
