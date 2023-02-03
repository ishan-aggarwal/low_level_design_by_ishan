package decorator;

public class ExtraPaneerTopping extends ToppingDecorator {

    private BasePizza basePizza;

    public ExtraPaneerTopping(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    int cost() {
        return this.basePizza.cost() + 15;
    }
}
