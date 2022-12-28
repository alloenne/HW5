package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/SQR.csv")
    public void shouldCalcExist(int expected, int rangeStart, int rangeEnd) {
        SQRService service = new SQRService();
        int actual = service.calcSqrt(rangeStart, rangeEnd);
        assertEquals(expected, actual);
    }

}
