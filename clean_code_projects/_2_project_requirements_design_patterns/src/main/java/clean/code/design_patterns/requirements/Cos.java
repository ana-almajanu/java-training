package clean.code.design_patterns.requirements;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import static clean.code.design_patterns.requirements.ProdusFactory.getProdus;

// Am implementat clasa Cos folosindu-ma de Design Patternul Singleton.

public class Cos {
    private static Cos instanta = null;
    private Store store;
    private Cos() {
        store = Store.getInstance();
    }
    private ArrayList<Produs> produsInCart = new ArrayList<>();

    public void addInCart(Produs prod){
        produsInCart.add(prod);
    }
    public ArrayList<Produs> getCart(){
        return produsInCart;
    }

    public static Cos getInstance(){
        if(Cos.instanta == null){
            Cos.instanta = new Cos();
        }
        return Cos.instanta;
    }
}
