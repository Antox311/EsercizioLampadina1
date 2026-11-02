// Indica il pacchetto in cui è contenuta questa classe
package com.mycompany.eserciziolampadina1;

public class Lampadina1 {

    // --- ATTRIBUTI (o Variabili di Istanza) ---
    // Sono 'private' per il principio dell'INCAPSULAMENTO:
    // non si possono modificare o accedere direttamente da fuori classe.
    
    private boolean stato;       
    private int watt;             
    private int volt;             
    private String tipo;          
    private int vitaRimanente;    
    private int vitaTot;          

    // --- COSTRUTTORI ---

    /**
     * Costruttore di default (senza parametri).
     * Viene usato quando si scrive: new Lampadina1()
     * Imposta dei valori predefiniti di base per la lampadina.
     */
    public Lampadina1() {
        // 'this' si riferisce all'oggetto che si sta creando in questo momento
        this.stato = false;        
        this.watt = 60;            
        this.volt = 220;           
        this.tipo = "LED";         
        this.vitaRimanente = 10000;
        this.vitaTot = 10000;
    }

    /**
     * Costruttore parametrizzato.
     * Permette di creare una lampadina personalizzando tutti i dati subito.
     * Viene usato quando si scrive: new Lampadina1(true, 12, 230, "LED", 15000, 15000)
     */
    public Lampadina1(boolean stato, int watt, int volt, String tipo, int vitaRimanente, int vitaTot) {
        // Si usa 'this.variabile' per distinguere l'attributo della classe 
        // dal parametro con lo stesso nome passato tra le parentesi ()
        this.stato = stato;
        this.watt = watt;
        this.volt = volt;
        this.tipo = tipo;
        this.vitaRimanente = vitaRimanente;
        this.vitaTot = vitaTot;
    }


    // --- METODI GETTER E SETTER ---
    // Poiché gli attributi sono 'private', usiamo i metodi pubblici per:
    // 1. GETTER (get...): Leggere il valore dell'attributo
    // 2. SETTER (set...): Modificare il valore dell'attributo

    // Ritorna lo stato attuale (true = accesa, false = spenta)
    // Per i boolean convenzionalmente si usa "is" al posto di "get"
    public boolean isStato() {
        return stato;
    }

    // Permette di accendere o spegnere la lampadina dall'esterno
    public void setStato(boolean stato) {
        this.stato = stato;
    }

    // Ritorna i Watt
    public int getWatt() {
        return watt;
    }

    // Modifica i Watt
    public void setWatt(int watt) {
        this.watt = watt;
    }

    // Ritorna i Volt
    public int getVolt() {
        return volt;
    }

    // Modifica i Volt
    public void setVolt(int volt) {
        this.volt = volt;
    }

    // Ritorna il tipo di lampadina (es. "LED")
    public String getTipo() {
        return tipo;
    }

    // Modifica il tipo
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Ritorna le ore di vita rimanenti
    public int getVitaRimanente() {
        return vitaRimanente;
    }

    // Aggiorna le ore di vita rimanenti
    public void setVitaRimanente(int vitaRimanente) {
        this.vitaRimanente = vitaRimanente;
    }

    // Ritorna la vita totale massima
    public int getVitaTot() {
        return vitaTot;
    }

    // Modifica la vita totale
    public void setVitaTot(int vitaTot) {
        this.vitaTot = vitaTot;
    }
}