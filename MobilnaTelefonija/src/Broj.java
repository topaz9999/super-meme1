
public class Broj {
     private String kod,pozivni, broj;
     private boolean fiksni;
	public Broj(String kod, String pozivni, String broj, boolean fiksni) {
		super();
		this.kod = kod;
		this.pozivni = pozivni;
		this.broj = broj;
		this.fiksni = fiksni;
	}
     
     public boolean istaDrzavaBroj(Broj broj) {
    	 return kod.equals(broj.kod);
     }
     public boolean fiksni() {
    	 return fiksni;
     }
     public String toString() {
    	 return "+" + kod + "" + pozivni+""+broj;
     }
}
