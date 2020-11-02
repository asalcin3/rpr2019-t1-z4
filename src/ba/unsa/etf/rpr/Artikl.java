package ba.unsa.etf.rpr;

public class Artikl {
  private int cijena;
  private String naziv,kod;
  public Artikl(String naziv, int cijena, String kod){
    setKod(kod);
    setCijena(cijena);
    setNaziv(naziv);
  }

  public void setKod(String kod) {
    this.kod = kod;
  }

  public void setCijena(int cijena) {
    this.cijena = cijena;
  }

  public void setNaziv(String naziv) {
    this.naziv = naziv;
  }

  public int getCijena() {
    return cijena;
  }

  public String getKod() {
    return kod;
  }

  public String getNaziv() {
    return naziv;
  }

}
