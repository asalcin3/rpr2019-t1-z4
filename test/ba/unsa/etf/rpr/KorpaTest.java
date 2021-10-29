package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;
import  static  org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {


  @Test
  void dodajArtikl() {
    Artikl artikl=new Artikl("Biciklo", 1000, "1");
    Korpa korpa=new Korpa();
    for(int i=0; i<500; i++){
       korpa.dodajArtikl(artikl);
    }
    boolean test=korpa.dodajArtikl(artikl);
    assertFalse(test);
  }

  @Test
  void izbaciArtiklSaKodom() {
    Korpa k=new Korpa();
    Artikl a=new Artikl("Biciklo", 1000, "4");
     k.dodajArtikl(a);
     assertEquals(a, k.izbaciArtiklSaKodom("4"));

  }

  @Test
  void dajUkupnuCijenuArtikala() {
    Korpa k=new Korpa();
    Artikl a=new Artikl("Biciklo", 1000, "5");
    Artikl x=new Artikl("Biciklo", 1000, "4");
    k.dodajArtikl(a);
    k.dodajArtikl(x);
    assertEquals(2000,k.dajUkupnuCijenuArtikala());

  }
}
