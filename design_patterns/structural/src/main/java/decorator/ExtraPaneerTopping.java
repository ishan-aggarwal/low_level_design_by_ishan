package decorator;

public class ExtraPaneerTopping extends ToppingDecorator {

    public ExtraPaneerTopping(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    int cost() {
        return this.basePizza.cost() + 15;
    }
}
