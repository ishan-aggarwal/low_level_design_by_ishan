package visitor.card_system;

public class PhoneBillOfferVisitor implements OfferVisitor {
    @Override
    public void visit(BronzeCreditCard bronzeCreditCard) {
        System.out.println("Bill offer for Bronze Credit Card is 10% off");
    }

    @Override
    public void visit(SilverCreditCard silverCreditCard) {
        System.out.println("Bill offer for Silver Credit Card is 20% off");
    }

    @Override
    public void visit(GoldCreditCard goldCreditCard) {
        System.out.println("Bill offer for Gold Credit Card is 30% off");
    }
}
