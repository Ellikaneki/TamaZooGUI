/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package it.iiscastelli.tama.ui;

import it.iiscastelli.tama.data.TamaZoo;
import it.iiscastelli.tama.ui.custom.Colore;
import it.iiscastelli.tama.util.ScritturaLenta;
import it.iiscastelli.tama.util.StatoZooListener;
import javax.swing.border.LineBorder;

/**
 *
 * @author Ely
 */
public class FinestraGioco extends javax.swing.JFrame implements StatoZooListener {

    private TamaZoo zoo;
    private PanelTama[] pannelliTama;
    private int indiceSelezionato;
    private ScritturaLenta scrittore;

    /**
     * Creates new form FinestraGioco
     *
     * @param zoo
     */
    public FinestraGioco(TamaZoo zoo) {
        initComponents();
        pannelliTama = new PanelTama[]{
            panelTama1, panelTama2, panelTama3, panelTama4, panelTama5, panelTama6
        };
        inizializza(zoo);
    }

    private void inizializza(TamaZoo zoo) {
        this.zoo = zoo;
        for (int i = 0; i < zoo.conta(); i++) {
            pannelliTama[i].setTama(zoo.get(i));
        }
        for (int i = zoo.conta(); i < pannelliTama.length; i++) {
            pannelliTama[i].setVisible(false);
        }
        scrittore = new ScritturaLenta(txtMessaggio);
        panelTamaScelto.setScrittore(scrittore);
        panelTamaScelto.setStatoZooListener(this);
        panelTamaScelto.setQuantita(1);
        selezionaPannelloTama(0);
        setEnabled(true);
    }

    public void setZoo(TamaZoo zoo) {
        inizializza(zoo);
    }

    @Override
    public void cambioStato() {
        if (zoo.tuttiMorti()) {
            FinestraMessaggio errore = new FinestraMessaggio(this, true);
            errore.setTitolo("Game Over");
            errore.setMessaggio("Tutti i tamagotchi sono morti!");
            errore.setIcona("src/it/iis/tama/assets/TamaMorto32.png");
            errore.setTestoPulsante("NUOVA PARTITA");
            errore.setVisible(true);
            FinestraPrincipale finestraPrincipale = new FinestraPrincipale();
            finestraPrincipale.setVisible(true);
            dispose();
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

        sfondo = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        panelTama1 = new it.iiscastelli.tama.ui.PanelTama();
        panelTama2 = new it.iiscastelli.tama.ui.PanelTama();
        panelTama3 = new it.iiscastelli.tama.ui.PanelTama();
        panelTama4 = new it.iiscastelli.tama.ui.PanelTama();
        panelTama5 = new it.iiscastelli.tama.ui.PanelTama();
        panelTama6 = new it.iiscastelli.tama.ui.PanelTama();
        panelTamaScelto = new it.iiscastelli.tama.ui.PanelTamaScelto();
        btnMenu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMessaggio = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Partita");
        setResizable(false);

        sfondo.setBackground(new java.awt.Color(255, 246, 224));

        jPanel2.setBackground(new java.awt.Color(255, 246, 224));
        jPanel2.setLayout(new java.awt.GridLayout(3, 2, 20, 20));

        panelTama1.setBackground(new java.awt.Color(255, 255, 255));
        panelTama1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 99, 162), 2));
        panelTama1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelTamaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelTamaMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panelTamaMouseReleased(evt);
            }
        });
        jPanel2.add(panelTama1);

        panelTama2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelTamaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelTamaMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panelTamaMouseReleased(evt);
            }
        });
        jPanel2.add(panelTama2);

        panelTama3.setTama(null);
        panelTama3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelTamaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelTamaMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panelTamaMouseReleased(evt);
            }
        });
        jPanel2.add(panelTama3);

        panelTama4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelTamaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelTamaMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panelTamaMouseReleased(evt);
            }
        });
        jPanel2.add(panelTama4);

        panelTama5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelTamaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelTamaMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panelTamaMouseReleased(evt);
            }
        });
        jPanel2.add(panelTama5);

        panelTama6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelTamaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelTamaMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panelTamaMouseReleased(evt);
            }
        });
        jPanel2.add(panelTama6);

        btnMenu.setBackground(new java.awt.Color(255, 144, 183));
        btnMenu.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        btnMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnMenu.setText("Menù");
        btnMenu.setBorderPainted(false);
        btnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenu.setFocusPainted(false);
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(null);

        txtMessaggio.setEditable(false);
        txtMessaggio.setBackground(new java.awt.Color(255, 255, 255));
        txtMessaggio.setColumns(20);
        txtMessaggio.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        txtMessaggio.setRows(2);
        txtMessaggio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 206, 209), 2, true));
        jScrollPane1.setViewportView(txtMessaggio);

        javax.swing.GroupLayout sfondoLayout = new javax.swing.GroupLayout(sfondo);
        sfondo.setLayout(sfondoLayout);
        sfondoLayout.setHorizontalGroup(
            sfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sfondoLayout.createSequentialGroup()
                .addContainerGap(450, Short.MAX_VALUE)
                .addComponent(panelTamaScelto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(sfondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMenu)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(sfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(sfondoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(252, Short.MAX_VALUE)))
        );
        sfondoLayout.setVerticalGroup(
            sfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sfondoLayout.createSequentialGroup()
                .addComponent(panelTamaScelto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(sfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sfondoLayout.createSequentialGroup()
                        .addComponent(btnMenu)
                        .addGap(9, 9, 9)))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(sfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(sfondoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(87, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sfondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sfondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void selezionaPannelloTama(int indice) {
        pannelliTama[indiceSelezionato].setBorder(null);
        pannelliTama[indiceSelezionato].setBackground(Colore.CREAMY_CLOUD_DREAMS);
        pannelliTama[indice].setBorder(new LineBorder(Colore.FRENCH_PINK, 2));
        pannelliTama[indice].setBackground(Colore.WHITE);
        panelTamaScelto.setTama(zoo.get(indice));
        scrittore.scrivi("");
        indiceSelezionato = indice;
    }

    private void panelTamaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelTamaMouseEntered
        PanelTama pannello = (PanelTama) evt.getSource();
        pannello.setBorder(new LineBorder(Colore.FRENCH_PINK, 2));
    }//GEN-LAST:event_panelTamaMouseEntered

    private void panelTamaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelTamaMouseExited
        PanelTama pannello = (PanelTama) evt.getSource();
        if (pannello != pannelliTama[indiceSelezionato]) {
            pannello.setBorder(null);
        }
    }//GEN-LAST:event_panelTamaMouseExited

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        FinestraMenu finestraMenu = new FinestraMenu(this, false);
        finestraMenu.setZoo(zoo);
        setEnabled(false);
        finestraMenu.setVisible(true);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void panelTamaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelTamaMouseReleased
        PanelTama pannello = (PanelTama) evt.getSource();
        if (!pannello.contains(evt.getPoint())) {
            return;
        }
        int indice = 0;
        for (int i = 0; i < zoo.conta(); i++) {
            if (pannelliTama[i] == pannello) {
                indice = i;
                break;
            }
        }
        selezionaPannelloTama(indice);
    }//GEN-LAST:event_panelTamaMouseReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMenu;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private it.iiscastelli.tama.ui.PanelTama panelTama1;
    private it.iiscastelli.tama.ui.PanelTama panelTama2;
    private it.iiscastelli.tama.ui.PanelTama panelTama3;
    private it.iiscastelli.tama.ui.PanelTama panelTama4;
    private it.iiscastelli.tama.ui.PanelTama panelTama5;
    private it.iiscastelli.tama.ui.PanelTama panelTama6;
    private it.iiscastelli.tama.ui.PanelTamaScelto panelTamaScelto;
    private javax.swing.JPanel sfondo;
    private javax.swing.JTextArea txtMessaggio;
    // End of variables declaration//GEN-END:variables
}
