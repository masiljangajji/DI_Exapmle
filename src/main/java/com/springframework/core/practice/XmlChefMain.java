package com.springframework.core.practice;

import com.springframework.core.practice.domain.chef.KoreanChef;
import com.springframework.core.practice.service.ChefCookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlChefMain {

    public static void main(String[] args) {

        // 컨텍스트 등록을 돕는 메타데이터로 xml 선택시 ClassPathXmlApplicationContext 사용
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                // resources/chef.xml 파일을 읽어서 컨테이너에 객체 등록하겠다.
                "chef.xml")) {

            KoreanChef koreanChef = context.getBean("koreanChef", KoreanChef.class);

            koreanChef.cook();

            ChefCookService chefCookService = context.getBean("chefCookService", ChefCookService.class);
            chefCookService.makeFood();

        }

    }

}
