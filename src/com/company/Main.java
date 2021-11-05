package com.company;

public class Main {

    public static void main(String[] args) {
	//write your code here
        var basketFruit =7 ;
        System.out.println( basketFruit);

        basketFruit = basketFruit + 3;
        System.out.println( basketFruit);

        basketFruit = basketFruit - 6;
        System.out.println(basketFruit);

        basketFruit = basketFruit * 2;
        System.out.println(basketFruit);

        basketFruit = basketFruit / 4;
        System.out.println(basketFruit);

        byte berry = 95;
        System.out.println ("Ягод " + berry + "кг");

        short seafood = 1000;
        System.out.println ("Морепродуктов " + seafood + "кг");

        int drinks = 20;
        System.out.println("Напитков " + drinks + "л.");

        long products = 1000L;
        System.out.println("продуктов "+ products +"кг");

        float f = 5.5F;
        System.out.println(f);

        double b = 3.5;
        b = b / 2;
        System.out.println(b);

        char c = 35;
        char a = '?';
        System.out.println(c=a);

         boolean t = true;
         System.out.println(t);

         boolean F = false;
         System.out.println(f);


         var oneBoxerWeight = 78.2;
         System.out.println(oneBoxerWeight + "кг");
         var twoBoxerWeight = 82.7;
         System.out.println(twoBoxerWeight + "кл");
         var totalWeight = oneBoxerWeight+twoBoxerWeight;
         System.out.println("общий вес боксеров "+ totalWeight+ "кг");
         var differenceWeight = twoBoxerWeight - oneBoxerWeight;
         System.out.println( "Разница на "+differenceWeight + "кг");

         var banana = 80;
         System.out.println( "Банан +"+ banana +"г");

         var bananas=banana*5;
         System.out.println("Всего бананов "+bananas +"Г");

         var milk = 100;
         System.out.println("Молоко "+milk+"г");

         var allMilk=milk * 2;
         System.out.println("Всего молока "+allMilk+"г");

         var waitIceCream = 100;
         System.out.println("Мороженое " + waitIceCream+ "г");

         var allIceCream = 100*2;
         System.out.println("Все мороженное " + allIceCream+ "г" );

         var egg = 70;
         System.out.println( "Яйцо "+egg+"г");

         var allEggs = egg * 4;
         System.out.println("Общее количество яиц "+allEggs + "г");

         var sportsmanBreakfast = bananas + allMilk + allIceCream + allEggs;
         System.out.println( "Общий завтрак спортсмена "+sportsmanBreakfast + "г" );

         var recipe = 1080;
         System.out.println( "Рецепт " +recipe + "г");

         var recipeInKg = recipe / 1000;
         System.out.println( "рецепт в кг " + recipeInKg + "кг");

         double d = 1080;
          c = 1000;
          System.out.println( "вес ингридиентов " + d/c +"Кг");



          var kg = 7;
          System.out.println ("Нужно сбросить " +  kg + "кг");

          var g = kg * 1000;
          System.out.println("нужно сбросить в граммах " + g + "г");

          short weight = 7000;
          short grInaDay= 250;
          short loseWeightFaster=500;

          int HowMuchDays = (short) weight / grInaDay;
          System.out.println("Сколько дней худеть " + HowMuchDays);

          int howMuch = (short) weight/loseWeightFaster;
          System.out.println("Сколько осталось, если худеть быстрее " + howMuch);

          var salaryMasha = 67.760;
        System.out.println("Маша получает "+salaryMasha+"руб");
          var salaryDenis = 83.960;
        System.out.println("Денис получает " + salaryDenis+ "руб");
          var salaryKristina = 76.230;
        System.out.println("Кристина получает "+salaryKristina+ "руб");

        double annualIncomeIncreasedMasha = salaryMasha * 0.1;
        System.out.println("Годовой доход вырос у Маши "+annualIncomeIncreasedMasha+ "руб");
        double annualIncreasedDenis = salaryDenis * 0.1;
        System.out.println("Годовой доход вырос у Дениса "+annualIncreasedDenis+"руб" );
        double annualIncomeIncreasedKristina = salaryKristina * 0.1;
        System.out.println("Годовой доход вырос у Кристины " + annualIncomeIncreasedKristina + "руб" );

        var increasedMasha = salaryMasha +annualIncomeIncreasedMasha;
        System.out.println("зарпалата выросла у Маши "+ increasedMasha+"руб");

        var increasedDenis = salaryDenis + annualIncreasedDenis;
        System.out.println("Зарпалата выросла у Дениса " + increasedDenis + "руб" );

        var increasedKristina = salaryKristina + annualIncomeIncreasedKristina;
        System.out.println("Зарплата выросла у Кристины "+ increasedKristina+ "руб");



    }
}
