package clean.code.design_patterns.requirements;

import java.util.ArrayList;

public class Store {
    private static Store instance = null;
    public static Store getInstance() {
        if(instance == null)
            instance = new Store();

        return instance;
    }
    private ArrayList<Produs> produses = new ArrayList<>();
    private Store() {
        produses.add(ProdusFactory.getProdus("Lapte"));
        produses.add(ProdusFactory.getProdus("Oua"));
        produses.add(ProdusFactory.getProdus("Carne"));
        produses.add(ProdusFactory.getProdus("Apa"));
    }

    public boolean inStock(Produs prod){
        for (int i =0; i < produses.size(); i++){
            if(produses.get(i).name.equals(prod.name))
                return true;
        }
        return false;
    }

}
