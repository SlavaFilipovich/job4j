package ru.job4j.condition;

public class TrgArea {
    public static void main(String[] args) {
        double rs1 = TrgArea.area(2, 2, 2);
        double rs2 = TrgArea.area(4, 4, 7);
        System.out.println("area(2, 2, 2) = "+rs1);
        System.out.println("area(2, 2, 2) = "+rs2);

    }

    public  static double area(double a, double b, double c){
        double p = a + b + c;
        double temp = p*(p-a)*(p-b)*(p-c);
        double s = Math.sqrt(temp);
        return s;
    }

}
