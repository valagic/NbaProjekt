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
public class Prozor extends javax.swing.JFrame {

    /**
     * Creates new form Prozor
     */
    public Prozor() {
        initComponents();

        osnovnoPostavke();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNaziv = new javax.swing.JLabel();
        txtInfo = new javax.swing.JLabel();
        txtInfo2 = new javax.swing.JLabel();
        btnLigaInformacije = new javax.swing.JButton();
        btnEkipa = new javax.swing.JButton();
        btnIgrac = new javax.swing.JButton();
        btnUtakmica = new javax.swing.JButton();
        btnIzlaz = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(400, 400));

        txtNaziv.setText("NBA");

        txtInfo.setText("Dobrodošli u Nba aplikaciju, ukoliko želite saznati vise odaberite");

        txtInfo2.setText("neku od opcija.");

        btnLigaInformacije.setText("Informacije o ligi");
        btnLigaInformacije.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigaInformacijeActionPerformed(evt);
            }
        });

        btnEkipa.setText("Popis ekipa u ligi");
        btnEkipa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEkipaActionPerformed(evt);
            }
        });

        btnIgrac.setText("Popis igraca u ekipi");
        btnIgrac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgracActionPerformed(evt);
            }
        });

        btnUtakmica.setText("Izlistanje svih utakmica prosle sezone");
        btnUtakmica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUtakmicaActionPerformed(evt);
            }
        });

        btnIzlaz.setText("Izlaz iz aplikacije");
        btnIzlaz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzlazActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtInfo2)
                            .addComponent(txtInfo)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnLigaInformacije, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEkipa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnIgrac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUtakmica, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                            .addComponent(btnIzlaz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(txtNaziv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtInfo2)
                .addGap(18, 18, 18)
                .addComponent(btnLigaInformacije)
                .addGap(18, 18, 18)
                .addComponent(btnEkipa)
                .addGap(18, 18, 18)
                .addComponent(btnIgrac)
                .addGap(18, 18, 18)
                .addComponent(btnUtakmica)
                .addGap(18, 18, 18)
                .addComponent(btnIzlaz)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLigaInformacijeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigaInformacijeActionPerformed
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
       /* if(Ulaz.daIliNe("Ako zelite saznati vise o programu upisite da u suprotnom ne", "Nisi upisao da ili ne")) {
           System.out.println("");
           pocetniEkran();
        }else {
            System.out.println("");
            System.out.println("Hvala sto se koristili aplikaciju");
            System.exit(0);
        }    */ 
    }//GEN-LAST:event_btnLigaInformacijeActionPerformed

    private void btnEkipaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEkipaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEkipaActionPerformed

    private void btnIgracActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgracActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIgracActionPerformed

    private void btnUtakmicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUtakmicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUtakmicaActionPerformed

    private void btnIzlazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzlazActionPerformed
        dispose(); // umjesto system.exit(0); ovo je izlaz iz aplikacije
    }//GEN-LAST:event_btnIzlazActionPerformed

    private void osnovnoPostavke() {
        setTitle("Nba aplikacija");
    }

  
   
      

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEkipa;
    private javax.swing.JButton btnIgrac;
    private javax.swing.JButton btnIzlaz;
    private javax.swing.JButton btnLigaInformacije;
    private javax.swing.JButton btnUtakmica;
    private javax.swing.JLabel txtInfo;
    private javax.swing.JLabel txtInfo2;
    private javax.swing.JLabel txtNaziv;
    // End of variables declaration//GEN-END:variables
}
