package com.springframework.core.practice;

import com.springframework.core.practice.domain.chef.AmericanChef;
import com.springframework.core.practice.domain.chef.KoreanChef;
import com.springframework.core.practice.service.ChefCookService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

// 이건 설정하는 파일이야
@Configuration
public class JavaConfig {

    @Bean
    public AmericanChef americanChef() {
        return new AmericanChef();
    }

    @Bean
    public KoreanChef koreanChef() {
        return new KoreanChef();
    }

    // 이런 방식을 메서드 주입방식이라 합니다.
    @Bean
    ChefCookService chefCookService() {
        return new ChefCookService(americanChef());
    }

}
