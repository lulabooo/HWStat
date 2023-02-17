package ru.netology.stats;

public class StatsService {


    public long sum(long[] sales) {
        long allSale = 0;
        for (long sale : sales)
            allSale = allSale + sale;
        return allSale;
    }

    public long average(long[] sales) {
        long salesInMonth = sum(sales) / sales.length;

        return salesInMonth;

    }

    public int monthMaxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int monthMinSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int monSalesBelowAver(long[] sales) {
        int result = 0;
        for (long sale : sales) {
            if (sale < average(sales)) {
                result++;
            }
        }
        return result;
    }

    public int monSalesOverAver(long[] sales) {
        int result = 0;
        for (long sale : sales) {
            if (sale > average(sales)) {
                result++;
            }
        }
        return result;
    }
}