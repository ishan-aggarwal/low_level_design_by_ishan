package decorator;

public class ExtraCheeseTopping extends ToppingDecorator {
    public ExtraCheeseTopping(BasePizza pizza) {
        this.basePizza = pizza;
    }

    @Override
    int cost() {
        return this.basePizza.cost() + 30;
    }
}
