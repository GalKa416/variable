import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.5;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        var MOneBoxer = 78.2;
        var MTwoBoxer = 82.7;
        var MBoxers = MOneBoxer + MTwoBoxer;
        System.out.println("Общий вес боксеров " + MBoxers + " кг");
        var difference = MTwoBoxer - MOneBoxer;
        System.out.println("Второй боксер весит на " + difference + " кг больше первого");
        var remainder = (MOneBoxer + MTwoBoxer) % MOneBoxer;
        System.out.println("разница в весе двух боксеров составляет " + remainder + " кг");
        var tWork = 640;
        var time = 8;
        var people = tWork / time;
        System.out.println("Всего работников в компании " + people + " человек");
        people = people + 94;
        tWork = time * people;
        System.out.println("Если в компании работает " + people + " человек, то всего " + tWork + " часов работы поделено между сотрудниками");
        byte pen = 1;
        System.out.println(" Домашка по теме Переменные 2 часть");
        System.out.println("задача 1");
        System.out.println("Значение переменной с типом byte равно " + pen);
        short apple = 10;
        System.out.println("Значение переменной с типом sort равно " + apple + "");
        int flat = 100;
        System.out.println("Значение переменной с типом int равно " + flat + "");
        long km = 1000L;
        System.out.println("Значение переменной с типом long равно " + km + "");
        float m = 33.5F;
        System.out.println("Значение переменной с типом float равно " + m + "");
        double kg = 27.524;
        System.out.println("Значение переменной с типом double равно " + kg + "");

        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;
        System.out.println(" задача 3");
        byte LP = 23;
        byte AS = 27;
        byte EA = 30;
        short p = 480;
        int list = p / (LP + AS + EA);
        System.out.println("На каждого ученика рассчитано " + list + " листов бумаги");
        System.out.println(" задача 4");
        double BMin = 16 / 2;
        double BMinOneTime = BMin * 20;
        System.out.println("За 20 минут машина произвела " + BMinOneTime + " бутылок");
        double BMinTowTime = BMinOneTime * 3 * 24;
        System.out.println("В сутки машина произвела " + BMinTowTime + " бутылок");
        double BMinTreeTime = BMinTowTime * 3;
        System.out.println("За трое суток машина произвела" + BMinTreeTime + " бутылок");
        double BMinFourTime = BMinTowTime * 30;
        System.out.println("За месяц машина произвела " + BMinFourTime + " бутылок");
        System.out.println(" задача 5");
        byte WallPaint = 120;
        byte WhitePaint = 2;
        byte BrownPoint = 4;
        int Class = 120 / (WhitePaint + BrownPoint);
        int BrownPointALL = Class * 4;
        int WallPaintall = Class * 2;
        System.out.println("В школе, где " + Class + " классов, нужно " + WallPaintall + " банок белой краски и " + BrownPointALL + " банок коричневой");

        System.out.println(" задача 6");
        int Banana = 5;
        int Milk = 2;
        int Crefm = 2;
        int egg = 4;
        int MBanana = 80;
        int MMilk = 105;
        int MCream = 100;
        int MEgg = 70;
        int MCoctailG = MBanana * Banana + MMilk * Milk + MCream * Crefm + MEgg * egg;
        float MCoctalKg = MCoctailG / 1000f;
        System.out.println("Полный вес спортивного завтрака спортсмена составляет " + MCoctailG + " г или " + MCoctalKg + " кг");
        System.out.println(" задача 7");
        float MAll = 7.000f;
        float OneDayMin = 0.250f;
        float OneDayMax = 0.500f;
        float DayMax = MAll / OneDayMin;
        float DayMin = MAll / OneDayMax;
        float AveragG = (OneDayMax + OneDayMin) / 2f;
        float DayAverage = 7 / AveragG;
        System.out.println("Минимальное количество дней дла похудения" + DayMin);
        System.out.println("Ммаксимальное количество дней дла похудения" + DayMax);
        System.out.printf("Среднее количество дней дла похудения %.2f%n", DayAverage);
        System.out.println(" задача 8");
        double Bonus = 0.1;
        byte annual = 12;
        double Masha = 67760.000;
        double MashaBonus = Masha + Bonus * Masha;
        double DiffM = (MashaBonus - Masha) * annual;
        System.out.println("Теперь Маша получает " + MashaBonus + " рублей. Годовой доход Маши вырос на " + DiffM + " рублей");
        double Den = 83690;
        double DenBonus = Den + Den * Bonus;
        double DiffD = (DenBonus - Den) * annual;
        System.out.println("Теперь Денис получает " + DenBonus + " рублей. годовой доход вырос на " + DiffD + " рублей");
        double Kriss = 76230;
        double KrissBonus = Kriss + Kriss * Bonus;
        double DiffK = (KrissBonus - Kriss) * annual;
        System.out.println("Теперь Кристина получает " + KrissBonus + " рублей. Годовой доход вырос на " + DiffK + " рублей");

        System.out.println("Условный оператор. Урок 1");
        //task 1;
        System.out.println("Задача 1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age);
        } else {
            System.out.println("Если возарст человека равен " + age + ", то он несовершеннолетний, придется подождать");
        }
//task 2;
        System.out.println("Задача 2");
        int temp = 6;
        if (temp <= 5) {
            System.out.println("На улице холодно, " + temp + " градуса, нужно надеть шапку");
        } else {
            System.out.println("Сегодня на улице тепло, " + temp + " гадусов, можно идти без шапки");
        }
//task 3;
        System.out.println("Задача 3");
        int movementSpeed = 60;
        if (movementSpeed <= 60) {
            System.out.println("Если скорость " + movementSpeed + " км/час, можете ехать спокойно");
        } else {
            System.out.println("Если скорость " + movementSpeed + " км/час, придется заплатить штраф");
        }
    }
}