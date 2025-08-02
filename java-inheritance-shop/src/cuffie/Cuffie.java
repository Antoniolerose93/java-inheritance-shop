
package cuffie;

import prodotto.Prodotto;

public class Cuffie extends Prodotto {

private String colore;

private String cablate;

public Cuffie(int codice, String nome, String marca, double prezzo, double iva, double prezzoIvato, String colore, String cablate){
super(codice, nome, marca, prezzo, iva, prezzoIvato);
this.colore = colore;
this.cablate = cablate;

}




public String getColore() {
    return colore;
}




public String getCablate() {
    return cablate;
}




@Override
public String toString(){
    return "Cuffie{" +
           "colore =" + getColore() +
           ", sono cablate? =" + getCablate() + "," +
           super.toString()+'}';
}


}