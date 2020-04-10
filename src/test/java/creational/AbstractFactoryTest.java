package creational;

import creational.abstractfactory.CardType;
import creational.abstractfactory.CreditCard;
import creational.abstractfactory.CreditCardFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AbstractFactoryTest {

    @Test
    void createVisaGold() {
        CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(CreditCardFactory.PaymentNetworkType.VISA);
        CreditCard creditCard = abstractFactory.createCard(CardType.GOLD);
        Assertions.assertEquals("visa gold", creditCard.getName());
    }

    @Test
    void createVisaPlatinum() {
        CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(CreditCardFactory.PaymentNetworkType.VISA);
        CreditCard creditCard = abstractFactory.createCard(CardType.PLATINUM);
        Assertions.assertEquals("visa platinum", creditCard.getName());
    }

    @Test
    void createMasterGold() {
        CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(CreditCardFactory.PaymentNetworkType.MASTER);
        CreditCard creditCard = abstractFactory.createCard(CardType.GOLD);
        Assertions.assertEquals("master gold", creditCard.getName());
    }

    @Test
    void createMasterPlatinum() {
        CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(CreditCardFactory.PaymentNetworkType.MASTER);
        CreditCard creditCard = abstractFactory.createCard(CardType.PLATINUM);
        Assertions.assertEquals("master platinum", creditCard.getName());
    }

}
