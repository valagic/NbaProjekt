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
        System.out.println("1. Zanimljivosti o ligi");
        System.out.println("2. Popis svih ekipa u ligi");
        System.out.println("3. Popis svih igraca u ligi");
        System.out.println("4. Pregled svih utakmica sezona 2020/2021");
        System.out.println("5. Informacije o ligi");
        ucitajPocetnuAkciju();
    }

    private void ucitajPocetnuAkciju() {
        System.out.println("");
        switch(Ulaz.ucitajCijeliBroj("Izaberi broj", "Nisi unio cijeli broj", 1, 5)) {
            case 1: zanimljivostiOLigi();
            break;
                case 2: popisEkipa();
                break;
                    case 3: popisIgraca();
                    break;
                        case 4: popisUtakmicaProslaGodina();
                        break;
                            case 5: informacijeOLigi();
                            break;
        }        
    }

    private void zanimljivostiOLigi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void popisEkipa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void popisIgraca() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void popisUtakmicaProslaGodina() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void informacijeOLigi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
