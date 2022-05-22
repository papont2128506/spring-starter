package ru.papont.springstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@SpringBootApplication
public class SpringStarterApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        CarEngine bean = ctx.getBean(CarEngine.class);
        System.out.println(bean.getEngineType());


        //SpringApplication.run(SpringStarterApplication.class, args);
    }

}
