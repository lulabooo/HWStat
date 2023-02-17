package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class StatsServiceTest {
    @Test
    public void shouldSumSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.sum(sales);
        long expected = 180;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.average(sales);
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void monthMax() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.monthMaxSales(sales);
        long expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void monthMin() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.monthMinSales(sales);
        long expected = 9;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void monSalesBelowAver() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.monSalesBelowAver(sales);
        long expected = 5;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void monSalesOverAver() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.monSalesOverAver(sales);
        long expected = 5;
        Assertions.assertEquals(expected, actual);
    }
}