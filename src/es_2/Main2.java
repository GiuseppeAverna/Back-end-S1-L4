package es_2;

public class Main2 {
    public static void main(String[] args) {
        Dipendente[] dipendenti = new Dipendente[3];
        dipendenti[0] = new DipendenteFullTime(1, 3000.0);
        dipendenti[1] = new DipendentePartTime(2, 15.0, 20);
        dipendenti[2] = new Dirigente(3, 5000.0, 1000.0);

        double stipendiTotali = 0.0;
        for (Dipendente dipendente : dipendenti) {
            stipendiTotali += dipendente.calculateSalary();
        }

        System.out.println("Stipendi totali: " + stipendiTotali);
    }
}