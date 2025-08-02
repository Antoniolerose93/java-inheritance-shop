package televisore;

import prodotto.Prodotto;

public class Televisore extends Prodotto {

private int dimensioni;

private String smart;

public Televisore(int codice, String nome, String marca, double prezzo, double iva, int dimensioni, String smart){
super(codice, nome, marca, prezzo, iva);
this.dimensioni = dimensioni;
this.smart = smart;

}



public int getDimensioni() {
    return dimensioni;
}



public String getSmart() {
    return smart;
}



public String toString (){
return "Televisore{" +
        "dimensioni=" + getDimensioni() +
        ", è smart? =" + getSmart() + "," +
           super.toString()+'}';
}

}
