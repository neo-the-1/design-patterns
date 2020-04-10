package creational.abstractfactory;

public abstract class CreditCardFactory {

    public enum PaymentNetworkType {
        VISA, MASTER;
    }

    public static CreditCardFactory getCreditCardFactory(PaymentNetworkType paymentNetworkType) {
        switch (paymentNetworkType) {
            case VISA:
                return new VisaFactory();
            case MASTER:
                return new MasterFactory();
            default:
                throw new RuntimeException("invalid " + paymentNetworkType);
        }
    }

    public abstract CreditCard createCard(CardType cardType);

}
