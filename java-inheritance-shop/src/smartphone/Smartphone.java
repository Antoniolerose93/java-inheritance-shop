package smartphone;

import prodotto.Prodotto;

public class Smartphone extends Prodotto {

private int imei;

private int memoria;

public Smartphone(int codice, String nome, String marca, double prezzo, double iva, int imei, int memoria){
super(codice, nome, marca, prezzo, iva);
this.imei = imei;
this.memoria = memoria;


}



public int getImei() {
    return imei;
}



public int getMemoria() {
    return memoria;
}



@Override
public String toString(){
    return "Smartphone{" +
           "codice imei=" + getImei() +
           ", memoria =" + getMemoria() + "," +
           super.toString()+'}';

}

}