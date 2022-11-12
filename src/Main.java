public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int a = 1000000;
        byte b = 4;
        short c = 12;
        long e = 329876;
        float d = 0.45f;
        double f = 87.98765;
        System.out.println("Значение переменной a с типом int равно "+ a);
        System.out.println("Значение переменной b с типом byte равно "+ b);
        System.out.println("Значение переменной c с типом short равно "+ c);
        System.out.println("Значение переменной e с типом long равно "+ e);
        System.out.println("Значение переменной d с типом float равно "+ d);
        System.out.println("Значение переменной f с типом double равно "+ f);
    }

    public static void task2 () {
        System.out.println("Задача 2");
      float a = 27.12f;
      long b = 987678965549L;
      double c = 2.786;
      int d = 569;
      short e = -159;
      int f = 27897;
      byte g = 67;
        System.out.println("Переменной a со значением " + a +" подходит тип float");
        System.out.println("Переменной b со значением " + b +" подходит тип long");
        System.out.println("Переменной c со значением " + c +" подходит тип double");
        System.out.println("Переменной d со значением " + d +" подходит тип int");
        System.out.println("Переменной e со значением " + e +" подходит тип short");
        System.out.println("Переменной f со значением " + f +" подходит тип int");
        System.out.println("Переменной g со значением " + g +" подходит тип byte");
    }
    public static void task3 () {
        System.out.println("Задача 3");
        short LudmilaPavlovna = 23;
        short AnnSergeevna = 27;
        short KateAndreevna = 30;
        int bookList = 480;
                int everyChild = bookList/(LudmilaPavlovna+AnnSergeevna+KateAndreevna);
                System.out.println("На каждого ученика рассчитано "+ everyChild + " листов бумаги");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int btlMin = 16;
        int btlTime = 2;
        int btlSpeed = btlMin/btlTime;
        int hour = 60;
        int day = 24;
        int month = 30;

        int btlMin20 = btlSpeed * 20;
        System.out.println("За 20 минут машина произвела " + btlMin20 + " штук бутылок");
        int btlDay = btlSpeed * hour * day;
        System.out.println("За сутки машина произвела " + btlDay + " штук бутылок");
        int btlDay3 = btlDay * 3;
        System.out.println("За 3 дня машина произвела " + btlDay3 + " штук бутылок");
        int btlMonth = btlDay * 30;
        System.out.println("За месяц машина произвела " + btlMonth + " штук бутылок");
    }
    public static void task5 () {
        System.out.println("Задача 5");
        byte schoolPaint = 120;
        byte whiteClass = 2;
        byte brownClass = 4;
        int paintClass = whiteClass + brownClass;
        int schoolClass = schoolPaint / paintClass;
        int brownSchCls = schoolClass * brownClass;
        int whiteSchCls = schoolClass * whiteClass;

        System.out.println("В школе, где "+ schoolClass + " классов, нужно "+ whiteSchCls +" банок белой краски и "+ brownSchCls +" банок коричневой краски");
    }
    public static void task6 () {
        System.out.println("Задача 6");
        short bananas = 5;
        short oneBanana = 80;
        short milk = 200;
        short milkMl = 100;
        short milkGramIn100Ml = 105;
        short iceCr = 2;
        short iceCrOne = 100;
        short egg = 4;
        short eggOne = 70;
        float grammInKilo = 1000;
        int blendGram = bananas*oneBanana + milk/milkMl*milkGramIn100Ml + iceCr*iceCrOne + egg*eggOne;
        float blendKilo = blendGram/grammInKilo;
        System.out.println("вес завтрака спортсмена равен " + blendGram + " грамм или " + blendKilo + " кг");

    }
    public static void task7 () {
        System.out.println("Задача 7");
        short needResKg = 7;
        short grInKg = 1000;
        int needResGr = needResKg * grInKg;
        short minGr = 250;
        short maxGr = 500;
        int days250Gr = needResGr / minGr;
        int days500Gr = needResGr / maxGr;
        float averageValueDays =  needResGr / ((minGr+maxGr)/2);
        System.out.println("Если спортсмен будет терять в день по " + minGr + " грамм, ему понадобится " + days250Gr + " дней. Если будет терять в день по " + maxGr + " грамм, то понадобится " + days500Gr + "дней. В среднем спортсмену необходимо до достижения результата " + averageValueDays +" дней." );


    }
    public static void task8 () {
        System.out.println("Задача 8");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        float salaryUp = 0.1f;
        float salaryUpMasha = salaryMasha * salaryUp + salaryMasha;
        float salaryUpDenis = salaryDenis * salaryUp + salaryDenis;
        float salaryUpKristina = salaryKristina * salaryUp + salaryKristina;
        float yearSlrMasha = salaryMasha * 12;
        float yearSlrUpMasha = salaryUpMasha * 12;
        float yearSlrDen = salaryDenis * 12;
        float yearSlrUpDen = salaryUpDenis * 12;
        float yearSlrKris = salaryKristina * 12;
        float yearSlrUpKris = salaryUpKristina * 12;
        float beetweenMasha = yearSlrUpMasha - yearSlrMasha;
        float beetweenDen = yearSlrUpDen - yearSlrDen;
        float beetweenKris = yearSlrUpKris - yearSlrKris;
        System.out.println("Маша теперь получает " + salaryUpMasha + " рублей. Годовой доход вырос на " + beetweenMasha + " рублей.");
        System.out.println("Денис теперь получает " + salaryUpDenis + " рублей. Годовой доход вырос на " + beetweenDen + " рублей.");
        System.out.println("Кристина теперь получает " + salaryUpKristina + " рублей. Годовой доход вырос на " + beetweenKris + " рублей.");

    }


}