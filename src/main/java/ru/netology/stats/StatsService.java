package ru.netology.stats;

public class StatsService {

    public long sumSales(long[] sales) {
        long sum = 0;
        for (long i = 0; i < sales.length; i++) {
            sum = sum + sales[(int) i];
        }
        return sum;
    }

    public long avAmount(long[] sales) {
        long midAmount = sumSales(sales);
        {
            midAmount = midAmount / 12;
        }
        return midAmount;
    }

    public int maxSales(long[] sales) {
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

    public int minSales(long[] sales) {
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

    public int underMid(long[] sales) {
        long x = avAmount(sales);
        int unMid = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < x) {
                unMid = unMid + 1;
            }
        }
        return unMid;
    }

    public int upperMid(long[] sales) {
        long x = avAmount(sales);
        int upMid = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > x) {
                upMid = upMid + 1;
            }
        }
        return upMid;
    }
}
