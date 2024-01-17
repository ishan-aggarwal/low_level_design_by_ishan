package visitor.card_system;

// m * n
// where m is the total types of offers on-going - which will have one visit method for each type of credit card
// and n is the total types of credit cards - which will accept the offer
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
