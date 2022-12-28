package ru.netology.sqr;

public class SQRService {
    public int calcSqrt(int rangeStart, int rangeEnd) {
        int calc = 0;
        for (int i = 10; i <= 99; i++) {
            if ((i * i >= rangeStart) && (i * i <= rangeEnd)) {
                calc++;
            }
        }
        return calc;
    }
}

