import ru.netology.StatisticsService;

public class Statistics {
    public static void main(String[] args) {
        int statistics[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatisticsService statisticsService = new StatisticsService(statistics);
//       statisticsService.calculateSumOfSales();
//        statisticsService.calculateSalesAverage();
//        statisticsService.showMonthOfMaxSales();
//        statisticsService.showMonthOfMinimumSales();
        statisticsService.showMonthsQuantityWithSalesUnderAverage();
//        statisticsService.showMonthsQuantityWithSalesAboveAverage();

    }
}
