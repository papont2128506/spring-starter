package ru.papont.springstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@SpringBootApplication
public class SpringStarterApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        Car bean = ctx.getBean("beanFromClass", Car.class);
        bean.getEngineModel();


        //SpringApplication.run(SpringStarterApplication.class, args);
    }

}
