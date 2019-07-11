package com.yankovich;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "RESTFortuneService: inside getFortune()";
    }
}
