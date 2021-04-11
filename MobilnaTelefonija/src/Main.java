
public class Main {

	public static void main(String[] args) {
		Broj b1= new Broj("381","64","000000",false);
		Broj b2= new Broj("381","11","000000",true);
		Broj b3= new Broj("454","59","000000",false);
		
		Poziv poziv = new Poziv(b1, b3, 253);
		Poruka poruka = new Poruka(b1, b3, "Dobar dan");
		
		System.out.println(poziv);
		System.out.println(poruka);
		
		System.out.println();
		
		Korisnik k = new Korisnik(b1, 2);
		k.evidentirajPoruku(b3, "Zdravo");
		k.evidentirajPoruku(b3, "Cao");
		k.evidentirajPoziv(b2,74);
		
		System.out.println(k);
		System.out.println("Ukupna cena:" + k.ukupnaCena());

	}

}
