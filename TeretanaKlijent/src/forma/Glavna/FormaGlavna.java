/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forma.Glavna;

import forma.Korisnik.PretragaKorisnika;
import forma.Korisnik.UnosKorisnika;
import forma.OdabraniTrening.PretragaOdabranogTreninga;
import forma.OdabraniTrening.UnosOdabranogTreninga;
import forma.Trening.PretragaTreninga;
import forma.Trening.UnosTreninga;
import java.awt.Dialog;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Roki
 */
public class FormaGlavna extends javax.swing.JFrame {

    /**
     * Creates new form FormaGlavna
     */
    public FormaGlavna() {
        initComponents();
        setLocationRelativeTo(null);
        txtUlogovani.setText(sesija.Sesija.getInstance().getRadnik() + "");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtUlogovani = new javax.swing.JTextField();
        btnOdjava = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        unosKorisnik = new javax.swing.JMenuItem();
        PretragaKorisnia = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        unosTrening = new javax.swing.JMenuItem();
        pretragaTrening = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        unosOT = new javax.swing.JMenuItem();
        pretragaOT = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("[TERETANA] Glavna froma");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                window(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                FormaGlavna.this.windowClosing(evt);
            }
        });

        jLabel1.setText("Ulogovani radnik:");

        txtUlogovani.setEditable(false);

        btnOdjava.setText("Odjava");
        btnOdjava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOdjavaActionPerformed(evt);
            }
        });

        jMenu1.setText("Korisnici");

        unosKorisnik.setText("Unesi novi");
        unosKorisnik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unosKorisnikActionPerformed(evt);
            }
        });
        jMenu1.add(unosKorisnik);

        PretragaKorisnia.setText("Pretraži");
        PretragaKorisnia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PretragaKorisniaActionPerformed(evt);
            }
        });
        jMenu1.add(PretragaKorisnia);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Treninzi");

        unosTrening.setText("Unesi novi");
        unosTrening.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unosTreningActionPerformed(evt);
            }
        });
        jMenu2.add(unosTrening);

        pretragaTrening.setText("Pretraži");
        pretragaTrening.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pretragaTreningActionPerformed(evt);
            }
        });
        jMenu2.add(pretragaTrening);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Članstva");

        unosOT.setText("Unesi novi");
        unosOT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unosOTActionPerformed(evt);
            }
        });
        jMenu3.add(unosOT);

        pretragaOT.setText("Pretraži");
        pretragaOT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pretragaOTActionPerformed(evt);
            }
        });
        jMenu3.add(pretragaOT);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(276, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnOdjava, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtUlogovani, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUlogovani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnOdjava)
                .addContainerGap(212, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PretragaKorisniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PretragaKorisniaActionPerformed
        PretragaKorisnika pk = new PretragaKorisnika();
        pk.setVisible(true);
    }//GEN-LAST:event_PretragaKorisniaActionPerformed

    private void unosKorisnikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unosKorisnikActionPerformed
        JDialog dijalog = new JDialog(this, "[TERETANA] Unos korisnika", true);
        UnosKorisnika uk = new UnosKorisnika();
        dijalog.add(uk);
        dijalog.setSize(420, 200);
        dijalog.setLocationRelativeTo(this);
        dijalog.pack();
        dijalog.setVisible(true);

    }//GEN-LAST:event_unosKorisnikActionPerformed

    private void unosTreningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unosTreningActionPerformed
        JDialog dijalog = new JDialog(this, "[TERETANA] Unos treninga", true);
        UnosTreninga ut = new UnosTreninga();
        dijalog.add(ut);
        dijalog.setSize(420, 200);
        dijalog.setLocationRelativeTo(this);
        dijalog.pack();
        dijalog.setVisible(true);
    }//GEN-LAST:event_unosTreningActionPerformed

    private void pretragaTreningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pretragaTreningActionPerformed
        PretragaTreninga pt = new PretragaTreninga();
        pt.setVisible(true);
    }//GEN-LAST:event_pretragaTreningActionPerformed

    private void unosOTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unosOTActionPerformed
        JDialog dijalog = new JDialog(this, "[TERETANA] Unos odabranog treninga", false);
        UnosOdabranogTreninga ut = new UnosOdabranogTreninga();
        dijalog.add(ut);
        dijalog.setSize(555, 555);
        dijalog.setLocationRelativeTo(this);
        dijalog.pack();
        dijalog.setVisible(true);
        UnosOdabranogTreninga un = new UnosOdabranogTreninga();
        un.setVisible(true);
    }//GEN-LAST:event_unosOTActionPerformed

    private void pretragaOTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pretragaOTActionPerformed
        PretragaOdabranogTreninga pk = new PretragaOdabranogTreninga();
        pk.setVisible(true);
    }//GEN-LAST:event_pretragaOTActionPerformed


    private void btnOdjavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOdjavaActionPerformed
        try {
            kontroler.Kontroler.getInstance().odajvaSaSistema();
            JOptionPane.showMessageDialog(this, "Dovidjenja!");
            System.exit(0);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnOdjavaActionPerformed

    private void window(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_window

    }//GEN-LAST:event_window

    private void windowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_windowClosing
        try {
            kontroler.Kontroler.getInstance().odajvaSaSistema();
            System.exit(0);
        } catch (Exception ex) {
            System.out.println("uso");
            Logger.getLogger(FormaGlavna.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_windowClosing

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
            java.util.logging.Logger.getLogger(FormaGlavna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormaGlavna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormaGlavna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormaGlavna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormaGlavna().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem PretragaKorisnia;
    private javax.swing.JButton btnOdjava;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem pretragaOT;
    private javax.swing.JMenuItem pretragaTrening;
    private javax.swing.JTextField txtUlogovani;
    private javax.swing.JMenuItem unosKorisnik;
    private javax.swing.JMenuItem unosOT;
    private javax.swing.JMenuItem unosTrening;
    // End of variables declaration//GEN-END:variables
}
