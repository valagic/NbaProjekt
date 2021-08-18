/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt.nbaprojekt;

/**
 *
 * @author valagic
 */
public class Pocetak {

    public Pocetak() {
        
        pocetniEkran();
        
        
        
    }

    private void pocetniEkran() {
        System.out.println("**********************************");
        System.out.println("Dobrodosli u NBA aplikaciju");
        System.out.println("**********************************");
        System.out.println("Izaberite opciju koja vas zanima");
        System.out.println("**********************************");
        System.out.println("1.");
        System.out.println("2.");
        System.out.println("3.");
        System.out.println("4.");
        System.out.println("5.");
        ucitajPocetnuAkciju();
    }

    private void ucitajPocetnuAkciju() {
        System.out.println("");
        switch(Ulaz.ucitajCijeliBroj("Izaberi broj", "Nisi unio cijeli broj", 1, 5)) {
            case 1 ->
                case 2 ->
                    case 3 ->
                        case 4 ->
                            case 5 -> informacijeOLigi();
        }
                
    }
    
}
