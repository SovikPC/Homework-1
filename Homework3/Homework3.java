package Homework3;

import java.util.Scanner;

public class Homework3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = 0;
        while(true){
            System.out.print("Введите год в формате \"yyyy\": ");
            String inputYear = scan.nextLine();
            System.out.print("Введите количество дней в году: ");
            String inputDayCount = scan.nextLine();
            int year = Integer.parseInt(inputYear);
            int dayCount = Integer.parseInt(inputDayCount);
            int dayInYear = countYear(year);
            if(dayCount == dayInYear){
                x++;
            } else {
                System.out.println("Неправельно, в этом году " + dayInYear + " дней" );
                break;
            }
        }
        System.out.println("Набранно очков: " + x);
    }

    public static int countYear(int year){
        return (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) ? 366 : 365;
    }
}
