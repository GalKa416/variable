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


        // tasr 4;
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int deliveryTime = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Доставка будет в течении " + deliveryTime + " суток");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Доставка будет в течении " + deliveryTime + 1 + " суток");
        }else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Доставка будет в течении " + deliveryTime + 2 + " суток");
        }else if (deliveryDistance > 100 ) {
            System.out.println("Доставки нет");
        }
    }
}



