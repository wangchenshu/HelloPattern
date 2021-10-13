package strategy_pattern;

public class Sprite implements DrinkProduce {
    public Sprite() {
        System.out.println("設定雪碧...");
    }

    @Override
    public void pourOut() {
        System.out.println("倒出雪碧...");
    }

}
