package Homework1;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        System.out.println("Gurov Vitaly");
        Scanner in = new Scanner(System.in);
        double income = 0.0;
        double spending = 0.0;
        System.out.println("Введите свой доход за этот месяц:");        
        if(in.hasNextDouble()){
            income = in.nextDouble();
        }else {
            System.out.println("Вы ввели не числовое значение!");
        }
        System.out.println("Введите свой расхроды за этот месяц:");        
        if(in.hasNextDouble()){
            spending = in.nextDouble();            
        }else {
            System.out.println("Вы ввели не числовое значение!");
        }
        System.out.println("Итого: " + (income - spending));
    }
}
