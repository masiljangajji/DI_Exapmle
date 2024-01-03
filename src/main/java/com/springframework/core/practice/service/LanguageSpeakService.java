package com.springframework.core.practice.service;

import com.springframework.core.practice.domain.lang.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class LanguageSpeakService {

    private  final Language language;


    // Autowired 어노테이션 기반 설정
    @Autowired
    // english 이름을 가진 빈을 사용하겠다
    public LanguageSpeakService(@Qualifier("english") Language language) {
        this.language = language;
    }

    public void speak() {
        language.hello();
    }

}
