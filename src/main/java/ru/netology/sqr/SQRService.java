package ru.netology.sqr;

public class SQRService {

    public int calculate(int limit1, int limit2) {

        int count = 0;
        for (int num = 10; num <= 99; num++) {
            if (num * num >= limit1 && num * num <= limit2) {
                count++;
            }
        }
        return count;
    }
}


