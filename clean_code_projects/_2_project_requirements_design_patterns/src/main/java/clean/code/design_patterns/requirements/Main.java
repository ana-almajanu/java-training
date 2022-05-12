package clean.code.design_patterns.requirements;

import java.util.Scanner;

import static clean.code.design_patterns.requirements.ProdusFactory.getProdus;

public class Main {

    public static void main(String[] args) {
        //TODO implement your design patterns in this package
        Cos cos = Cos.getInstance();
        /*Scanner sc = new Scanner(System.in);
        int nrProduse=sc.nextInt();
        Produs v[]=new Produs[nrProduse];
        for(int i=0;i<nrProduse;i++){
            String prod=sc.nextLine();
            v[i]=getProdus(prod);
        }*/

        Scanner scan = new Scanner(System.in);
        int c = 0;
        boolean ok;
        int nrListaCumparaturi = scan.nextInt();
        scan.nextLine();
        //String arr[]=new String[nrListaCumparaturi];
        Produs produs;
        for (int i = 0; i < nrListaCumparaturi; i++) {
            String prodLista = scan.nextLine();
            System.out.println(prodLista);
            //arr[i]=prodLista;
            produs = getProdus(prodLista);
            if (produs == null)
                System.out.println("Produsul: " + prodLista + " nu se afla in magazin.");
            else {
                System.out.println("Produsul: " + prodLista + " se afla in magazin, la pretul: "+ produs.price +".");
                cos.addInCart(produs);
            }
        }

        System.out.println(cos.getCart().size());
        for (int i = 0; i < cos.getCart().size(); i++)
            System.out.println(cos.getCart().get(i).getNume() + " ");


    }
}
