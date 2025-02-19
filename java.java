import java.util.Scanner;
public class java {
    public static void main(String[] args) {
        String[] products = {"Хлеб", "Яблоки", "Молоко"};
        int[] prices = {100, 200, 300};
        int[] cart = new int[products.length]; // массив для хранения количества товаров в корзине

        Scanner scanner = new Scanner(System.in);

        System.out.println("Список возможных товаров для покупки:");
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i] + " " + prices[i] + " руб/шт");
        }

        int sumProducts = 0;

        while (true) {
            System.out.println("Выберите товар и количество или введите `end`");
            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }

            String[] parts = input.split(" ");
            int productNumber = Integer.parseInt(parts[0]) - 1;
            int productCount = Integer.parseInt(parts[1]);

            cart[productNumber] += productCount;
        }

        System.out.println("Ваша корзина:");
        for (int i = 0; i < products.length; i++) {
            if (cart[i] > 0) {
                int cost = cart[i] * prices[i];
                sumProducts += cost;
                System.out.println(products[i] + " " + cart[i] + " шт " + prices[i] + " руб/шт " + cost + " руб в сумме");
            }
        }
        System.out.println("Итого " + sumProducts + " руб");
    }
}
