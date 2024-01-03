package com.springframework.core.practice;

import com.springframework.core.practice.domain.chef.AmericanChef;
import com.springframework.core.practice.domain.chef.KoreanChef;
import com.springframework.core.practice.domain.lang.English;
import com.springframework.core.practice.domain.lang.Korean;
import com.springframework.core.practice.service.ChefCookService;
import com.springframework.core.practice.service.LanguageSpeakService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IntegrationMain {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("com.springframework.core.practice");


        English english = context.getBean("english", English.class);
        Korean korean = context.getBean("korean", Korean.class);
        english.hello();
        korean.hello();


        LanguageSpeakService languageSpeakService =
                context.getBean("languageSpeakService", LanguageSpeakService.class);

        languageSpeakService.speak();


        AmericanChef americanChef = context.getBean("americanChef", AmericanChef.class);
        americanChef.cook();

        KoreanChef koreanChef = context.getBean("koreanChef", KoreanChef.class);
        koreanChef.cook();

        ChefCookService chefCookService = context.getBean("chefCookService", ChefCookService.class);

        chefCookService.makeFood();


    }
}
