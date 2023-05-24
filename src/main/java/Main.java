import ru.netology.stats.StatsService;

public class Main {

    public static void main(String[] args) {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long a = service.sumSales(sales);
        long b = service.avAmount(sales);
        long c = service.maxSales(sales);
        long d = service.minSales(sales);
        long e = service.underMid(sales);
        long f = service.upperMid(sales);

        System.out.println("Сумма продаж = " + a);
        System.out.println("Средняя сумма продаж = " + b);
        System.out.println("Номер месяца максимальных продаж - " + c);
        System.out.println("Номер месяца минимальных продаж - " + d);
        System.out.println("Количество месяцев продаж ниже среднего - " + e);
        System.out.println("Количество месяцев продаж выше среднего - " + f);
    }

}
