public class Main {
    public static void main(String[] args) {
        //Задача1
        System.out.println("Задача 1");
        int cat = 1;
        byte bee = 2;
        short dog = 3;
        long mouse = 12_12_12_12_4L;
        float car = 5.6f;
        double home = 7.812121212;

        System.out.println("Значение переменной cаt с типом int равно " + cat);
        System.out.println("Значение переменной bee с типом byte равно " + bee);
        System.out.println("Значение переменной dog с типом short равно " + dog);
        System.out.println("Значение переменной mouse с типом long равно " + mouse);
        System.out.println("Значение переменной car с типом float равно " + car);
        System.out.println("Значение переменной home с типом double равно " + home);

        //Задача2
        System.out.println("Задача 2");
        float zna4en1 = 27.12f;
        long zna4en2 = 987_678_965_549L;
        double zana4en3 = 2.786;
        boolean zna4en4 = false;
        char zna4en5 = 569;
        short zna4en6 = -159;
        int zna4en7 = 27897;
        byte zna4en8 = 67;
        System.out.println(zna4en1 + " " + zna4en2 + " " + zana4en3 + " " + zna4en4 + " " + zna4en5 + " " + zna4en6 + " " + zna4en7 + " " + zna4en8);

        //Задача3
        System.out.println("Задача 3");
        byte teacher1 = 23;
        byte teacher2 = 27;
        byte teacher3 = 30;
        short sumPaper = 480;
        int sumStudents = teacher2 + teacher1 + teacher3;
        int oneStudentTake = sumPaper / sumStudents;
        System.out.println("На каждого ученика рассчитано " + oneStudentTake + " листов бумаги");

        //Задача4
        System.out.println("Задача 4");
        byte bottlers2Min = 16;
        byte twoMinute = 2;
        int bottlers1Min = bottlers2Min / twoMinute;
        System.out.println("Кол-во бутылок за 1 минуту = " + bottlers1Min);
        byte minutes20 = 20;
        int bottlers20Min = bottlers1Min * minutes20;
        System.out.println("За " + minutes20 + " минут машина произвела бутылок - " + bottlers20Min + " штук");
        short oneDay = 24 * 60;
        int bottlersOneDey = oneDay * bottlers1Min;
        System.out.println("За 1 день машина произвела бутылок - " + bottlersOneDey + " штук");
        short treeDays = 3 * 24 * 60;
        int bottlersTreeDays = treeDays * bottlers1Min;
        System.out.println("За 3 дня машина произвела бутылок - " + bottlersTreeDays + " штук");
        int oneMonth = 30 * 24 * 60;
        int bottlersOneMonth = oneMonth * bottlers1Min;
        System.out.println("За 1 месяц машина произвела бутылок -  " + bottlersOneMonth + " штук");

        //Задача5
        System.out.println("Задача 5");
        byte sumTins = 120;
        byte tinWhite = 2;
        byte tinBrown = 4;
        int numbTinsOneClass = tinWhite + tinBrown;
        int numbClass = sumTins / numbTinsOneClass;
        int sumBrownTins = numbClass * tinBrown;
        int sumWhiteTins = numbClass * tinWhite;

        System.out.println("В школе где " + numbClass + " классов, нужно " + sumWhiteTins + " банок белой краски и " + sumBrownTins + " банок коричневой краски");

        //Задача6
        System.out.println("Задача 6");
        byte numbBananas = 5;
        short numbMilk = 200;
        byte numbIceCream = 2;
        byte numbEggs = 4;
        byte weightOneBananas = 80;
        byte weigh100MlMilk = 105;
        byte weight1IceCream = 100;
        byte weightOneEgg = 70;
        short kilogramDivisionGram = 1000;
        byte milkGr = 100;
        int weightSumMilk = numbMilk * weigh100MlMilk / milkGr;
        int weightSumBananas = numbBananas * weightOneBananas;
        int weightSumIceCream = numbIceCream * weight1IceCream;
        int weightSumEggs = numbEggs * weightOneEgg;
        float weightSportCocktailGram = weightSumEggs + weightSumBananas + weightSumMilk +weightSumIceCream;
        float weightSportCocktailKg = weightSportCocktailGram / kilogramDivisionGram;
        System.out.println("Завтрак чемпиона: ");
        System.out.println("Бананы -" + numbBananas + " шт");
        System.out.println("Молоко - " + numbMilk + " мл");
        System.out.println("Мороженое пломбир - " + numbIceCream + " брикетов");
        System.out.println("Яйца сырые -" + numbEggs + " шт");
        System.out.println("Вес спортивного завтрака в гр = " + weightSportCocktailGram);
        System.out.println("Вес спортивного завтрака в килограммах = " + weightSportCocktailKg);

        //Задача7
        System.out.println("Задача 7");
        int weightExcess = 7000;
        short weightLossMin = 250;
        short weightLossMax = 500;
        int numbDayMax = weightExcess / weightLossMin;
        int numbDayMin = weightExcess / weightLossMax;
        System.out.println("Максимальное кол-во дней для похудения " + numbDayMax);
        System.out.println("Минимальное кол-во дней для похудения " + numbDayMin);
        byte numbVariates = 2;
        int averageWeight = (numbDayMax + numbDayMin) / numbVariates;
        System.out.println("В среднем может понадобиться " + averageWeight + " дней");

        //Задача8
        System.out.println("Задача 8");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        byte oneYear = 12;
        byte percent = 100;
        byte percent110 = 110;
        int salary110PercentMasha = salaryMasha / percent * percent110; //зарплата увеличилась на 10%
        int differenceSalaryMasha = salary110PercentMasha * oneYear - salaryMasha * oneYear;//разница годового дохода Маши
        int salary110PercentDenis = salaryDenis / percent * percent110;
        int differenceSalaryDenis = salary110PercentDenis * oneYear - salaryDenis * oneYear;
        int salary110PercentKristina = salaryKristina / percent * percent110;
        int differenceSalaryKristina = salary110PercentKristina * oneYear - salaryKristina * oneYear;


        System.out.println("Маша теперь получает " + salary110PercentMasha + " рублей. Годовой доход вырос на " + differenceSalaryMasha + " рублей");
        System.out.println("Денис теперь получает " + salary110PercentDenis + " рублей. Годовой доход вырос на " + differenceSalaryDenis + " рублей");
        System.out.println("Денис теперь получает " + salary110PercentKristina + " рублей. Годовой доход вырос на " + differenceSalaryKristina + " рублей");
        }
    }
