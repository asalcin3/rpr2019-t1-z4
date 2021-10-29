package ba.unsa.etf.rpr;

public class Supermarket {
  private Artikl[] artikli;
  private int brArtikla;
  private int max;

  public Supermarket(){
    artikli=new Artikl[1000];
    brArtikla=0;
    max=1000;
  }

  public boolean dodajArtikl (Artikl biciklo){
    if(brArtikla==max) return false;
    else {
      artikli[brArtikla++] = biciklo;
      return true;
    }
  }
  public Artikl[] getArtikli(){
    return artikli;
  }

  public Artikl izbaciArtiklSaKodom (String kod){
    Artikl n=null;
    for(int i = 0;i < artikli.length ; i++){
      if(artikli[i].getKod().equals(kod)){
        n=artikli[i];
        artikli[i]=null;
        break;
      }
    }
    return n;
  }
}

