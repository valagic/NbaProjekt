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
                            
        }        
    }

    private void zanimljivostiOLigi() {
        System.out.println("");
        System.out.println("The National Basketball Association (NBA) is a professional basketball league in North America.");
        System.out.println("The league is composed of 30 teams (29 in the United States and 1 in Canada) and is one of the four major professional"
                + " sports leagues in the United States and Canada.");
        System.out.println("It is the premier men's professional basketball league in the world.");
        System.out.println("The league was founded in New York City on June 6, 1946, ");
        System.out.println("as the Basketball Association of America (BAA).[2] ");
        System.out.println("It changed its name to the National Basketball Association on August 3, 1949, ");
        System.out.println("after merging with the competing National Basketball League (NBL).[3] ");
        System.out.println("The NBA's regular season runs from October to April, with each team playing 82 games. ");
        System.out.println("The league's playoff tournament extends into June. As of 2020, ");
        System.out.println("NBA players are the world's best paid athletes by average annual salary per player.");
        System.out.println("");
        if(Ulaz.daIliNe("Ako zelite saznati vise o programu upisite da u suprotnom ne", "Nisi upisao da ili ne")) {
           System.out.println("");
           pocetniEkran();
        }else {
            System.out.println("");
            System.out.println("Hvala sto se koristili aplikaciju");
            System.exit(0);
        }     
    }

    private void popisEkipa() {
        
    }

    private void popisIgraca() {
        
    }

    private void popisUtakmicaProslaGodina() {
        
    }

    private void informacijeOLigi() {
        System.out.println("Liga je podjeljena na 2 konferencije, istocnu i zapadnu.");
        System.out.println("U istocnoj konferenciji se nalazi 3 divizije.");
        System.out.println("U zapadanoj konferenciji se nalazi 3 divizije.");
        System.out.println("Svaka divizija ima po nekoliko ekipa");
        System.out.println("Ako te zanima u kojoj se diviziji nalazi koja ekipa klikni na ovaj link");
        System.out.println("");
        if(Ulaz.daIliNe("Ako zelite saznati vise o Ligi upisite da, u suprotnom vas vracamo na pocetni ekran", "Niste upisali da ili ne")) {
            System.out.println("");
            pocetniEkran();
        }else {
            System.out.println("");
            System.out.println("Hvala sto se koristili aplikaciju");
            System.exit(0);
        }
    }
    
}
