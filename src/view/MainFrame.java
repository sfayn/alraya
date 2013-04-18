/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.jtattoo.plaf.aero.AeroLookAndFeel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author Sfayn
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    JLabel icon;

    public MainFrame() {
        initComponents();
        setLocationRelativeTo(null);
        this.setTitle("Gestion de stock");
        this.setExtendedState(this.getExtendedState() | this.MAXIMIZED_BOTH);
        JPanel jPanel1 = new JPanel();
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        jPanel1.setBounds(0, -100, (int) screen.getWidth(), (int) screen.getHeight() + 100);

        icon = new JLabel(new ImageIcon("img/ALRAYAH.png"));
        jPanel1.setLayout(new BorderLayout());
        jPanel1.add(icon);
        jDesktopPane1.add(jPanel1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        jMenu1.setIcon(new javax.swing.ImageIcon("img/client.png")); // NOI18N
        jMenu1.setText("Gestion client");

        jMenuItem1.setIcon(new javax.swing.ImageIcon("img/ajouter_Client.png")); // NOI18N
        jMenuItem1.setText("Ajouter Client");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon("img/catalogue_client.png")); // NOI18N
        jMenuItem2.setText("Catalogue Client");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon("img/fournisseur.png")); // NOI18N
        jMenu2.setText("Gestion fournisseur");

        jMenuItem3.setIcon(new javax.swing.ImageIcon("img/ajouter_Client.png")); // NOI18N
        jMenuItem3.setText("Ajouter fournisseur ");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setIcon(new javax.swing.ImageIcon("img/catalogue_client.png")); // NOI18N
        jMenuItem4.setText("Catalogue fournisseur");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon("img/produit.png")); // NOI18N
        jMenu3.setText("Gestion produit");

        jMenuItem5.setIcon(new javax.swing.ImageIcon("img/ajouter_produit.png")); // NOI18N
        jMenuItem5.setText("Ajouter produit");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon("img/catalogue.png")); // NOI18N
        jMenu4.setText("Catalogue");

        jMenuItem6.setIcon(new javax.swing.ImageIcon("img/ajouter_catalogue.png")); // NOI18N
        jMenuItem6.setText("Ajouter catalogue");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        jMenuItem7.setIcon(new javax.swing.ImageIcon("img/afficher_catalogue.png")); // NOI18N
        jMenuItem7.setText("Afficher catalogue");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon("img/m&c.png")); // NOI18N
        jMenu5.setText("Suivi et controle");

        jMenuItem8.setIcon(new javax.swing.ImageIcon("img/block.png")); // NOI18N
        jMenuItem8.setText("Bloquer client");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem8);

        jMenuItem9.setIcon(new javax.swing.ImageIcon("img/block.png")); // NOI18N
        jMenuItem9.setText("Bloquer fournisseur");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem9);

        jMenuBar1.add(jMenu5);

        jMenu6.setIcon(new javax.swing.ImageIcon("img/commande.png")); // NOI18N
        jMenu6.setText("Commades/Livraison");

        jMenuItem10.setIcon(new javax.swing.ImageIcon("img/ajouter_commande.png")); // NOI18N
        jMenuItem10.setText("Commander");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem10);

        jMenuItem11.setIcon(new javax.swing.ImageIcon("img/detail.png")); // NOI18N
        jMenuItem11.setText("Details ");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem11);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        ClientView i = new ClientView();
        this.jDesktopPane1.add(i);
        i.setFrameIcon(null);
        i.setResizable(true);
        i.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        i.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        CatalogueClient i = new CatalogueClient();
        this.jDesktopPane1.add(i);
        i.setFrameIcon(null);
        i.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        i.show();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        FournisseurVue i = new FournisseurVue();
        this.jDesktopPane1.add(i);
        i.setFrameIcon(null);
        i.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        i.show();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        CatalogueFournisseur i = new CatalogueFournisseur();
        this.jDesktopPane1.add(i);
        i.setFrameIcon(null);
        i.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        i.show();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        ProduitViiew i = new ProduitViiew();
        this.jDesktopPane1.add(i);
        i.setFrameIcon(null);
        i.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        i.show();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        CataloqueView i = new CataloqueView();
        this.jDesktopPane1.add(i);
        i.setFrameIcon(null);
        i.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        i.show();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        FournisseurProducts i = new FournisseurProducts();
        this.jDesktopPane1.add(i);
        i.setFrameIcon(null);
        i.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        i.setClosable(true);
        i.setResizable(true);
        i.setMaximizable(true);
        i.setIconifiable(true);
        i.show();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        SuivieControlClient i = new SuivieControlClient();
        this.jDesktopPane1.add(i);
        i.setFrameIcon(null);
        i.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        i.show();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        SuivieControlFournisseur i = new SuivieControlFournisseur();
        this.jDesktopPane1.add(i);
        i.setFrameIcon(null);
        i.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        i.show();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        CommandeView i = new CommandeView();
        this.jDesktopPane1.add(i);
        i.setFrameIcon(null);
        i.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        i.show();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
        CatalogueLivraisonView i = new CatalogueLivraisonView();
        this.jDesktopPane1.add(i);
        i.setFrameIcon(null);
        i.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        i.show();
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    //UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");

                    Properties props = new Properties();
                    props.put("logoString", "");
                    AeroLookAndFeel.setCurrentTheme(props);
                    UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");
                    //UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (Exception e) {
                }
                MainFrame m = new MainFrame();
                m.setVisible(true);
                m.setIconImage(new ImageIcon("img/logo.png").getImage());
            }
        });

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}
