public class Main {
    public static void main(String[] args) {


        System.out.println("Условный оператор. Урок 2");


        //task 2;

        System.out.println("Задача 2");
        int clientOS = 0;
        int clientDeviceYear = 2012;
        if (clientOS == 0) {
            if (clientDeviceYear < 2015)
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0) System.out.println("Установите версию приложения для iOS по ссылке");
        if (clientOS == 1) {
            if (clientDeviceYear < 2015)
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1) System.out.println("Установите версию приложения для Android по ссылке");


        // task 3;
        System.out.println("Задача 3");
        int year = 2000;
        if (year % 4 == 0 && year % 100!=0 || year % 400==0) {System.out.println("Год является високосным");}
        else System.out.println("Год не является високосным");

        //task 4;
        System.out.println("Задача 4");
     }
}




