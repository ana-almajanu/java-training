package clean.code.design_patterns.requirements;

public class Sunca extends Produs{
    public Sunca(String name, float price) {
        super(name, price);
    }

    @Override
    public String getNume(){
        return name;
    }

    @Override
    public float getPrice() {
        return price;
    }

    ;
}
