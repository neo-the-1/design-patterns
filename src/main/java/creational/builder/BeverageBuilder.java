package creational.builder;

public class BeverageBuilder implements Builder {

    private String name;
    private Double price;
    private Double energy;
    private Float protein;
    private Float fat;
    private Float carbohydrate;
    private Float calcium;
    private Float iron;

    public BeverageBuilder(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public Product build() {
        return new Beverage(this);
    }

    public BeverageBuilder energy(Double energy) {
        this.energy = energy;
        return this;
    }

    public BeverageBuilder protein(Float protein) {
        this.protein = protein;
        return this;
    }

    public BeverageBuilder fat(Float fat) {
        this.fat = fat;
        return this;
    }

    public BeverageBuilder carbohydrate(Float carbohydrate) {
        this.carbohydrate = carbohydrate;
        return this;
    }

    public BeverageBuilder calcium(Float calcium) {
        this.calcium = calcium;
        return this;
    }

    public BeverageBuilder iron(Float iron) {
        this.iron = iron;
        return this;
    }

    String getName() {
        return name;
    }

    Double getPrice() {
        return price;
    }

    Double getEnergy() {
        return energy;
    }

    Float getProtein() {
        return protein;
    }

    Float getFat() {
        return fat;
    }

    Float getCarbohydrate() {
        return carbohydrate;
    }

    Float getCalcium() {
        return calcium;
    }

    Float getIron() {
        return iron;
    }

}