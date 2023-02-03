package decorator;

public class PizzaApp {

    public static void main(String[] args) {
        BasePizza pizza = new MargheritaPizza();
        System.out.println("Cost for Margherita Pizza:                                          " + pizza.cost());

        BasePizza pizza1 = new ExtraCheeseTopping(new MargheritaPizza());
        System.out.println("Cost for Margherita Pizza with extra cheese:                        " + pizza1.cost());

        BasePizza pizza2 = new ExtraPaneerTopping(new ExtraCheeseTopping(new MargheritaPizza()));
        System.out.println("Cost for Margherita Pizza with extra cheese and paneer:             " + pizza2.cost());

        BasePizza pizza4 = new ExtraCheeseTopping(new ExtraCheeseTopping(new ExtraPaneerTopping(new VeggieDelightPizza())));
        System.out.println("Cost for VeggieDelight Pizza with double cheese and extra paneer:   " + pizza4.cost());

        BasePizza pizza3 = new ExtraCheeseTopping(new ExtraCheeseTopping(new ExtraPaneerTopping(new FarmHousePizza())));
        System.out.println("Cost for FarmHouse Pizza with double cheese and extra paneer:       " + pizza3.cost());

    }
}
