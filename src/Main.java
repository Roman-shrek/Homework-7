public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int salary = 15_000;
        int deposit = 0;
        int month = 1;
        while (deposit <= 2_459_000) {
            deposit = deposit + deposit / 100;
            deposit = deposit + salary;
            System.out.println("Месяц " + month + " сумма накопления равна " + deposit + " рублей");
            month++;
        }
        System.out.println();
        // Задание 2
        System.out.println("Задание 2");
        int i = 10;
        while (i >= 1) {
            System.out.print(i + " ");
            i--;
        }
        System.out.println();
        for (i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        // Задание 3
        System.out.println("Задание 3");
        int population = 12_000_000;
        int diffPeople = population / 1000;
        int year = 2024;
        for (int d = 1; d <= 10; d++) {
            year++;
            population = population + (diffPeople * (17 - 8));
            System.out.println("Год " +
                    year + ", численность населения составляет " + population);
        }
        System.out.println();
        // Задание 4
        System.out.println("Задание 4");
        int cash = 15_000;
        deposit = 0;
        month = 1;
        while (deposit <= 12_000_000) {
            deposit = deposit + (deposit * 7 / 100);
            deposit = deposit + cash;
            System.out.println("Месяц " + month + " сумма накопления равна " +
                    deposit + " рублей");
            month++;
        }
        System.out.println();
        // Задание 5
        System.out.println("Задание 5");
        cash = 15_000;
        deposit = 0;
        month = 1;
        while (deposit <= 12_000_000) {
            deposit = deposit + (deposit * 7 / 100);
            deposit = deposit + cash;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма накопления равна " +
                        deposit + " рублей");
            }
            month++;
        }
        System.out.println();
        // Задание 6
        System.out.println("Задание 6");
        cash = 15_000;
        deposit = 0;
        month = 1;
        while (month <= 108) {
            deposit = deposit + (deposit * 7 / 100);
            deposit = deposit + cash;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма накопления равна " +
                        deposit + " рублей");
            }
            month++;
        }
        System.out.println();
        // Задание 7
        System.out.println("Задание 7");
        int friday = 5;
        while (friday <= 31) {
            System.out.println("Сегодня пятница, " +
                    friday + "-е число. Необходимо сделать отчет");
            friday += 7;
        }
        System.out.println();
        //Задание 8
        System.out.println("Задание 8");
        year = 2024;
        int yearBefore = year - 200;
        int yearAfter = year + 100;
        for (year = yearBefore; year<=yearAfter; year++){
            if (year%79==0){
                System.out.println(year);
            }
        }
    }
}