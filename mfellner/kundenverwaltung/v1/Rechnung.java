package mfellner.kundenverwaltung.v1;

import java.time.LocalDate;
import java.util.*;

public class Rechnung {
  private LocalDate von;
  private LocalDate bis;
  private Kunde kunde;
  private List<Tennisstunde> stunden;
  
  public Rechnung(Kunde kunde, LocalDate von) {
    this.von = von;
    this.kunde = kunde;
    stunden = new ArrayList<>();
  }

  public boolean add(Tennisstunde tennisstunde) {
    return stunden.add(tennisstunde);
  }
  
  public void setBis(LocalDate bis) {
    this.bis = bis;
  }

  public LocalDate getBis() {
    return bis;
  }
  
  public LocalDate getVon() {
    return von;
  }

  public Kunde getKunde() {
    return kunde;
  }
  
  public int getAnzahlStunden() {
    return stunden.size();
  }
  
  public double rechnungssumme() {
    return kunde.berechnePreis(stunden);
  }
  
  public String rechnungstext() {
    StringBuilder text = new StringBuilder("Rechnung");
    text.append("\nKunde: ");
    text.append(kunde.toString());
    text.append("\nDatum: ");
    text.append(FormatKonstanten.DATUM_FORMAT.format(von));
    text.append(" - ");
    text.append(FormatKonstanten.DATUM_FORMAT.format(bis));
    text.append("\nStunden: ");
    for(Tennisstunde ts:stunden) {
      text.append(ts.toString());
      text.append(", ");
    }
    text.append("\nGesamt: ");
    text.append(FormatKonstanten.PREIS_FORMAT.format(this.rechnungssumme())); 
    text.append(" "); 
    text.append(FormatKonstanten.WAEHRUNG);
    return text.toString();
  }
  
}
