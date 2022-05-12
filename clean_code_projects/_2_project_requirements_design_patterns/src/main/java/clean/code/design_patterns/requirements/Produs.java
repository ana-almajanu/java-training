package clean.code.design_patterns.requirements;

public abstract class Produs {
    protected String name;
    protected float price;

    protected Produs(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public abstract String getNume();
    public abstract float getPrice();
}
