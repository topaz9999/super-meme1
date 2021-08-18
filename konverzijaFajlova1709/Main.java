package konverzijaFajlova1709;

import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		
//				int slucaj = Integer.parseInt(args[0]);
				ArrayList<String> rezultat = new ArrayList<String>();

				PisiCitaj pisiCitaj = new PisiCitaj();
				ArrayList<String> procitanFajl = pisiCitaj.procitajFajl("src\\konverzijaFajlova1709\\fajlovi\\Primer.sub");
				int slucaj = 1;

				switch (slucaj) {
				case 0:
					MicroDVD micro0 = new MicroDVD();
					rezultat = micro0.ulazMPlayerSUB(procitanFajl);
					micro0.ispisiFajl(args[2], rezultat);

					break;
				case 1:
					SubRipSRT SubRip1 = new SubRipSRT();
					rezultat = SubRip1.ulazMPlayerSUB(procitanFajl);
					SubRip1.ispisiFajl("src\\konverzijaFajlova1709\\fajlovi\\MplayerToSubRip.srt", rezultat);
//					for (String string : rezultat) {
//						System.out.println(string);
//					}
					break;
				case 2:
					MicroDVD micro2 = new MicroDVD();
					rezultat = micro2.ulazSubRipSRT(procitanFajl);
					micro2.ispisiFajl(args[2], rezultat);
//					for (String string : rezultat) {
//						System.out.println(string);
//					}

					break;
				case 3:
					MPlayerSUB mPlayer3 = new MPlayerSUB();
					rezultat = mPlayer3.ulazSubRipSRT(procitanFajl);
					mPlayer3.ispisiFajl(args[2], rezultat);
//					for (String string : rezultat) {
//						System.out.println(string);
//					}
					break;
				case 4:
					SubRipSRT SubRip4 = new SubRipSRT();
					rezultat = SubRip4.ulazMicroDVDtxt(procitanFajl);
//					SubRip4.ispisiFajl(args[2], rezultat);
//					for (String string : rezultat) {
//						System.out.println(string);
//					}
					break;
				case 5:
					MPlayerSUB mPlayer5 = new MPlayerSUB();
					rezultat = mPlayer5.ulazMicroDVDtxt(procitanFajl);
//					mPlayer5.ispisiFajl(args[2], rezultat);
//					for (String string : rezultat) {
//						System.out.println(string);
//					}
					break;

				default:
					break;
				}

			}

		


	}


