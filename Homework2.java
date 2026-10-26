import java.util.Scanner;
import ru.netology.service.CustomService;

public class Homework2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите цену товара (в руб.): ");
        int price = in.nextInt();
        System.out.print("Введите вес товара (в кг.): ");
        int weight = in.nextInt();
        int duty = CustomService.calculateCustom(price, weight);
        System.out.println("Размер пошлины (в руб.) составит: " + duty);
    }
}
