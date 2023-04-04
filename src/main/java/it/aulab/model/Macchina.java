package it.aulab.model;

public class Macchina {
    private String colore;

    public Macchina(String colore) {
        System.out.println("Crea macchina");
        
        this.colore = colore;
    }

    public Macchina() {
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }
}
