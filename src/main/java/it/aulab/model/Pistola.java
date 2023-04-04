package it.aulab.model;

public class Pistola {
    private Integer capienza;

    public Pistola(Integer capienza) {
        System.out.println("Crea Pistola");
        this.capienza = capienza;
    }

    public Pistola() {
    }

    public Integer getCapienza() {
        return capienza;
    }

    public void setCapienza(Integer capienza) {
        this.capienza = capienza;
    }
}
