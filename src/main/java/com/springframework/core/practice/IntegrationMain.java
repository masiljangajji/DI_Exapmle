package com.springframework.core.practice;

import com.springframework.core.practice.domain.chef.AmericanChef;
import com.springframework.core.practice.domain.chef.KoreanChef;
import com.springframework.core.practice.domain.lang.English;
import com.springframework.core.practice.domain.lang.Korean;
import com.springframework.core.practice.service.ChefCookService;
import com.springframework.core.practice.service.LanguageSpeakService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IntegrationMain {

    public static void main(String[] args) {

        // Context에 등록하는 메타데이터의 형식이 다를 뿐 똑같은 Context에 등록하는 것

        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                // resources/beans.xml 파일을 읽어서 컨테이너에 객체 등록하겠다.
                "beans.xml")) {

            English english = context.getBean("english", English.class);
            Korean korean = context.getBean("korean", Korean.class);
            english.hello();
            korean.hello();


            LanguageSpeakService languageSpeakService =
                    context.getBean("languageSpeakService", LanguageSpeakService.class);

            languageSpeakService.speak();
        }

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.springframework.core.practice");

        AmericanChef americanChef=context.getBean("americanChef", AmericanChef.class);
        americanChef.cook();

        KoreanChef koreanChef=context.getBean("koreanChef", KoreanChef.class);
        koreanChef.cook();

        ChefCookService chefCookService = context.getBean("chefCookService", ChefCookService.class);

        chefCookService.makeFood();

    }
}
