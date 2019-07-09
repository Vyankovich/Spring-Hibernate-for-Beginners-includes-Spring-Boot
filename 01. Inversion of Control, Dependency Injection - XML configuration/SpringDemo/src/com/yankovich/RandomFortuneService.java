package com.yankovich;

/**
 * Created by vyankovich on 2019-07-08
 */
public class RandomFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "You've got " + Math.random() + " points boost" + " - RandomFortuneService: getFortune() method";
    }
}
