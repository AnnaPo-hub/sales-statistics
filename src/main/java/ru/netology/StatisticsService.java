
package ru.netology;

public class StatisticsService {
    int statistics[];
    int sum = 0;
    int average = 0;
    int max = 0;
    int min;

    public StatisticsService(int[] statistics) {
        this.statistics = statistics;
        min = statistics[0];
    }

    public int calculateSumOfSales() {
        for (int sales : statistics) {
            sum += sales;
        }
        System.out.println("Сумма всех продаж " + sum);
        return sum;

    }

    public int calculateSalesAverage() {

        if (sum == 0) {
            calculateSumOfSales();
        }

        average = sum / statistics.length;

        System.out.println("Средняя сумма продаж в месяц " + average);
        return average;

    }


    public int showMonthOfMaxSales() {
        int monthNumber = 1;
        int a = 1;

        for (int sales : statistics) {
            if (sales >= max) {
                max = sales;
                monthNumber = a;
            }
            a++;
        }

        System.out.println("Максимальная продажа " + max + " в месяце " + monthNumber);
        return monthNumber;

    }


    public int showMonthOfMinimumSales() {
        int monthCount = 1;
        int i = 1;
        for (int sales : statistics) {
            if (sales < min) {
                min = sales;
                monthCount = i;
            }
            i++;
        }

        System.out.println("Минимальные продажи " + min + " были осуществлены в месяце " + monthCount);
        return monthCount;
    }


    public int showMonthsQuantityWithSalesUnderAverage() {
        if (average==0) {calculateSalesAverage();
        }

        int monthQuantity = 0;

        for (int sales : statistics) {
            if (sales < average) {
                monthQuantity += 1;
            }

        }


        System.out.println("Количество месяцев, в которых продажи были ниже среднего: " + monthQuantity);
        return monthQuantity;

    }


    public int showMonthsQuantityWithSalesAboveAverage() {
        if (average==0) {calculateSalesAverage();
        }

        int monthQuantity = 0;
        for (int sales : statistics) {
            if (sales > average) {
                monthQuantity += 1;
            }

        }
        System.out.println("Количество месяцев, в которых продажи были выше среднего: " + monthQuantity);

        return monthQuantity;
    }
}








