package ru.netology.stats;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;


public class StatsServiceTest {

    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void correctSum() {
        StatsService service = new StatsService();

        long expected = 180;
        long actual = service.sumSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void correctMid() {
        StatsService service = new StatsService();

        long expected = 15;
        long actual = service.avAmount(sales);
        assertEquals(expected, actual);
    }

    @Test
    void numbOfMonthMaxSales() {
        StatsService service = new StatsService();

        int expected = 8;
        long actual = service.maxSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void numdOfMonthMinSales() {
        StatsService service = new StatsService();

        int expected = 9;
        long actual = service.minSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void quantityMonthUnderMidSales() {
        StatsService service = new StatsService();

        int expected = 5;
        long actual = service.underMid(sales);
        assertEquals(expected, actual);
    }

    @Test
    void quantityMonthUpperMidSales() {
        StatsService service = new StatsService();

        int expected = 5;
        long actual = service.upperMid(sales);
        assertEquals(expected, actual);
    }
}
