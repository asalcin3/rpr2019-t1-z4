package ba.unsa.etf.rpr;

public class Korpa {

  Artikl[] artikli;
  int brArtikla;
  int max;

  public Korpa(){
    max=50;
    brArtikla=0;
    artikli=new Artikl[max];
  }

  public Artikl[] getArtikli() {
    return artikli;
  }
  public boolean dodajArtikl(Artikl a){
    if(brArtikla==max) return false;
    else{
      artikli[brArtikla++]=a;
      return true;
    }
  }

  public Artikl izbaciArtiklSaKodom(String kod){
    Artikl n= null;
    for(int i = 0 ; i < artikli.length ; i++){
      if(artikli[i]!=null && artikli[i].getKod().equals(kod)){
        n=artikli[i];
        artikli[i]=null;
        break;
      }
    }
    return n;
  }

  public int dajUkupnuCijenuArtikala(){
    int cijena = 0;
    if(brArtikla== 0) return 0;
    for(int i =0; i < brArtikla ; i++){
      cijena = cijena + artikli[i].getCijena();
    }
    return cijena;
  }
}
