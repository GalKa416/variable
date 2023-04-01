public class Main {
    public static void main(String[] args) {

        System.out.println("Условный оператор. Урок 1");
        //task 1;

//task 2;

//task 3;

//task 5.
        //task 6;
        System.out.println("Задача 6");
        int NumberOfPassengers = 63;
        if (NumberOfPassengers < 60) {
            System.out.println("В вагоне есть сидячее место");
        } else if (NumberOfPassengers >= 60 && NumberOfPassengers < 102) {
            System.out.println("В вагоне сидячих мест нет, но есть стоячее");
        } else if (NumberOfPassengers >= 102) {
            System.out.println("В вагоне мест нет");
        }

        //task 7;

        System.out.println("Условный оператор. Урок 2");
        //task 1;

        //task 2;

        // task 3;
        System.out.println("Задача 3");
        int year = 2020;
        if (year % 4 == 0) {
            System.out.println("Год является високосным");

        } else {
            System.out.println("Год не является високосным");

        }
    }
}
