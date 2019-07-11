package com.yankovich;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    private String[] data = { "first", "second", "third" };
    private Random random = new Random();

    @Override
    public String getFortune() {
        int index = random.nextInt(data.length);
        return "RandomFortuneService: inside getFortune() - " + data[index];
    }
}
