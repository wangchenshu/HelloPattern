package strategy_pattern;

public class Coke implements DrinkProduce {

    public Coke() {
        System.out.println("設定可樂...");
    }

    @Override
    public void pourOut() {
        System.out.println("倒出可樂...");
    }

}
