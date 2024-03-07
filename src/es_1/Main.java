package es_1;

import es_1.Dipendente;

public class Main {
    public static void main(String[] args) {
        Dipendente dipendente1 = new Dipendente(1, 1200, "PRODUZIONE");
        Dipendente dipendente2 = new Dipendente(2, 1350, "AMMINISTRAZIONE");
        Dipendente dipendente3 = new Dipendente(3, 1600, "VENDITE");

        Dipendente[] arraydipendenti = {dipendente1, dipendente2, dipendente3};

        for (Dipendente dipendente : arraydipendenti) {
            System.out.println("Matricola: " + dipendente.getMatricola());
        }
    }


}