package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {

  @Test
  void kreiranjeArtikla(){
    Artikl artikl=new Artikl("naziv", 10,"kod");
    assertNotNull(artikl);
  }
}
