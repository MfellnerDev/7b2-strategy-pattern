package mfellner.kundenverwaltung.v1;

import java.util.List;

/**
 * Wenn der Kunde eine Bonuscard hat
 *
 * @author Manuel Fellner
 * @version 18.10.2023
 */
public class Bonuscardabrechnung implements Abrechnung {

    // Betrag der Bonuskarte in %!
    private double bonusKartenBetrag;

    public Bonuscardabrechnung (double bonusKartenBetrag)   {
        this.bonusKartenBetrag = bonusKartenBetrag;
    }

    public void setBonusKartenBetrag (double bonusKartenBetrag) {
        this.bonusKartenBetrag = bonusKartenBetrag;
    }

    @Override
    public double berechnePreis(List<Tennisstunde> tennisliste) {
        double gesamtPreis = 0;
        for(Tennisstunde ts: tennisliste) {
            gesamtPreis += ts.getPreis();
        }
        System.out.println(gesamtPreis);
        // Bonuskartenbetrag wird vom gesamtpreis abgezogen
        gesamtPreis -= (gesamtPreis*(this.bonusKartenBetrag/100));
        return gesamtPreis;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "\nBonuskartenbetrag: " + this.bonusKartenBetrag + "%";
    }
}
