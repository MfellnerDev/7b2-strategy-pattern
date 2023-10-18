package mfellner.kundenverwaltung.v1;

import java.util.List;

/**
 * Fixplatzabrechnung für Kunden, der diese Option gewählt hat
 *
 * @author Manuel Fellner
 * @version 18.10.2023
 */
public class Fixplatzabrechnung implements Abrechnung {
    private int fixStunden;

    private double fixPreis;

    public Fixplatzabrechnung (int fixStunden, double fixPreis) {
        this.fixStunden = fixStunden;
        this.fixPreis = fixPreis;
    }

    @Override
    public double berechnePreis(List<Tennisstunde> l) {
        double preis = this.fixStunden * this.fixPreis;
        for(int i = this.fixStunden; i < l.size(); i++) {
            preis += l.get(i).getPreis();
        }
        return preis;
    }

    @Override
    public String toString()    {
        return this.getClass().getSimpleName() + "\nFixstunden: " + this.fixStunden + "\nFixpreis: " + this.fixPreis;
    }
}
