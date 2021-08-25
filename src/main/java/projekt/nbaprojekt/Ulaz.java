/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt.nbaprojekt;
import javax.swing.JOptionPane;


public class Ulaz {

   public static int ucitajCijeliBroj (String poruka, String greska, int min, int max) {
		int broj = 0;
		while(true) {
			System.out.println(poruka);
			try {

				broj = Integer.parseInt(JOptionPane.showInputDialog("unesi broj"));
						
				if (broj<min || broj>max) {
					System.out.println("Broj ne smije biti manji od " + min
							+ " ili ve�i od " + max);
					continue;
			}
				break;
			}catch (Exception e) {
				System.out.println(greska);
			}
		}
		return broj;
	}
   
   public static  boolean daIliNe (String poruka, String greska) {
		String upit = "";
		while(true) {
			System.out.println(poruka);
			upit = JOptionPane.showInputDialog("ako zelis saznati vise upisi da, u suprotnom ne");
			if(upit.trim().toLowerCase().equals("da")) {
				return true;
			}
			if(upit.trim().toLowerCase().equals("ne")) {
				return false;
			}
			System.out.println(greska + "Molimo unesite da ili ne");
		}
	}
}
