/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forma;

import domen.Radnik;
import forma.model.TableModelUlogovani;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import niti.PokretanjeServera;
import podesavanja.PodesavanjaBaze;
import podesavanja.PodesavanjaKonekcije;

/**
 *
 * @author Roki
 */
public class FormaServer extends javax.swing.JFrame {

    private TableModelUlogovani tmu;
    PokretanjeServera server;

    /**
     * Creates new form FormaServer
     */
    public FormaServer() {
        initComponents();
        setLocationRelativeTo(null);
        tmu = new TableModelUlogovani();
        jTable1.setModel(tmu);
        popuniFormu();
        panelRadnici.setEnabled(false);
        kontroler.Kontroler.getInstance().setForma(this);
        postaviStatus("Server program nije pokrenut.", false);
    }

    public void postaviStatus(String poruka, boolean signal) {
        lblStatus.setText(poruka);
        if (signal == true) {
            btnPokreniServer.setEnabled(false);
            btnZaustaviServer.setEnabled(true);
        } else {
            btnZaustaviServer.setEnabled(false);
            btnPokreniServer.setEnabled(true);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelStatus = new javax.swing.JPanel();
        lblStatus = new javax.swing.JLabel();
        btnPokreniServer = new javax.swing.JButton();
        btnZaustaviServer = new javax.swing.JButton();
        panelRadnici = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panelBaza = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUrl = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        btnPodesiBaza = new javax.swing.JButton();
        panelKonekcija = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtAdresa = new javax.swing.JTextField();
        txtPort = new javax.swing.JTextField();
        btnPodesiKon = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("[TERETANA] Server");

        panelStatus.setBorder(javax.swing.BorderFactory.createTitledBorder("Status server programa"));

        btnPokreniServer.setText("Pokreni server");
        btnPokreniServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPokreniServerActionPerformed(evt);
            }
        });

        btnZaustaviServer.setText("Zaustavi server");
        btnZaustaviServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZaustaviServerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelStatusLayout = new javax.swing.GroupLayout(panelStatus);
        panelStatus.setLayout(panelStatusLayout);
        panelStatusLayout.setHorizontalGroup(
            panelStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelStatusLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelStatusLayout.createSequentialGroup()
                        .addComponent(btnPokreniServer, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnZaustaviServer, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );
        panelStatusLayout.setVerticalGroup(
            panelStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStatusLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(panelStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPokreniServer)
                    .addComponent(btnZaustaviServer))
                .addGap(52, 52, 52))
        );

        panelRadnici.setBorder(javax.swing.BorderFactory.createTitledBorder("Ulogovani radnici"));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout panelRadniciLayout = new javax.swing.GroupLayout(panelRadnici);
        panelRadnici.setLayout(panelRadniciLayout);
        panelRadniciLayout.setHorizontalGroup(
            panelRadniciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRadniciLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        panelRadniciLayout.setVerticalGroup(
            panelRadniciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRadniciLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelBaza.setBorder(javax.swing.BorderFactory.createTitledBorder("Konfiguracija baze"));

        jLabel1.setText("Url:");

        jLabel2.setText("Username:");

        jLabel3.setText("Password:");

        btnPodesiBaza.setText("Podesi");
        btnPodesiBaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPodesiBazaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBazaLayout = new javax.swing.GroupLayout(panelBaza);
        panelBaza.setLayout(panelBazaLayout);
        panelBazaLayout.setHorizontalGroup(
            panelBazaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBazaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panelBazaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPodesiBaza, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBazaLayout.createSequentialGroup()
                        .addGroup(panelBazaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBazaLayout.createSequentialGroup()
                                .addGroup(panelBazaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18))
                            .addGroup(panelBazaLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(19, 19, 19)))
                        .addGroup(panelBazaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(txtUrl)
                            .addComponent(txtUsername))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBazaLayout.setVerticalGroup(
            panelBazaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBazaLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(panelBazaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUrl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBazaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBazaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btnPodesiBaza)
                .addGap(23, 23, 23))
        );

        panelKonekcija.setBorder(javax.swing.BorderFactory.createTitledBorder("Konfiguracija konekcije"));

        jLabel4.setText("IP adresa:");

        jLabel5.setText("Port:");

        btnPodesiKon.setText("Podesi");
        btnPodesiKon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPodesiKonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelKonekcijaLayout = new javax.swing.GroupLayout(panelKonekcija);
        panelKonekcija.setLayout(panelKonekcijaLayout);
        panelKonekcijaLayout.setHorizontalGroup(
            panelKonekcijaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKonekcijaLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelKonekcijaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPodesiKon, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelKonekcijaLayout.createSequentialGroup()
                        .addGroup(panelKonekcijaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(panelKonekcijaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAdresa)
                            .addComponent(txtPort, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        panelKonekcijaLayout.setVerticalGroup(
            panelKonekcijaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKonekcijaLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(panelKonekcijaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAdresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(panelKonekcijaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnPodesiKon)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRadnici, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelBaza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelKonekcija, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelBaza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRadnici, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelKonekcija, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnZaustaviServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZaustaviServerActionPerformed
        try {
            // TODO add your handling code here:
            server.zaustaviServer("KRAJ");
        } catch (IOException ex) {
            Logger.getLogger(FormaServer.class.getName()).log(Level.SEVERE, null, ex);
        }
        btnPokreniServer.setEnabled(true);
        btnZaustaviServer.setEnabled(false);
        panelRadnici.setEnabled(false);
        tmu.obrisiElemente();
    }//GEN-LAST:event_btnZaustaviServerActionPerformed

    private void btnPokreniServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPokreniServerActionPerformed
        // TODO add your handling code here:
        panelRadnici.setEnabled(true);
        srediPolja();
        server = new PokretanjeServera();
        server.start();


    }//GEN-LAST:event_btnPokreniServerActionPerformed

    private void btnPodesiBazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPodesiBazaActionPerformed
        // TODO add your handling code here
        String url = txtUrl.getText();
        String user = txtUsername.getText();
        String password = txtPassword.getText();
        PodesavanjaBaze.getInstance().setProperty("url", url);
        PodesavanjaBaze.getInstance().setProperty("user", user);
        PodesavanjaBaze.getInstance().setProperty("password", password);
        try {
            PodesavanjaBaze.getInstance().ucitaj();
            JOptionPane.showMessageDialog(this, "Uspešna podešavanja baze.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Greška! Neuspešna podešavanja baze.");
        }

    }//GEN-LAST:event_btnPodesiBazaActionPerformed

    private void btnPodesiKonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPodesiKonActionPerformed
        // TODO add your handling code here:
        String adresa = txtAdresa.getText();
        String port = txtPort.getText();
        PodesavanjaKonekcije.getInstance().setProperty("adresa", adresa);
        PodesavanjaKonekcije.getInstance().setProperty("port", port);
        try {
            PodesavanjaKonekcije.getInstance().ucitaj();
            JOptionPane.showMessageDialog(this, "Uspešna podešavanja konekcije.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Greška! Neuspešna podešavanja konekcije.");
        }

    }//GEN-LAST:event_btnPodesiKonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormaServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormaServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormaServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormaServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormaServer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPodesiBaza;
    private javax.swing.JButton btnPodesiKon;
    private javax.swing.JButton btnPokreniServer;
    private javax.swing.JButton btnZaustaviServer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JPanel panelBaza;
    private javax.swing.JPanel panelKonekcija;
    private javax.swing.JPanel panelRadnici;
    private javax.swing.JPanel panelStatus;
    private javax.swing.JTextField txtAdresa;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPort;
    private javax.swing.JTextField txtUrl;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    public void dodajPrijavljenogRadnik(Radnik radnik) {
        tmu.dodajElement(radnik);
    }

    private void popuniFormu() {
        txtUrl.setText(PodesavanjaBaze.getInstance().getProperty("url"));
        txtUsername.setText(PodesavanjaBaze.getInstance().getProperty("user"));
        txtPassword.setText(PodesavanjaBaze.getInstance().getProperty("password"));
        txtAdresa.setText(PodesavanjaKonekcije.getInstance().getProperty("adresa"));
        txtPort.setText(PodesavanjaKonekcije.getInstance().getProperty("port"));
    }

    private void srediPolja() {
        btnPodesiBaza.setEnabled(false);
        btnPodesiKon.setEnabled(false);
        txtUrl.setEnabled(false);
        txtUsername.setEnabled(false);
        txtPassword.setEnabled(false);
        txtPort.setEnabled(false);
        txtAdresa.setEnabled(false);
    }

    public TableModelUlogovani getTmu() {
        return tmu;
    }

    public void setTmu(TableModelUlogovani tmu) {
        this.tmu = tmu;
    }

    public javax.swing.JTable getjTable1() {
        return jTable1;
    }

    public void setjTable1(javax.swing.JTable jTable1) {
        this.jTable1 = jTable1;
    }
}
