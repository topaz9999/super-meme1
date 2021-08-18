package konverzijaFajlova1709;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class MPlayerSUB extends PisiCitaj{
	

		/**
		 * 
		 */
		protected MPlayerSUB() {
			super();
			// TODO Auto-generated constructor stub
		}

		public ArrayList<String> ulazSubRipSRT(ArrayList<String> lista) {
			String titl = "";
			ArrayList<String> izlaznaLista = new ArrayList<String>();
			double sekundePocetak = 0;
			double sekundeKraj = 0;
			DecimalFormat f = new DecimalFormat("#0.00");
			String[] vrednosti = new String[2];

			for (int i = 1; i < lista.size(); i++) {
				if (lista.get(i).contains(" --> ")) {
					vrednosti = lista.get(i).split(" --> ");
					for (int j = 0; j < vrednosti.length; j++) {
						if (j == 0) {
							sekundePocetak = Double.parseDouble(vrednosti[j].substring(0, 2)) * 60 * 60;
							sekundePocetak += Double.parseDouble(vrednosti[j].substring(3, 5)) * 60;
							sekundePocetak += Double
									.parseDouble(vrednosti[j].substring(6, 8) + "." + vrednosti[j].substring(9));

							titl += f.format((sekundePocetak - sekundeKraj));
						} else if (j == 1) {

							sekundeKraj = Double.parseDouble(vrednosti[j].substring(0, 2)) * 60 * 60;
							sekundeKraj += Double.parseDouble(vrednosti[j].substring(3, 5)) * 60;
							sekundeKraj += Double
									.parseDouble(vrednosti[j].substring(6, 8) + "." + vrednosti[j].substring(9));

							titl += " " + f.format((sekundeKraj - sekundePocetak));
						}

					}
					izlaznaLista.add(titl);
				} else if (lista.get(i).isEmpty()) {
					titl = "";
					izlaznaLista.add(titl);
					i++;
				} else {
					if (lista.get(i).contains("<i>") && !lista.get(i).contains("</i>")) {
						titl = lista.get(i).substring(3);
					} else if (!lista.get(i).contains("<i>") && lista.get(i).contains("</i>")) {
						titl = lista.get(i).substring(0, lista.get(i).length() - 4);
					} else if (lista.get(i).contains("<i>") && lista.get(i).contains("</i>")) {
						titl = lista.get(i).substring(3, lista.get(i).length() - 4);
					} else {
						titl = lista.get(i);
					}
					izlaznaLista.add(titl);
				}

			}

			return izlaznaLista;
		}

		public ArrayList<String> ulazMicroDVDtxt(ArrayList<String> lista) {

			String titl[] = new String[2];
			ArrayList<String> izlaznaLista = new ArrayList<String>();
			double sekundePocetak = 0;
			double sekundeKraj = 0;
			int frejmPocetak = 0;
			int frejmKraj = 0;
			DecimalFormat f = new DecimalFormat("#0.00");
			String[] vrednosti = new String[3];
			String str = "";

			for (int i = 0; i < lista.size(); i++) {

				if (lista.get(i).contains("{Y:i}")) {
					int lastIndex = lista.get(i).lastIndexOf("}");
					str = lista.get(i).substring(0, lastIndex - 4) + lista.get(i).substring(lastIndex + 1);
				}else {
					str = lista.get(i);
				}

				vrednosti = str.split("}");

				frejmPocetak = Integer.parseInt(vrednosti[0].substring(1));
				sekundePocetak = (double) (frejmPocetak - frejmKraj) / 25;

				frejmKraj = Integer.parseInt(vrednosti[1].substring(1));
				sekundeKraj = (double) (frejmKraj - frejmPocetak) / 25;

				izlaznaLista.add(sekundePocetak + " " + sekundeKraj);

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

	}


