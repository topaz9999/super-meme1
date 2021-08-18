package konverzijaFajlova1709;
import java.text.DecimalFormat;
import java.util.ArrayList;


public class SubRipSRT extends PisiCitaj {
	

		/**
		 * 
		 */
		protected SubRipSRT() {
			super();
			// TODO Auto-generated constructor stub
		}

		public ArrayList<String> ulazMicroDVDtxt(ArrayList<String> lista) {
			String titl[] = new String[2];
			ArrayList<String> izlaznaLista = new ArrayList<String>();
			double sekunde = 0;
			int frejmovi = 0;
			String sati = "";
			String minuti = "";
			String sec = "";
			String pocetakIKraj = "";
			DecimalFormat f = new DecimalFormat("00.000");
			String[] vrednosti = new String[3];
			String str = "";

			for (int i = 0; i < lista.size(); i++) {

				izlaznaLista.add(String.valueOf((i + 1)));

				if (lista.get(i).contains("{Y:i}")) {
					int lastIndex = lista.get(i).lastIndexOf("}");
					str = lista.get(i).substring(0, lastIndex - 4) + "<i>" + lista.get(i).substring(lastIndex + 1) + "</i>";
				} else {
					str = lista.get(i);
				}

				vrednosti = str.split("}");

				for (int j = 0; j < 2; j++) {
					frejmovi = Integer.parseInt(vrednosti[j].substring(1));
					sekunde = (double) (frejmovi) / 25;
					sati = String.format("%02d", (int) sekunde / 3600);
					minuti = String.format("%02d", (int) (sekunde / 60) % 60);

					sec = String.valueOf(f.format(sekunde % 60));

					pocetakIKraj += sati + ":" + minuti + ":" + sec;

					if (j == 0) {
						pocetakIKraj += " --> ";

					}
				}

				izlaznaLista.add(pocetakIKraj);
				pocetakIKraj = "";

				if (vrednosti[2].contains("|")) {
					titl = vrednosti[2].split("\\|");
					izlaznaLista.add(titl[0]);
					izlaznaLista.add(titl[1]);
				} else {
					izlaznaLista.add(vrednosti[2]);
				}

				izlaznaLista.add("");

			}
			return izlaznaLista;

		}

		public ArrayList<String> ulazMPlayerSUB(ArrayList<String> lista) {
			String sati = "";
			String minuti = "";
			String sec = "";
			DecimalFormat f = new DecimalFormat("00.000");
			String titl = "";
			ArrayList<String> izlaznaLista = new ArrayList<String>();
			double sekunde = 0;
			int brojac = 1;
			izlaznaLista.add(String.valueOf(brojac));
			String[] vrednosti = new String[2];

			for (int i = 0; i < lista.size(); i++) {
				if (!lista.get(i).isEmpty() && Character.isDigit(lista.get(i).charAt(0))) {
					vrednosti = lista.get(i).split(" ");
					for (int j = 0; j < vrednosti.length; j++) {

						sekunde += Double.parseDouble(vrednosti[j]);
						sati = String.format("%02d", (int) sekunde / 3600);
						minuti = String.format("%02d", (int) (sekunde / 60) % 60);
						sec = String.valueOf(f.format(sekunde % 60));

						titl += sati + ":" + minuti + ":" + sec;

						if (j == 0) {
							titl += " --> ";

						}
					}
					izlaznaLista.add(titl);
					titl = "";
				} else if (lista.get(i).isEmpty()) {
					izlaznaLista.add("");
					brojac++;
					izlaznaLista.add(String.valueOf(brojac));
				}else {
					izlaznaLista.add(lista.get(i));
				}

			}

			return izlaznaLista;
		}

	}


