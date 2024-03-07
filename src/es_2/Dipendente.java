package es_2;

abstract class Dipendente {
    private int matricola;
    protected double stipendio;

    public Dipendente(int matricola) {
        this.matricola = matricola;
    }

    public int getMatricola() {
        return matricola;
    }

    public abstract double calculateSalary();
}

class DipendenteFullTime extends Dipendente {
    public DipendenteFullTime(int matricola, double stipendio) {
        super(matricola);
        this.stipendio = stipendio;
    }

    @Override
    public double calculateSalary() {
        return stipendio;
    }
}

class DipendentePartTime extends Dipendente {
    private int oreLavorate;
    private double salarioOrario;

    public DipendentePartTime(int matricola, double salarioOrario, int oreLavorate) {
        super(matricola);
        this.salarioOrario = salarioOrario;
        this.oreLavorate = oreLavorate;
    }

    @Override
    public double calculateSalary() {
        return salarioOrario * oreLavorate;
    }
}

class Dirigente extends Dipendente {
    private double bonus;

    public Dirigente(int matricola, double stipendio, double bonus) {
        super(matricola);
        this.stipendio = stipendio;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return stipendio + bonus;
    }
}