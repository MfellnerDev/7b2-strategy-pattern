package mfellner.kundenverwaltung.v1;

import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;

public interface FormatKonstanten {
  DecimalFormat PREIS_FORMAT = new DecimalFormat("#.00");
  String WAEHRUNG = "€";
  DateTimeFormatter DATUM_FORMAT = DateTimeFormatter.ISO_LOCAL_DATE;
  

}
