package com.springframework.core.practice.language;

import com.springframework.core.practice.language.domain.English;
import com.springframework.core.practice.language.domain.Korean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlMain {


    public static void main(String[] args) {

        // 컨텍스트 등록을 돕는 메타데이터로 xml 선택시 ClassPathXmlApplicationContext 사용
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                // resources/beans.xml 파일을 읽어서 컨테이너에 객체 등록하겠다.
                "beans.xml")) {

            English english = context.getBean("english", English.class);
            Korean korean = context.getBean("korean", Korean.class);
            english.hello();
            korean.hello();
        }

    }

}
