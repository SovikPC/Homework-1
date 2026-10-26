package Homework2.ru.netology.service;

public class CustomService {

    public static final int DUTY_RATE_PER_WEIGHT_OF_THE_GOODS = 100;

    public static int calculateCustom(int price, int weight) {
        int duty = (price/100) + (weight * DUTY_RATE_PER_WEIGHT_OF_THE_GOODS);
        return duty;
    }
}
