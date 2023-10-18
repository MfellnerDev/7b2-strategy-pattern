package mfellner.kundenverwaltung.v1;

import java.time.LocalDate;

public class Rechnungsersteller {

  public static void main(String[] args) {
    Kunde standardK = new Kunde("Max Meier");
    Kunde fixplatzK = new Kunde("Felix Forster");
    fixplatzK.setAbrechnung(new Fixplatzabrechnung(2, 10));
    Kunde bonusKartenK = new Kunde("Herbert Kickl");
    bonusKartenK.setAbrechnung(new Bonuscardabrechnung(20));

    Rechnung m1 = new Rechnung(standardK, LocalDate.of(2019,9,1));
    m1.setBis(LocalDate.of(2019,9,10));
    m1.add(new Tennisstunde("Mo 2.9. Platz 1", 15));
    m1.add(new Tennisstunde("Di 3.9. Platz 2", 12));
    m1.add(new Tennisstunde("Mi 4.9. Platz 2", 15));
    System.out.println(m1.rechnungstext());

    Rechnung m2 = new Rechnung(fixplatzK, LocalDate.of(2019,9,1));
    m2.setBis(LocalDate.of(2019,9,10));
    m2.add(new Tennisstunde("Mo 2.9. Platz 1", 15));
    m2.add(new Tennisstunde("Di 3.9. Platz 2", 12));
    m2.add(new Tennisstunde("Mi 4.9. Platz 2", 15));
    System.out.println(m2.rechnungstext());

    Rechnung m3 = new Rechnung(bonusKartenK, LocalDate.of(2019, 9, 1));
    m3.setBis(LocalDate.of(2019,9,10));
    m3.add(new Tennisstunde("Mo 2.9 Platz 1", 25));
    m3.add(new Tennisstunde("Di 3.9 Platz 2", 25));
    m3.add(new Tennisstunde("Mi 4.9 Platz 3", 25));
    m3.add(new Tennisstunde("Do 5.9 Platz 3", 25));
    System.out.println(m3.rechnungstext());
  }

}