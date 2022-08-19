package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @Test
    void shouldCalculate() {
        SQRService service = new SQRService();
        int limitMin = 200;
        int limitMax = 300;
        int expected = 3;


        int actual = service.calculate(limitMin, limitMax);

        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculate1() {
        SQRService service = new SQRService();
        int limitMin = 50;
        int limitMax = 400;
        int expected = 11;


        int actual = service.calculate(limitMin, limitMax);

        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculate2() {
        SQRService service = new SQRService();
        int limitMin = 2100;
        int limitMax = 2600;
        int expected = 5;


        int actual = service.calculate(limitMin, limitMax);

        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculate3() {
        SQRService service = new SQRService();
        int limitMin = 3500;
        int limitMax = 4400;
        int expected = 7;


        int actual = service.calculate(limitMin, limitMax);

        assertEquals(expected, actual);

    }
}