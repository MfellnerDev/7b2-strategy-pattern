package mfellner.kundenverwaltung.v1;

import java.util.List;

/**
 * Standardabrechnungsart für die Kunden, die dies gewählt haben
 *
 * @author Manuel Fellner
 * @version 18.10.2023
 */
public class Standardabrechnung implements Abrechnung {
    @Override
    public double berechnePreis(List<Tennisstunde> l) {
        double preis = 0;
        for(Tennisstunde ts:l) {
            preis += ts.getPreis();
        }
        return preis;
    }

    @Override
    public String toString()    {
        return this.getClass().getSimpleName();
    }
}
