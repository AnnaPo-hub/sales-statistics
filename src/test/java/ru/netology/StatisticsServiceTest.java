package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {
    int statistics[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    int expectedSum = 180;
    int expectedAverage = 15;
    int expectedMonthOfMaxSales = 8;
    int expectedMonthOfMinimumSales  =9;
    int expectedMonthsQuantityWithSalesUnderAverage = 5;
    int expectedMonthsQuantityWithSalesAboveAverage =5;


    @Test
    public void calculateSumOfSales() {

//        StatisticsService statisticsService = new StatisticsService(statistics);
//        int actual = statisticsService.calculateSumOfSales();
//        assertEquals(expectedSum, actual);

        assertEquals(expectedSum, new StatisticsService(statistics).calculateSumOfSales());
    }



    @Test
    public void calculateSalesAverage() {
        StatisticsService statisticsService = new StatisticsService(statistics);
        int actual = statisticsService.calculateSalesAverage();
        assertEquals(expectedAverage, actual);
    }


    @Test
    public void showMonthOfMaxSales() {
        StatisticsService statisticsService = new StatisticsService(statistics);
        int actual = statisticsService.showMonthOfMaxSales();
        assertEquals(expectedMonthOfMaxSales, actual);
    }

    @Test
    void showMonthOfMinimumSales() {
        StatisticsService statisticsService = new StatisticsService(statistics);
        int actual = statisticsService.showMonthOfMinimumSales();
        assertEquals(expectedMonthOfMinimumSales, actual);
    }

    @Test
    void showMonthsQuantityWithSalesUnderAverage() { //количество меньше среднего
        StatisticsService statisticsService = new StatisticsService(statistics);
        int actual = statisticsService.showMonthsQuantityWithSalesUnderAverage();
        assertEquals(expectedMonthsQuantityWithSalesUnderAverage, actual);

    }

    @Test
    public void showMonthsQuantityWithSalesAboveAverage() {
        StatisticsService statisticsService = new StatisticsService(statistics);
        int actual = statisticsService.showMonthsQuantityWithSalesAboveAverage();
        assertEquals(expectedMonthsQuantityWithSalesAboveAverage, actual);
    }
}
