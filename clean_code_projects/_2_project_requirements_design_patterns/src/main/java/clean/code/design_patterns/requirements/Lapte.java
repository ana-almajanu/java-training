package clean.code.design_patterns.requirements;

public class Lapte extends Produs {

    public Lapte(String name, float price) {
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
