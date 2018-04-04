package com.example.demo;

import org.springframework.stereotype.Component;

/**
 * Created by sgl on 18/4/4.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
