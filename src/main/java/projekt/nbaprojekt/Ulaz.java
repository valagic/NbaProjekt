/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt.nbaprojekt;

import java.util.Scanner;

/**
 *
 * @author valagic
 */
public class Ulaz {
    
    public static Scanner scanner;
    
    
    public static int ucitajCijeliBroj (String poruka, String greska, int min, int max) {
		int broj = 0;
		while(true) {
			System.out.println(poruka);
			try {

				broj = Integer.parseInt(
					Scanner.nextLine());
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
}
