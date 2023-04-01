public class Main {
    public static void main(String[] args) {


        System.out.println("Условный оператор. Урок 2");
        //task 1;
        System.out.println("Задача 1");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Некорректный ввод");

            //task 2;

            // task 3;


            // task 4;
            System.out.println("Задача 4");
            int deliveryDistance = 95;
            int deliveryTime = 1;
            if (deliveryDistance <= 20) {
                System.out.println("Доставка будет в течении " + deliveryTime + " суток");
            } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
                System.out.println("Доставка будет в течении " + deliveryTime + 1 + " суток");
            } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
                System.out.println("Доставка будет в течении " + deliveryTime + 2 + " суток");
            } else if (deliveryDistance > 100) {
                System.out.println("Доставки нет");
            }
            // task 5;
            System.out.println("Задача 5");
        }
    }
}



