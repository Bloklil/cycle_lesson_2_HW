public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        int maxSum = 2_459_000;
        int deposit = 15000;
        int month = 0;
        int pocket = 0; // в кармане
        while (pocket < maxSum) {
            pocket += deposit;
            month++;
            System.out.println("Месяц " + month + ", сумма накомлений равна " + pocket + " рублей.");
        }
        System.out.println("Задание 2");
        int number = 0;
        while (number < 10) {
            number++;
            System.out.print(number + " ");
        }
        System.out.println(" ");
        int numberTwo = 10;
        while (numberTwo > 0) {
            System.out.print(numberTwo + " ");
            numberTwo--;
        }
        System.out.println(" ");
        System.out.println("Задание 3");
        int population = 12_000_000;
        float mortalityRate = 8 / 1000f; //смертность
        float birte = 17 / 1000f; //рождаемость
        int years = 0;
        for (int i = 0; i < 10; i++) {
            years++;
            population = (int) (population - (population * mortalityRate) + (population * birte));
            System.out.println("Год " + years + " , численность населения составляет " + population);
        }
        System.out.println("Задание 4");
        deposit = 15000; //пополнение
        pocket = 0; //на данный момент
        float percent = 0.07f;// процент
        month = 0;
        while (pocket < 12_000_000) {
            month++;
            pocket += deposit + (pocket + deposit) * percent;
            System.out.println("За " + month + " месяц сумма накоплений равна " + pocket + " рублей.");
        }
        System.out.println("Задание 5");
        deposit = 15000;
        pocket = 0;
        percent = 0.07f;
        month = 0;
        while (pocket < 12_000_000) {
            month++;
            pocket += deposit + (pocket + deposit) * percent;
            if (month % 6 == 0) {
                System.out.println("За " + month + " месяц сумма накоплений равна " + pocket + " рублей.");
            }
        }
        System.out.println("Задание 6");
        deposit = 15000;
        pocket = 0;
        percent = 0.07f;
        month = 0;
        while (month < 108) {
            month++;
            pocket += deposit + (pocket + deposit) * percent;
            if (month % 6 == 0) {
                System.out.println("За " + month + " месяц сумма накоплений равна " + pocket + " рублей.");
            }
        }
        System.out.println("Задание 7");
        int friday = 5;
        while (friday <= 31) {
            System.out.println("Сегодня пятница, " + friday + " число. Необходимо подготовить отчет");
            friday += 7;
        }
        System.out.println("Задание 8");
        int thisYear = 2025;
        int lastYear = thisYear - 200;
        int nextYear = thisYear + 100;
        for (int i = 0; i < nextYear; i = i + 79)
            if (i > lastYear && i < nextYear) {
                System.out.println(i);
            }

    }
}