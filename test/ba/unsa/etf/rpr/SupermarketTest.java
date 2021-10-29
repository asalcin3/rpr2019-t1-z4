package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

  @Test
  void dodajArtikl() {
  Artikl a=new Artikl("Biciklo",1000, "1");
  Korpa k=new Korpa();
  for(int i=0; i<500; i++){
    k.dodajArtikl(a);
  }
 boolean t=k.dodajArtikl(a);
  assertFalse(t);
  }


  @Test
  void izbaciArtiklSaKodom() {
    Korpa k=new Korpa();
    Artikl a=new Artikl("Biciklo", 1000, "4");
    k.dodajArtikl(a);
    assertEquals(a,k.izbaciArtiklSaKodom("4"));

  }
}
