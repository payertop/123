package ru.netology.sqr;

public class SQRService {

    public static int main(String[] args) {

        for (int i = 10; i < 99; i++) {

            if (i * i > 200)
                System.out.println(i);

            else if (i * i > 300) {
                return i;

            }

        }


        return 0;
    }
}

