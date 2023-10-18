package mfellner.kundenverwaltung.v1;

import java.util.List;

public class Kunde {

  private Abrechnung abrechnung;

  private String name;

  public Kunde(String name) {
    super();
    this.name = name;
    this.abrechnung = new Standardabrechnung();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAbrechnung (Abrechnung newAbrechnung)  {
    this.abrechnung = newAbrechnung;
  }

  public double berechnePreis(List<Tennisstunde> l) {
    return this.abrechnung.berechnePreis(l);
  }
  
  @Override
  public String toString() {
    return "\nName: " + this.name + "\n Abrechnungsart: " + this.abrechnung.toString();
  }
}
