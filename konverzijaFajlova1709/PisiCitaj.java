package konverzijaFajlova1709;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class PisiCitaj {
	
		/**
		 * 
		 */
		protected PisiCitaj() {
		
		}
		
		public ArrayList<String> procitajFajl(String nazivFajla) {
			
			ArrayList<String> titlovi = new ArrayList<String>();
			
			BufferedReader br = null;
			try {
				br = new BufferedReader(new FileReader(nazivFajla));
				String linija = "";

				while ((linija = br.readLine()) != null) {
					
					titlovi.add(linija);
					
				}
				br.close();	
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				if (br!= null)
					try {
						br.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
			}
			return titlovi;
		}
		
		public void ispisiFajl(String nazivFajla, ArrayList<String> sadrzajFajla) {
			FileWriter fw = null;
			try {
				fw = new FileWriter(nazivFajla, true);
				for (String titl : sadrzajFajla) {
					fw.write(titl+"\n");
				}			
				fw.flush();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				if (fw!=null) {
					try {
						fw.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		
	}


