import java.util.HashMap;
import java.util.Map;

public class Shop {

    Map<String, Integer> RemainsShop = Stock.RemainsShops(new HashMap<String, Integer>());

    public void Purchase(Integer count, String type) {
        if (RemainsShop.containsKey(type)) {
            Integer countTypeFruit = RemainsShop.get(type);
            if (countTypeFruit >= count) {
                Integer summTypeFruit = countTypeFruit - count;
                RemainsShop.put(type, summTypeFruit);
                System.out.println("Спасибо за покупку");
            } else {
                System.out.println("Данное количество" + type + "s" + "Отсудствует на остатках магазина");

            }
        } else {
            System.out.println(type + "s" + " отсудствует на остатках магазина");
        }
        System.out.println(RemainsShop.get(new Apple().getNAme()));
        Stock.WriteFile(RemainsShop);
    }

    public void Return(Integer count, String type) {
        Supply(count, type);
        System.out.println(RemainsShop.get(type));
    }

    public void Supply(Integer count, String type) {
        if (RemainsShop.containsKey(type)) {
            System.out.println(true);
            Integer countTypeFruit = RemainsShop.get(type);
            Integer summTypeFruit = countTypeFruit + count;
            RemainsShop.put(type, summTypeFruit);
        } else {
            RemainsShop.put(type, count);
        }
        Stock.WriteFile(RemainsShop);
    }

    public void Balance() {
        System.out.println("fruit,quantity");
        for (Map.Entry entry : RemainsShop.entrySet()) {
            System.out.println(entry.getKey() + "," + entry.getValue());
        }
        Stock.WriteFile(RemainsShop);
    }
}

