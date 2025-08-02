/*Creare la classe Prodotto che gestisce i prodotti dello shop.
Un prodotto è caratterizzato da:
- codice (numero intero)
- nome
- marca
- prezzo
- iva
Usate opportunamente i livelli di accesso (public, private), i costruttori,
i metodi getter e setter ed eventuali altri metodi di “utilità” per fare in modo che:
- il codice prodotto sia accessibile solo in lettura
- gli altri attributi siano accessibili sia in lettura che in scrittura
Lo shop gestisce diversi tipi di prodotto:
- Smarphone, caratterizzati anche dal codice IMEI e dalla quantità di memoria
- Televisori, caratterizzati dalle dimensioni e dalla proprietà di essere smart oppure no
- Cuffie, caratterizzate dal colore e se sono wireless o cablate
Utilizzate l’ereditarietà per riutilizzare il codice di Prodotto nella stesura delle 
classi che gestiscono i vari sotto tipi di prodotto.
 * 
 */

import cuffie.Cuffie;
import smartphone.Smartphone;
import televisore.Televisore;


public class App {
    public static void main(String[] args) throws Exception {

        Smartphone s1 = new Smartphone(164, "Galaxy", "Samsung", 200, 22, 3216, 64);
        Televisore t1 = new Televisore(165, "nome", "Sony", 120, 22, 55, "non è smart");
        Cuffie c1 = new Cuffie(166, "ABV", "Wesc", 50, 22, "Rosso", "si");

        System.out.println(s1);
        System.out.println(t1);
        System.out.println(c1);

    }
}
