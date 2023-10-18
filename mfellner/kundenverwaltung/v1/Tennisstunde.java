package mfellner.kundenverwaltung.v1;

public class Tennisstunde {
  private String bezeichnung;
  private double preis;


  public Tennisstunde(String bezeichnung, double preis) {
    super();
    this.bezeichnung = bezeichnung;
    this.preis = preis;
  }

  public String getBezeichnung() {
    return bezeichnung;
  }

  public void setBezeichnung(String bezeichnung) {
    this.bezeichnung = bezeichnung;
  }

  public double getPreis() {
    return preis;
  }

  public void setPreis(double preis) {
    this.preis = preis;
  }

  public String toString() {
    return this.bezeichnung + " (" +
            FormatKonstanten.PREIS_FORMAT.format(preis) + " " +
            FormatKonstanten.WAEHRUNG + ")";
  }

}