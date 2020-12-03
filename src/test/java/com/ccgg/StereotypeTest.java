package com.ccgg;

import com.ccgg.stereotype.JavaConfig;
import com.ccgg.stereotype.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StereotypeTest {
    public static void main(String[] args) {
        ApplicationContext actx = new AnnotationConfigApplicationContext(JavaConfig.class);
        Person person = (Person) actx.getBean("person");
        System.out.println(person);
    }


}
