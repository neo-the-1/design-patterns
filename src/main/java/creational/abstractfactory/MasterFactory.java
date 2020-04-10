package creational.abstractfactory;

public class MasterFactory extends CreditCardFactory {

    @Override
    public CreditCard createCard(CardType cardType) {
        switch (cardType) {
            case GOLD:
                return new MasterGoldCard("master gold");
            case PLATINUM:
                return new MasterPlatinumCard("master platinum");
            default:
                throw new RuntimeException("invalid " + cardType);
        }
    }
}
