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
        task11();
        task12();
        task13();
        task14();
        task15();
        task16();
        task17();
        task18();
        task19();

    }

    public static void task1() {
        System.out.println("Задача 1");
        for(int i = 1; i <= 10; i++) {
            System.out.println("Итерация цикла " + i);
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        for(int i = 10; i > 0; i--) {
            System.out.println("Итерация цикла " + i);
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        for(int i = 2; (i < 17 && i % 2 == 0); i = i + 2) {
            System.out.println("Итерация цикла " + i);
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        for(int i = 10; i >= -10; i--) {
            System.out.println("Итерация цикла " + i);
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        for(int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        for(int i = 7; i <= 98; i = i + 7) {
            System.out.println("Выведено число " + i);
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        for(int i = 1; i <= 512; i = i * 2) {
            System.out.println("Выведено число " + i);
        }
    }
    public static void task8() {
        System.out.println("Задача 8");
        int accumulationPerMonth = 29000;
        int total = 0;
        for(int i = 1; i <= 12; i++) {
            total = total + accumulationPerMonth;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total);
        }
    }
    public static void task9() {
        System.out.println("Задача 9");
        double accumulationPerMonth = 29000;
        double total = 0;
        for(int i = 1; i <= 12; i++) {
            total = (total + accumulationPerMonth) * 1.01;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total);
        }
    }
    public static void task10() {
        System.out.println("Задача 10");
        int count = 2;
        int form = 0;
        for(int i = 1; i <= 10; i++) {
            form = count + form;
            System.out.println(count + " * " + i + " = " + form);
        }
        System.out.println("Циклы. Часть 2");
    }

    public static void task11() {
        System.out.println("Задача 1");
        int accumulationPerMonth = 15000;
        int deposit = 0;
        int i = 0;
        while (deposit < 2459000) {
            i = i + 1;
            deposit = deposit + accumulationPerMonth;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + deposit + " рублей");
        }
    }
    public static void task12() {
        System.out.println("Задача 2");
        int count1 = 0;
        while (count1 < 10) {
            count1 = count1 + 1;
            System.out.print(" " + count1 + " ");
        }
        System.out.println();
        for ( ;count1 > 0; count1--) {
            System.out.print(" " + count1 + " ");
        }
        System.out.println();
    }
    public static void task13() {
        System.out.println("Задача 3");
        int populationY = 12_000_000;
        int bornedY = 17;
        int diedY = 8;
        int people = 1000;
        int i = 0;
        while (people <= populationY) {
            i = i + 1;
            people = people + 1000;
        }
        for (int a = 1; a <= 10; a++) {
            populationY = (bornedY - diedY) * i + populationY;
            System.out.println("Год " + a + ", численность населения составляет " + populationY);
        }
    }
    public static void task14() {
        System.out.println("Задача 4");
        double deposit = 15000;
        int i = 0;
        while (deposit <= 12_000_000) {
            i = i + 1;
            deposit = deposit *1.07;
            System.out.println("Месяц " + i + ", сумма накоплений " + deposit);
        }
        System.out.println("Месяцев " + i);
    }
    public static void task15() {
        System.out.println("Задача 5");
        double deposit = 15000;
        int i = 0;
        while (deposit <= 12_000_000) {
            i = i + 1;
            deposit = deposit * 1.07;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений " + deposit);
            }
        }
    }
    public static void task16() {
        System.out.println("Задача 6");
        double deposit = 15000;
        double deposit1 = 15000;
        int a = 0;
        double perMonth = 1.07;
        while (a < 6) {
            a++;
            deposit = deposit * perMonth;
            System.out.println("Месяц " + a + ", сумма накоплений " + deposit);
        }
        double newPersent = ((deposit - 15000) / 15000) + 1;
        System.out.println("Процент за полгода (+1) " + newPersent);

        for (double i = 0.5; i <= 9; i = i + 0.5) {
            deposit1 = deposit1 * newPersent;
            System.out.println("Год " + i + ", сумма накоплений " + deposit1);
        }
    }
    public static void task17() {
        System.out.println("Задача 7");
        int friday = 5;
        for (int i = 1; i <= 31; i++) {
            if (i == friday) {
                friday = friday + 7;
                System.out.println("Сегодня пятница, " + i + "-е число");
            }
        }
        // 0 - 2123
    } public static void task18() {
        System.out.println("Задача 8");
        int dayComete = 79;
        int startYear = 1823;
        int endYear = 2123;
        for (int i = 1; i <= 2123; i++) {
            dayComete = dayComete + 79;
            if (dayComete >= startYear && dayComete <= endYear) {
                System.out.println(dayComete);
            }
        }
    } public static void task19() {
        System.out.println("Задача 9");
        int userWantsToСontinue = 1;
        int level = 1;
        do {
            System.out.println("Завершен уровень " + level);
            System.out.println("Хотите продолжить?");
            level++;
        }
        while (userWantsToСontinue == 1 && level < 5);
    }

}
