package ru.job4j.calculator;

public class Fit {
    public static void main(String[] args) {
    double man = manWeight(178);
    double woman = womanWeight(164);
        System.out.println("Ideal weight for man is: "+man);
        System.out.println("Ideal weight for woman is: "+woman);
    }

    public static double manWeight(double height) {
        return (height-100.0)*1.15;
    }

    public static double womanWeight(double height) {
        return (height-110.0)*1.15;
    }

}
