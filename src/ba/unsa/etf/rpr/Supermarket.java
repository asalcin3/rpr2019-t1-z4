package ba.unsa.etf.rpr;

public class Supermarket {
  private Artikl[] artikli;
  private int brArtikala;
  private int maximalan;

  public Supermarket(){
    brArtikala=0;
    maximalan=1000;
    artikli=new Artikl[maximalan];
  }

  public boolean dodajArtikl(Artikl biciklo){
    if(brArtikala==maximalan) return false;
    else{
      artikli[brArtikala++]=biciklo;
      return true;
    }
  }
  public Artikl[] getArtikli(){
    return artikli;
  }
  public Artikl izbaciArtiklSaKodom(String kod){
    Artikl n=null;
    for(int i=0; i<artikli.length; i++){
      if(artikli[i].getKod().equals(kod)){
        n=artikli[i];
        artikli[i]=null;
        break;
      }
    }
    return n;
  }
}

