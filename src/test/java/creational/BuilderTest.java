package creational;

import creational.builder.Beverage;
import creational.builder.BeverageBuilder;
import creational.builder.Builder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BuilderTest {

    @Test
    void createWaterBottle() {
        Builder builder = new BeverageBuilder("Water", 20.0);
        Beverage waterBottle = (Beverage) builder.build();
        Assertions.assertNotNull(waterBottle);
        Assertions.assertEquals("Water", waterBottle.getName());
        Assertions.assertEquals(20.0, waterBottle.getPrice());
        Assertions.assertNull(waterBottle.getEnergy());
        Assertions.assertNull(waterBottle.getProtein());
        Assertions.assertNull(waterBottle.getFat());
        Assertions.assertNull(waterBottle.getCarbohydrate());
        Assertions.assertNull(waterBottle.getCalcium());
        Assertions.assertNull(waterBottle.getIron());
    }

    @Test
    void createMyChocolateDrink() {
        Builder builder = new BeverageBuilder("Chocolate", 199.99)
                .energy(2000.0)
                .protein(20f)
                .fat(50f)
                .carbohydrate(30f)
                .calcium(1.5f);
        Beverage myChocolateDrink = (Beverage) builder.build();
        Assertions.assertNotNull(myChocolateDrink);
        Assertions.assertEquals("Chocolate", myChocolateDrink.getName());
        Assertions.assertEquals(199.99, myChocolateDrink.getPrice());
        Assertions.assertEquals(2000.0, myChocolateDrink.getEnergy());
        Assertions.assertEquals(20f, myChocolateDrink.getProtein());
        Assertions.assertEquals(50f, myChocolateDrink.getFat());
        Assertions.assertEquals(30f, myChocolateDrink.getCarbohydrate());
        Assertions.assertEquals(1.5f, myChocolateDrink.getCalcium());
        Assertions.assertNull(myChocolateDrink.getIron());
    }

}
