package clean.code.design_patterns.requirements;

// Am implementat clasa ProdusFactory folosindu-ma de Design Patternul Factory.
// Acesta este un design pattern creational, care imi returneaza un nou tip de produs,
// in functie de ce este introdus de utilizator de la tastatura.
// Primind un String de la tastatura, acesta este verificat cu produsele care exista,
// iar daca se afla printre acestea este returnat un astfel de produs.

public class ProdusFactory {
    public static Produs getProdus(String type){
        if("Lapte".equals(type)){
            return new Lapte("Lapte", 12.0f);
        }
        if("Carne".equals(type)){
            return new Carne("Carne", 25.0f);
        }
        if("Oua".equals(type)){
            return new Oua("Oua", 13.0f);
        }
        if("Apa".equals(type)){
            return new Apa("Apa", 2.5f);
        }
        return null;
    }

}
