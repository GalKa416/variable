public class Main {
    public static void main(String[] args) {


        System.out.println("Циклы 2");
        //task 1;
        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            total = total + salary;
            i = i + 1;
            System.out.println("Месяц  " + i + ", сумма накоплений равна: " + total);
        }
//task 2;
        System.out.println("Задача 2");
        int a = 0;
        while (a < 10) {
            a = a + 1;
            System.out.print(" " + a + " ");
        }
        System.out.println();
        for (int c = 10; c > 0; c = c - 1) {
            System.out.print(" " + c + " ");
        }
//task 3;
        System.out.println("Задача 3");
        int population = 12_000_000;
        int fertility = 17;
        int mortality = 8;
        int year = 0;
        while (year < 12) {
            year = year + 1;
            population = population + (fertility - mortality) * population / 1000;
            System.out.println("Год " + year + " численность населения составляет " + population);
        }
//task 4;5
        System.out.println("Задача 4.5");
        int deposit = 15000;
        int accumulation = 0;
        int n = 0;
        for (; accumulation < 12_000_000; n++) {
            accumulation = accumulation + accumulation / 100 * 7;
            accumulation = accumulation + deposit;

            if (n % 6 == 0) {
                System.out.println("Месяц " + n + " сумма " + accumulation);
            }

        }
        //task 6
        System.out.println("Задача 6");
        int depositVasiliy = 15000;
        int accumulationVasiliy = 0;
        int k = 0;
        while ( k < 9*12) {
            accumulationVasiliy = accumulationVasiliy + accumulationVasiliy / 100 * 7;
            accumulationVasiliy = accumulationVasiliy + depositVasiliy;
            k=k+1;

            if (k % 6 == 0) {
                System.out.println("Месяц " + k + " сумма " + accumulationVasiliy);
            }

        }
    }
}
