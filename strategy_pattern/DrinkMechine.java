package strategy_pattern;

public class DrinkMechine {
    private DrinkProduce drinkProduce;

    public DrinkMechine(DrinkProduce drinkProduce) {
        this.drinkProduce = drinkProduce;
    }

    public void pourOut() {
        this.drinkProduce.pourOut();
    }

    public void setDrinkProduce(DrinkProduce drinkProduce) {
        this.drinkProduce = drinkProduce;
    }
}
