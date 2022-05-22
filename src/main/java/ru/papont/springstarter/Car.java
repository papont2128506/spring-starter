package ru.papont.springstarter;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

    @Autowired
    CarEngine carEngine;

    public void getEngineModel() {
        System.out.println(carEngine.getEngineType());
    }
}
