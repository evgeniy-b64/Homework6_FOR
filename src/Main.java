public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    public static void task1() {
        var separator = "=-=-=-=-=-=-=-=-=-=-=-=-=-=";
        System.out.println(separator);
        System.out.println("|| Задача 1: Числа 1..10 ||");
        System.out.println(separator);
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void task2() {
        var separator = "=-=-=-=-=-=-=-=-=-=-=-=-=-=";
        System.out.println(separator);
        System.out.println("|| Задача 2: Числа 10..1 ||");
        System.out.println(separator);
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
    }

    public static void task3() {
        var separator = "=-=-=-=-=-=-=-=-=-=-=-=-=-=";
        System.out.println(separator);
        System.out.println("|| Задача 3: Четные числа 0..17 ||");
        System.out.println(separator);
        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void task4() {
        var separator = "=-=-=-=-=-=-=-=-=-=-=-=-=-=";
        System.out.println(separator);
        System.out.println("|| Задача 4: Числа 10..-10 ||");
        System.out.println(separator);
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
    }

    public static void task5() {
        var separator = "=-=-=-=-=-=-=-=-=-=-=-=-=-=";
        System.out.println(separator);
        System.out.println("|| Задача 5: Високосные годы 1904 - 2096 ||");
        System.out.println(separator);
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println("Високосный год " +i);
        }
    }

    public static void task6() {
        var separator = "=-=-=-=-=-=-=-=-=-=-=-=-=-=";
        System.out.println(separator);
        System.out.println("|| Задача 6: Последовательность 7, 14, 21, ... 98 ||");
        System.out.println(separator);
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.print(i+ " ");
        }
    }

    public static void task7() {
        var separator = "=-=-=-=-=-=-=-=-=-=-=-=-=-=";
        System.out.println(separator);
        System.out.println("|| Задача 7: Последовательность 1, 2, 4, ... 512 ||");
        System.out.println(separator);
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.print(i+ " ");
        }
    }

    public static void task8() {
        var separator = "=-=-=-=-=-=-=-=-=-=-=-=-=-=";
        System.out.println(separator);
        System.out.println("|| Задача 8: Годовые накопления ||");
        System.out.println(separator);
        int addPerMonth = 29000;
        int sum = 0;
        for (int i = 1; i <= 12; i++) {
            sum = sum + addPerMonth;
            System.out.println("Месяц "+i+", сумма накоплений равна "+sum+" рублей");
        }
    }

    public static void task9() {
        var separator = "=-=-=-=-=-=-=-=-=-=-=-=-=-=";
        System.out.println(separator);
        System.out.println("|| Задача 9: Годовые накопления с процентами ||");
        System.out.println(separator);
        byte perCent = 12;          //годовой процент
        var perMonth = perCent / 12;//месячный процент
        int addPerMonth = 29000;    //ежемесячное пополнение
        int sum = 0;                //сумма накоплений
        for (int i = 1; i <= 12; i++) {
            sum = sum + sum * perMonth / 100;
            sum = sum + addPerMonth;
            System.out.println("Месяц "+i+", сумма накоплений равна "+sum+" рублей");
        }
    }

    public static void task10() {
        var separator = "=-=-=-=-=-=-=-=-=-=-=-=-=-=";
        System.out.println(separator);
        System.out.println("|| Задача 10: Таблица умножения ||");
        System.out.println(separator);
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * "+i+" = "+ 2*i );
        }
    }

}