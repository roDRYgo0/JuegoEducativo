package paneles;

import ayuda.panel1;
import java.awt.BorderLayout;
import java.awt.Image;
import javaClass.controlador;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class inicio extends javax.swing.JPanel {
    
    public inicio() {
        initComponents();
        load("home");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nuevo = new javax.swing.JButton();
        home = new javax.swing.JLabel();
        nuevo1 = new javax.swing.JButton();
        nuevo2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(254, 254, 254));
        setMaximumSize(new java.awt.Dimension(988, 514));
        setMinimumSize(new java.awt.Dimension(988, 514));
        setPreferredSize(new java.awt.Dimension(988, 514));

        nuevo.setText("Nueva partida");
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });

        home.setMaximumSize(new java.awt.Dimension(634, 392));
        home.setMinimumSize(new java.awt.Dimension(634, 392));
        home.setPreferredSize(new java.awt.Dimension(634, 392));

        nuevo1.setText("Ayuda");
        nuevo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevo1ActionPerformed(evt);
            }
        });

        nuevo2.setText("Acerca de");
        nuevo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevo2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 178, Short.MAX_VALUE)
                        .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(166, 166, 166))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(nuevo2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(240, 240, 240)
                        .addComponent(nuevo1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nuevo1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nuevo2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        nuevaPartida ini = new nuevaPartida();
        
        ini.setSize(988, 514);
        ini.setLocation(0,0);
        
        controlador.pane.removeAll();
        controlador.pane.add(ini,BorderLayout.CENTER);
        controlador.pane.revalidate();
        controlador.pane.repaint();

    }//GEN-LAST:event_nuevoActionPerformed

    private void nuevo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevo1ActionPerformed
        panel1 ini = new panel1();
        
        ini.setSize(988, 514);
        ini.setLocation(0,0);
        
        controlador.pane.removeAll();
        controlador.pane.add(ini,BorderLayout.CENTER);
        controlador.pane.revalidate();
        controlador.pane.repaint();
    }//GEN-LAST:event_nuevo1ActionPerformed

    private void nuevo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevo2ActionPerformed
        acercaDe ini = new acercaDe();
        
        ini.setSize(988, 514);
        ini.setLocation(0,0);
        
        controlador.pane.removeAll();
        controlador.pane.add(ini,BorderLayout.CENTER);
        controlador.pane.revalidate();
        controlador.pane.repaint();
    }//GEN-LAST:event_nuevo2ActionPerformed
    
    public void load(String g)
    {
        ImageIcon original = new ImageIcon(getClass().getResource("/imagenes/"+g+".png"));
        Icon icono = new ImageIcon(original.getImage().getScaledInstance(634, 392, Image.SCALE_SMOOTH));
        home.setIcon(icono);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel home;
    private javax.swing.JButton nuevo;
    private javax.swing.JButton nuevo1;
    private javax.swing.JButton nuevo2;
    // End of variables declaration//GEN-END:variables
}
