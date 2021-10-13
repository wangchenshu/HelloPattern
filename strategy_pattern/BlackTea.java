package strategy_pattern;

public class BlackTea implements DrinkProduce {
    public BlackTea() {
        System.out.println("設定紅茶...");
    }

    @Override
    public void pourOut() {
        System.out.println("倒出紅茶...");
    }

}
