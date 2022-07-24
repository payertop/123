package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

@Test
void shouldCalculate() {
    SQRService service = new SQRService();
    int limit1 = 200;
    int limit2 = 300;
    int expected = 3;


    int actual = service.calculate(limit1, limit2);

    assertEquals(actual, expected);

}

    @Test
    void shouldCalculate1() {
        SQRService service = new SQRService();
        int limit1   = 50;
        int limit2 = 400;
        int expected = 11;


        int actual = service.calculate(limit1, limit2);

        assertEquals(actual, expected);

    }

    @Test
    void shouldCalculate2() {
        SQRService service = new SQRService();
        int limit1 = 2100;
        int limit2 = 2600;
        int expected = 5;


        int actual = service.calculate(limit1, limit2);

        assertEquals(actual, expected);

    }

    @Test
    void shouldCalculate3() {
        SQRService service = new SQRService();
        int limit1  = 3500;
        int limit2 = 4400;
        int expected = 7;


        int actual = service.calculate(limit1, limit2);

        assertEquals(actual, expected);

    }
}