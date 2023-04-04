package it.aulab.model;

public class Trucco {
    private String colore;

    public Trucco(String colore) {
        System.out.println("Crea trucco");
        
        this.colore = colore;
    }

    public Trucco() {
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }
}
