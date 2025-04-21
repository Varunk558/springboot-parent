package com.sb;

import com.sb.beans.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Hello world!
 */
@SpringBootApplication
public class ParentApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(ParentApplication.class, args);
        Person person = applicationContext.getBean(Person.class);
        System.out.println(person);
    }
}
