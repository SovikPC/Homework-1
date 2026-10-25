import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Gurov Vitaly");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите свой доход за этот месяц:");
        double income = in.nextDouble();
        System.out.println("Введите свой расхроды за этот месяц:");
        double spending  = in.nextDouble();
        System.out.println("Итого: " + (income - spending));
    }
}
