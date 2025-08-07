import cuffie.Cuffie;
import java.util.Scanner;
import prodotto.Prodotto;
import smartphone.Smartphone;
import televisore.Televisore;

public class Carrello {
public static void main(String[] args) {
    
Scanner scan = new Scanner(System.in);
System.out.println("Scegli"

+ "-1 se vuoi un Televisore"
+ "-2 se vuoi uno Smartphone"
+ "-3 se vuoi delle Cuffie");

int scelta = scan.nextInt();
Prodotto p1 = null;

if (scelta == 1) {
    System.out.println("Hai scelto il televisore, inserisci i dati");
    int codice = scan.nextInt();
    scan.nextLine();
    String nome = scan.nextLine();
    String marca = scan.nextLine();
    double prezzo = scan.nextDouble();
    scan.nextLine();
    double iva = scan.nextDouble();
    scan.nextLine();
    int dimensioni = scan.nextInt();
    scan.nextLine();
    String smart = scan.nextLine();
    p1 = new Televisore(codice, nome, marca, prezzo, iva, dimensioni, smart);    
} else if (scelta == 2) {
    System.out.println("Hai scelto lo smartphone, inserisci i dati");
    int codice = scan.nextInt();
    scan.nextLine();
    String nome = scan.nextLine();
    String marca = scan.nextLine();
    double prezzo = scan.nextDouble();
    scan.nextLine();
    double iva = scan.nextDouble();
    scan.nextLine();
    int imei = scan.nextInt();
    int memoria = scan.nextInt();
    p1 = new Smartphone(codice, nome, marca, prezzo, iva, imei, memoria);
} else if (scelta == 3) {

System.out.println("Hai scelto le cuffie, inserisci i dati");
int codice = scan.nextInt();
scan.nextLine();
String nome = scan.nextLine();
String marca = scan.nextLine();
double prezzo = scan.nextDouble();
scan.nextLine();
double iva = scan.nextDouble();
scan.nextLine();
String colore = scan.nextLine();
String cablate = scan.nextLine();
p1 = new Cuffie(codice, nome, marca, prezzo, iva, colore, cablate);
} 

}

}
