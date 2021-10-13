package strategy_pattern;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        // 設定可樂
        DrinkMechine drinkMechine = new DrinkMechine(new Coke());
        // 倒出可樂
        drinkMechine.pourOut();
        System.out.println("========");

        // 設定紅茶
        drinkMechine.setDrinkProduct(new BlackTea());
        // 倒出紅茶
        drinkMechine.pourOut();
        System.out.println("========");

        // 設定雪碧
        drinkMechine.setDrinkProduct(new Sprite());
        // 倒出雪碧
        drinkMechine.pourOut();
    }
}
