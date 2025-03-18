public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        int deposit1 = 15000;
        int month = 0;
        int pocket = 0; // в кармане
        while (pocket < 2_459_000) {
            pocket += deposit1;
            month++;
            System.out.println("Месяц " + month + ", сумма накомлений равна " + pocket + " рублей.");
        }
        System.out.println("Задание 2");
        int number2 = 0;
        while (number2 < 10) {
            number2++;
            System.out.print(number2 + " ");
        }
        System.out.println(" ");
        int number2_1 = 10;
        while (number2_1 > 0) {
            System.out.print(number2_1 + " ");
            number2_1--;
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
        int replenishment = 15000; //пополнение
        int pocket_1 = 0; //на данный момент
        float percent = 0.07f;// процент
        int month_1 = 0;
        while (pocket_1 < 12_000_000) {
            month_1++;
            pocket_1 += replenishment + (pocket_1 + replenishment) * percent;
            System.out.println("За " + month_1 + " месяц сумма накоплений равна " + pocket_1 + " рублей.");
        }
        System.out.println("Задание 5");
        int deposit = 15000;   //вклад
        int onMyHands = 0;    //на руках
        float bet = 0.07f;    //ставка
        int monthDeposit = 0;
        while (onMyHands < 12_000_000) {
            monthDeposit++;
            onMyHands += deposit + (onMyHands + deposit) * bet;
            if (monthDeposit % 6 == 0) {
                System.out.println("За " + monthDeposit + " месяц сумма накоплений равна " + onMyHands + " рублей.");
            }
        }
        System.out.println("Задание 6");
        int deposit6 = 15000;   //вклад
        int onMyHands6 = 0;    //на руках
        float bet6 = 0.07f;    //ставка
        int monthDeposit6 = 0;
        while (monthDeposit6 < 108) {
            monthDeposit6++;
            onMyHands6 += deposit6 + (onMyHands6 + deposit6) * bet6;
            if (monthDeposit6 % 6 == 0) {
                System.out.println("За " + monthDeposit6 + " месяц сумма накоплений равна " + onMyHands6 + " рублей.");
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
        while (lastYear < nextYear) {
            System.out.println(lastYear);
            lastYear += 79;
        }
    }
}