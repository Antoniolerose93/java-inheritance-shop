
package cuffie;

import prodotto.Prodotto;

public class Cuffie extends Prodotto {

private String colore;

private boolean cablate;

public Cuffie(int codice, String nome, String marca, double prezzo, double iva, double prezzoIvato, String colore, boolean cablate){
super(codice, nome, marca, prezzo, iva, prezzoIvato);
this.colore = colore;
this.cablate = cablate;

}




public String getColore() {
    return colore;
}




public boolean getCablate() {
    return cablate;
}




@Override
public String toString(){
    return "Cuffie{" +
           ", memoria =" + getColore() +
           ", memoria =" + getCablate() + "," +
           super.toString()+'}';
}


}