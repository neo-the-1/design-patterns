package creational.builder;

public class Beverage implements Product {

    private final String name;
    private final Double price;
    private final Double energy;
    private final Float protein;
    private final Float fat;
    private final Float carbohydrate;
    private final Float calcium;
    private final Float iron;

    Beverage(BeverageBuilder builder) {
        this.name = builder.getName();
        this.price = builder.getPrice();
        this.energy = builder.getEnergy();
        this.protein = builder.getProtein();
        this.fat = builder.getFat();
        this.carbohydrate = builder.getCarbohydrate();
        this.calcium = builder.getCalcium();
        this.iron = builder.getIron();
    }

    @Override
    public String toString() {
        return "Beverage{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", energy=" + energy +
                ", protein=" + protein +
                ", fat=" + fat +
                ", carbohydrate=" + carbohydrate +
                ", calcium=" + calcium +
                ", iron=" + iron +
                '}';
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Double getEnergy() {
        return energy;
    }

    public Float getProtein() {
        return protein;
    }

    public Float getFat() {
        return fat;
    }

    public Float getCarbohydrate() {
        return carbohydrate;
    }

    public Float getCalcium() {
        return calcium;
    }

    public Float getIron() {
        return iron;
    }

}
