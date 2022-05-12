package clean.code.design_patterns.requirements;

public class Carne extends Produs {
    public Carne(String name, float price) {
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
