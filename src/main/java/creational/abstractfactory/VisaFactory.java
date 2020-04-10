package creational.abstractfactory;

public class VisaFactory extends CreditCardFactory {

    @Override
    public CreditCard createCard(CardType cardType) {
        switch (cardType) {
            case GOLD:
                return new VisaGoldCard("visa gold");
            case PLATINUM:
                return new VisaPlatinumCard("visa platinum");
            default:
                throw new RuntimeException("invalid " + cardType);
        }
    }
}
