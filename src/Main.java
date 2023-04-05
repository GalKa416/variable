public class Main {
    public static void main(String[] args) {


        System.out.println("Циклы");
        //task 1;
        System.out.println("Задача 1");
        for (int i = 0; i <= 10; i = i + 1) {
            System.out.println(" Число " + i);
        }
//task 2;
        System.out.println("Задача 2");
        for (int i = 10; i <= 10 && i >= 1; i = i - 1) {
            System.out.println(" Число " + i);
        }
        //task 3;
        System.out.println("Задача 3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(" Число " + i);
        }
        //task 4;
        System.out.println("Задача 4");
        for (int i = 10; i <= 10 && i >= -10; i = i - 1) {
            System.out.println(" Число " + i);
        }
//task 5;
        System.out.println("Задача 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(+i + " год является високосным. ");
        }
        //task 6;
        System.out.println("Задача 6");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(" Число " + i);
        }
        //task 7;
        System.out.println("Задача 7");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(" Число " + i);
        }
        //task 8;
        System.out.println("Задача 8");
        int month;
        int amountOfSavings;
        for (month  = 1, amountOfSavings  = 29000; month <= 12; month = month + 1, amountOfSavings = amountOfSavings + 29000)


        {
            System.out.println("Месяц " + month+ " сумма накоплений равна " + amountOfSavings + " рублей.");
        }
    }
}




