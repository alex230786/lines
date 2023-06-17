package ru.netology.maven;

public class StatsService {
    public long minSales(long[] sales) {
        long minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (long i = 0; i < sales.length; i++) {
            if (sales[(int) i] <= sales[(int) minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }
        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на
    }

    public long sumSales(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }

    public long averageSale(long[] sales) {
        return sumSales(sales) / 12;
    }

    public long maxSales(long[] sales) {
        long maxMonth = 0;

        for (long i = 0; i < sales.length; i++) {
            if (sales[(int) i] >= sales[(int) maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public long belowAverageSales(long[] sales) {
        long below = 0;
        for (long sale : sales) {
            if (sale < averageSale(sales)) {
                below++;
            }
        }
        return below;

    }

    public long aboveAverageSales(long[] sales) {
        long above = 0;
        for (long sale : sales) {
            if (sale > averageSale(sales)) {
                above++;
            }
        }
        return above;
    }


}
