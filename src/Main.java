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
        while (k < 9 * 12) {
            accumulationVasiliy = accumulationVasiliy + accumulationVasiliy / 100 * 7;
            accumulationVasiliy = accumulationVasiliy + depositVasiliy;
            k = k + 1;

            if (k % 6 == 0) {
                System.out.println("Месяц " + k + " сумма " + accumulationVasiliy);
            }

        }
        //task 7
        System.out.println("Задача 7");
        int friday = 4;
        while (friday <= 31) {
            friday = friday+7;
            System.out.println("Сегодня пятница " + friday+ "-е число. Необходимо подготовить отчет");
        }
        //task 8
        System.out.println("Задача 8");
        int thisYear = 2023;
        int l = 200;
        int j = 100;
        int cometYear = 0;
        while (cometYear<thisYear+j) {cometYear = cometYear+79;
            if (cometYear>thisYear-l)
            System.out.println(cometYear);}

        System.out.println("Массивы 1");
        //task 1;
        System.out.println("Задача 1");
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

               double [] array1 = {1.57, 7.654, 9.986};
        int [] arbitrary = {6, 2, 8, 3};
        //task 2;
        System.out.println("Задача 2");
        System.out.println(array[0]+ ", " + array[1]+", " +array[2]);
        System.out.println(array1[0]+ ", " + array1[1]+", " +array1[2]);
        System.out.println(arbitrary[0]+ ", " + arbitrary[1]+", " +arbitrary[2]+", " +arbitrary[3]);
        //task 3;
        System.out.println("Задача 3");
        System.out.println(array[2]+ ", " + array[1]+", " +array[0]);
        System.out.println(array1[2]+ ", " + array1[1]+", " +array1[0]);
        System.out.println(arbitrary[3]+ ", " + arbitrary[2]+", " +arbitrary[1]+", " +arbitrary[0]);

}   }
