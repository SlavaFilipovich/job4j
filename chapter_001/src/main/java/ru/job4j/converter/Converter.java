package ru.job4j.converter;

public class Converter {
    public static void main(String[] args) {

        //Тест метода rubleToEuro
        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

        //Тест метода rubleToDollar
        int in1 = 240;
        int expected1 = 4;
        int out1 = rubleToDollar(in1);
        boolean passed1 = expected1 == out1;
        System.out.println("240 rubles are 4. Test result : " + passed1);

        //Тест метода euroToRuble
        int in2 = 5;
        int expected2 = 350;
        int out2 = euroToRuble(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("5 euro are 350. Test result : " + passed2);

        //Тест метода dollarToRuble
        int in3 = 12;
        int expected3 = 720;
        int out3 = dollarToRuble(in3);
        boolean passed3 = expected3 == out3;
        System.out.println("12 dollars are 720. Test result : " + passed3);

        //Текст ранее написанной программы
        int euro = rubleToEuro(140);
        int dollar = rubleToDollar(240);
        int ruble1 = euroToRuble(5);
        int ruble2 = dollarToRuble(12);
        System.out.println("210 rubles are: "+ euro + " euro");
        System.out.println("240 rubles are: "+ dollar + " dollars");
        System.out.println("5 euro are: "+ ruble1 + " rubles");
        System.out.println("12 dollars are: "+ ruble2 + " rubles");


    }

    public static int rubleToEuro(int value){
        return value/70;
    }

    public static int rubleToDollar(int value){
        return value/60;
    }

    public static int euroToRuble(int value){
        return value*70;
    }

    public static int dollarToRuble(int value){
        return value*60;
    }

}

