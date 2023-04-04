package it.aulab.model;

public class Joker {
    private Vestiti vestiti;

    private Macchina macchina;

    public Joker(Vestiti vestiti, Macchina macchina) {
        System.out.println("Crea Joker");
       
        this.vestiti = vestiti;
        this.macchina = macchina;
    }

    public Joker() {
    }

    public Vestiti getVestiti() {
        return vestiti;
    }

    public void setVestiti(Vestiti vestiti) {
        this.vestiti = vestiti;
    }

    public Macchina getMacchina() {
        return macchina;
    }

    public void setMacchina(Macchina macchina) {
        this.macchina = macchina;
    }
}
