package visitor.card_system;

public class CreditCardMainApp {
    public static void main(String[] args) {
        CreditCard[] cards = {new GoldCreditCard(), new SilverCreditCard(), new BronzeCreditCard()};
        OfferVisitor visitor = new PhoneBillOfferVisitor();
        for (CreditCard card : cards) {
            card.accept(visitor);
        }

        System.out.println("=====================================");
        visitor = new ShoppingBillOfferVisitor();
        for (CreditCard card : cards) {
            card.accept(visitor);
        }
        System.out.println("=====================================");

        visitor = new TravelBillOfferVisitor();
        for (CreditCard card : cards) {
            card.accept(visitor);
        }
        System.out.println("=====================================");

    }
}
