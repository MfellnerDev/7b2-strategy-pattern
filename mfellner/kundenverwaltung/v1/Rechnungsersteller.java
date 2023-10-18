package mfellner.kundenverwaltung.v1;

import java.time.LocalDate;

public class Rechnungsersteller {

  public static void main(String[] args) {
    Kunde k1 = new Kunde("Max Meier");
    Kunde k2 = new Kunde("Felix Forster");
    k2.setAbrechnung(new Fixplatzabrechnung(2, 10));
    Rechnung m1 = new Rechnung(k1, LocalDate.of(2019,9,1));
    m1.setBis(LocalDate.of(2019,9,10));
    m1.add(new Tennisstunde("Mo 2.9. Platz 1", 15));
    m1.add(new Tennisstunde("Di 3.9. Platz 2", 12));
    m1.add(new Tennisstunde("Mi 3.9. Platz 2", 15));
    System.out.println(m1.rechnungstext());
    Rechnung m2 = new Rechnung(k2, LocalDate.of(2019,9,1));
    m2.setBis(LocalDate.of(2019,9,10));
    m2.add(new Tennisstunde("Mo 2.9. Platz 1", 15));
    m2.add(new Tennisstunde("Di 3.9. Platz 2", 12));
    m2.add(new Tennisstunde("Mi 3.9. Platz 2", 15));
    System.out.println(m2.rechnungstext());
  }

}
