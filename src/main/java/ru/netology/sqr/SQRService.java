package ru.netology.sqr;

public class SQRService {

    public int calculate(int limitMin, int limitMax) {

        int count = 0;
        for (int num = 10; num <= 99; num++) {
            if (num * num >= limitMin && num * num <= limitMax) {
                count++;
            }
        }
        return count;
    }
}


