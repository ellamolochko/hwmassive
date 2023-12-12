import netology.services.CalculationMethods;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CalculationMethodsTest {
    @Test
    public void AmountOfSalesTest() {
        CalculationMethods service = new CalculationMethods();
        long[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.amountofsales(months);
        int expected = 180;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MidSalesTest() {
        CalculationMethods service = new CalculationMethods();
        long[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.midsales(months);
        int expected = 15;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PeakOfSalesTest() {
        CalculationMethods service = new CalculationMethods();
        long[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.peakofsales(months);
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MinOfSalesTest() {
        CalculationMethods service = new CalculationMethods();
        long[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.minofsales(months);
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void UnderMidOfMonthsTest() {
        CalculationMethods service = new CalculationMethods();
        long[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.UnderMidOfMonths(months);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void UpMidOfMonthsTest() {
        CalculationMethods service = new CalculationMethods();
        long[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.UpMidOfMonths(months);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }

}
