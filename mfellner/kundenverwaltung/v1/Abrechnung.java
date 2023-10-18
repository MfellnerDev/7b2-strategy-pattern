package mfellner.kundenverwaltung.v1;

import java.util.List;

/**
 * Interface Abrechnung
 * @author Manuel Fellner
 * @version 18.10.2023
 */
public interface Abrechnung {
    double berechnePreis(List<Tennisstunde> tennisliste);
}