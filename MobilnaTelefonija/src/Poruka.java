
public class Poruka extends Usluga {
	private String tekst;
	
	public Poruka(Broj sa, Broj na,String tekst) {
		super(sa,na);
		this.tekst = tekst;
	}
    public boolean poslata() {
    	return !sa.fiksni() && !na.fiksni();
    }
	@Override
	public int cena() {
		if(!poslata()) return 0;
		if(sa.istaDrzavaBroj(na)) return 3;
		else
		return 20;
	}
	@Override
	public String toString() {
		return super.toString() + " "+tekst;
	}
	
}
