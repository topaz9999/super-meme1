package konverzijaFajlova1709;

import java.util.ArrayList;
import java.util.Arrays;

public class MicroDVD extends PisiCitaj{
	

		/**
		 * 
		 */
		protected MicroDVD() {
			super();
			// TODO Auto-generated constructor stub
		}

		public ArrayList<String> ulazMPlayerSUB(ArrayList<String> lista) {
			String titl = "";
			ArrayList<String> izlaznaLista = new ArrayList<String>();
			double sekunde = 0;
			int frejmovi = 0;
			String[] vrednosti = new String[2];

			for (int i = 0; i < lista.size(); i++) {
				if (!lista.get(i).isEmpty() && Character.isDigit(lista.get(i).charAt(0))) {
					vrednosti = lista.get(i).split(" ");
					for (int j = 0; j < vrednosti.length; j++) {
						sekunde = Double.parseDouble(vrednosti[j]);
						frejmovi += Math.round(sekunde * 25);
						titl += "{" + frejmovi + "}";
					}
				} else if (lista.get(i).isEmpty()) {
					izlaznaLista.add(titl);
					titl = "";
				} else {
					titl += lista.get(i);
				}

			}

			izlaznaLista.add(titl);
			return izlaznaLista;
		}

		public ArrayList<String> ulazSubRipSRT(ArrayList<String> lista) {
			String titl = "";
			ArrayList<String> izlaznaLista = new ArrayList<String>();
			double sekunde = 0;
			int frejmovi = 0;
			String[] vrednosti = new String[2];

			for (int i = 1; i < lista.size(); i++) {
				if (lista.get(i).contains(" --> ")) {
					vrednosti = lista.get(i).split(" --> ");
					for (int j = 0; j < vrednosti.length; j++) {

						sekunde = Double.parseDouble(vrednosti[j].substring(0, 2)) * 60 * 60;
						sekunde += Double.parseDouble(vrednosti[j].substring(3, 5)) * 60;
						sekunde += Double.parseDouble(vrednosti[j].substring(6, 8) + "." + vrednosti[j].substring(9));
						frejmovi = (int) Math.round(sekunde * 25);
						titl += "{" + frejmovi + "}";
					}
				} else if (lista.get(i).isEmpty()) {
					izlaznaLista.add(titl);
					titl = "";
					i++;
				} else {
					if (lista.get(i).contains("<i>") && !lista.get(i).contains("</i>")) {
						titl +="{Y:i}";
						titl += lista.get(i).substring(3);
					} else if (!lista.get(i).contains("<i>") && lista.get(i).contains("</i>")) {
						titl += lista.get(i).substring(0, lista.get(i).length() - 4);
					} else if (lista.get(i).contains("<i>") && lista.get(i).contains("</i>")) {
						titl +="{Y:i}";
						titl += lista.get(i).substring(3, lista.get(i).length() - 4);
					} else {
						titl += lista.get(i);
					}

				}

			}
			izlaznaLista.add(titl);

			return izlaznaLista;
		}

	}


