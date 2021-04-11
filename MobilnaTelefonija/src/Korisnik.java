import java.util.Arrays;

public class Korisnik {
   private Broj broj;
   private Usluga usluge[];
   private int trenutno;
public Korisnik(Broj broj, int brUsluga) {
	super();
	this.broj = broj;
	this.usluge = new Usluga[brUsluga];
}
   
   private void dodajUslugu(Usluga usluga) {
	   if(trenutno == usluge.length) {
		   Usluga u[] = new Usluga[trenutno+10];
		   for(int i=0;i<trenutno;i++) {
			 u[i] = usluge[i];  
		   }
		   usluge =u;
	   }
	   usluge[trenutno++]=usluga;
   }
   public int evidentirajPoziv(Broj broj, int trajanje) {
	   Poziv p = new Poziv(this.broj, broj, trajanje);
	   dodajUslugu(p);
	   return p.cena();
   }
   public int evidentirajPoruku(Broj broj, String tekst) {
	   Poruka p = new Poruka(this.broj, broj, tekst);
	   dodajUslugu(p);
	   return p.cena();
   }
   public int ukupnaCena() {
	   int cena = 0;
	   for(int i=0;i<trenutno;i++) {
		   cena+=usluge[i].cena();
		   
	   }
	return cena;
   }

@Override
public String toString() {
	StringBuilder sb = new StringBuilder();
	sb.append(broj);
	sb.append("\n");
	for(int i=0;i<trenutno;i++) {
		sb.append(usluge[i]);
		sb.append("\n");
	}
	return sb.toString();
}
   
}
