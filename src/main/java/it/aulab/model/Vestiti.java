package it.aulab.model;

public class Vestiti {
   
    private String colore;
    private Trucco trucco;
    private Pistola pistola;
    
    public Vestiti(String colore, Trucco trucco, Pistola pistola) {
        System.out.println("Crea vestiti");
       
        this.colore = colore;
        this.trucco = trucco;
        this.pistola = pistola;
    }
    public Vestiti() {
    }
    public String getColore() {
        return colore;
    }
    public void setColore(String colore) {
        this.colore = colore;
    }
    public Trucco getTrucco() {
        return trucco;
    }
    public void setTrucco(Trucco trucco) {
        this.trucco = trucco;
    }
    public Pistola getPistola() {
        return pistola;
    }
    public void setPistola(Pistola pistola) {
        this.pistola = pistola;
    }
}
