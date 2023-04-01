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
        int deliveryDistance = 95;
        int deliveryTime = 1;
        if (deliveryDistance<=20) {System.out.println("Доставка будет в течении "+deliveryTime+ " суток");}
        else if (deliveryDistance>20 && deliveryDistance <= 60) {System.out.println("Доставка будет в течении "+deliveryTime*2+ " суток");}
        else if (deliveryDistance > 60 && deliveryDistance <=100) {System.out.println("Доставка будет в течении " + deliveryTime*3 + " суток");}
        else if (deliveryDistance>100) {System.out.println("Доставки не будет");}
        //task 5;
        System.out.println("Задача 5");
        int  monthNumber = 5;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Это зимний месяц");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Это весенний месяц");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Это летний месяц");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Это осенний месяц");
                break;
            default:
                System.out.println("Некорректный номер месяца");
        }


     }
}




