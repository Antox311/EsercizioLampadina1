// Indica il pacchetto (la cartella) a cui appartiene questa classe
package com.mycompany.eserciziolampadina1;

// Definizione della classe principale del programma
public class EsercizioLampadina1 {

    // Il metodo main() è il punto di partenza: tutto il codice al suo interno 
    // viene eseguito automaticamente all'avvio del programma
    public static void main(String[] args) {

        // --- CREAZIONE DEGLI OGGETTI (Lampadine) ---

        // Crea l'oggetto 'l1' usando il costruttore di default (senza parametri).
        // Prenderà i valori di default stabiliti nella classe Lampadina1.
        Lampadina1 l1 = new Lampadina1();

        // Crea l'oggetto 'l2' usando il costruttore con parametri e specificando i dati:
        // stato=accesa (true), watt=12, volt=230, tipo="LED", vitaRimanente=15000, vitaMassima=15000
        Lampadina1 l2 = new Lampadina1(true, 12, 230, "LED", 15000, 15000);

        // Crea l'oggetto 'l3' (spenta, 60W, 220V, ad incandescenza, ecc.)
        Lampadina1 l3 = new Lampadina1(false, 60, 220, "incandescenza", 800, 1000);

        // Crea l'oggetto 'l4' (accesa, 36W, 220V, fluorescente, ecc.)
        Lampadina1 l4 = new Lampadina1(true, 36, 220, "fluorescente", 5000, 8000);


        // --- STAMPA DEI DATI A SCHERMO ---

        // Usa i metodi "getter" (es. getTipo(), isStato()) per recuperare 
        // le informazioni private degli oggetti e mostrarle in console

        // Stampa il tipo e lo stato (accesa/spenta) di l1
        System.out.println("Lampadina 1 (Tipo): " + l1.getTipo() + " - Accesa: " + l1.isStato());

        // Stampa la potenza (Watt) e le ore di vita rimaste per l2
        System.out.println("Lampadina 2 (Watt): " + l2.getWatt() + " W - Vita rimanente: " + l2.getVitaRimanente() + " ore");

        // Stampa il tipo e la tensione (Volt) di l3
        System.out.println("Lampadina 3 (Tipo): " + l3.getTipo() + " - Volt: " + l3.getVolt() + " V");

        // Stampa il tipo e la potenza (Watt) di l4
        System.out.println("Lampadina 4 (Tipo): " + l4.getTipo() + " - Watt: " + l4.getWatt() + " W");
    }
}