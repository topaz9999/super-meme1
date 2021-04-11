
public abstract class Usluga {
     protected Broj sa, na;

	public Usluga(Broj sa, Broj na) {
		super();
		this.sa = sa;
		this.na = na;
	}
     
     public abstract int cena();
     public String toString() {
    	 return sa+" - > "+na;
     }
     
}
