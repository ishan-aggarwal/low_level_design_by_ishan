package decorator;

public class ExtraCheeseTopping extends ToppingDecorator {

    private BasePizza basePizza;

    public ExtraCheeseTopping(BasePizza pizza) {
        this.basePizza = pizza;
    }

    @Override
    int cost() {
        return this.basePizza.cost() + 30;
    }
}
