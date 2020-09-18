import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Рады видеть Вас в нашем магазине");
        System.out.println();
        System.out.println("Для покупки фруктов нажмите -1");
        System.out.println("Для возврата фруктов нажмите -2");
        System.out.println("Если Вы поставщик нажмите -3");
        System.out.println("Для проверки наличия товаров нажмите -4");
        int number = sc.nextInt();
        int typeFruitOrder;
        String nameFruit = "";
        int countFruits;
        Fruits type = null;
        if (number == 1) {
            System.out.println("Наши предлжения");
            System.out.println("Яблоко нажмите -1");
            System.out.println("Банан нажмите -2");
            System.out.println("Персики нажмите -3");
            typeFruitOrder = sc.nextInt();
            if (typeFruitOrder == 1) {
                nameFruit = "Сколько яблок вы бы хотели преобрести ";
                type = new Apple();
            }
            if (typeFruitOrder == 2) {
                nameFruit = "Сколько банановов вы бы хотели преобрести ";
                type = new Banana();
            }
            if (typeFruitOrder == 3) {
                nameFruit = "Сколько персиков вы бы хотели преобрести ";
                type = new Peach();
            }
            System.out.println(nameFruit);
            System.out.println("Введите количество");
            countFruits = sc.nextInt();
            Shop shop = new Shop();
            shop.Purchase(countFruits, type.getNAme());
        }
        if (number == 2) {
            System.out.println("Какой товар вы бы хотели вернуть");
            System.out.println("Яблоко нажмите -1");
            System.out.println("Банан нажмите -2");
            System.out.println("Персики нажмите -3");
            typeFruitOrder = sc.nextInt();
            if (typeFruitOrder == 1) {
                nameFruit = "Сколько яблок вы хотите вернуть";
                type = new Apple();
            }
            if (typeFruitOrder == 2) {
                nameFruit = "Сколько банановов вы хотите вернуть";
                type = new Banana();
            }
            if (typeFruitOrder == 3) {
                nameFruit = "Сколько персиков вы хотите вернуть";
                type = new Peach();
            }
            System.out.println(nameFruit);
            System.out.println("Введите количество");
            countFruits = sc.nextInt();
            Shop shop = new Shop();
            shop.Return(countFruits, type.getNAme());
        }
        if (number == 3) {
            System.out.println("Какой товар вы поставляете");
            System.out.println("Яблоко нажмите -1");
            System.out.println("Банан нажмите -2");
            System.out.println("Персики нажмите -3");
            typeFruitOrder = sc.nextInt();
            if (typeFruitOrder == 1) {
                nameFruit = "Сколько яблок вы поставляете";
                type = new Apple();
            }
            if (typeFruitOrder == 2) {
                nameFruit = "Сколько банановов вы поставляете";
                type = new Banana();
            }
            if (typeFruitOrder == 3) {
                nameFruit = "Сколько персиков вы поставляете";
                type = new Peach();
            }
            System.out.println(nameFruit);
            System.out.println("Введите количество");
            countFruits = sc.nextInt();
            Shop shop = new Shop();
            shop.Supply(countFruits, type.getNAme());
        }
        if (number == 4) {
            Shop shop = new Shop();
            shop.Balance();
        }
    }
}


