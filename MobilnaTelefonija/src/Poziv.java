
public class Poziv extends Usluga {
	private int trajanje;
	
	public Poziv(Broj sa, Broj na, int trajanje) {
		super(sa, na);
		this.trajanje=trajanje;
	}

	@Override
	public int cena() {
		int minuta = (trajanje+59/60);
		if(minuta == 0) return 0;
		if(sa.istaDrzavaBroj(na))
			return minuta*10;
		else
		return 30+minuta*50;
	}

	@Override
	public String toString() {
		return super.toString() + " ("
				+ (trajanje/60)+":"+(trajanje%60)+")";
	}
    
}
