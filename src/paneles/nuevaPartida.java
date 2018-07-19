package paneles;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import javaClass.controlador;
import javaClass.juego;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class nuevaPartida extends javax.swing.JPanel {
    
    public nuevaPartida() {
        initComponents();
        
        loadData("entM1",tuImagen1);
        loadData("entF1",tuImagen2);
        loadData("entM2",imagenRival2);
        loadData("entF2",imagenRival2);
        
        juego.tuNombre="entM1";
        juego.nombreRival="entM2";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tuNombre = new javax.swing.JTextField();
        tuImagen1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nombreRival = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        tuImagen2 = new javax.swing.JLabel();
        imagenRival2 = new javax.swing.JLabel();
        imagenRival1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(254, 254, 254));
        setMaximumSize(new java.awt.Dimension(906, 500));
        setMinimumSize(new java.awt.Dimension(906, 500));

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 36)); // NOI18N
        jLabel1.setText("Tu nombre:");

        tuNombre.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        tuNombre.setForeground(new java.awt.Color(58, 73, 179));
        tuNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tuNombre.setText("Ash");

        tuImagen1.setBackground(new java.awt.Color(1, 1, 1));
        tuImagen1.setMaximumSize(new java.awt.Dimension(115, 138));
        tuImagen1.setMinimumSize(new java.awt.Dimension(115, 138));
        tuImagen1.setOpaque(true);
        tuImagen1.setPreferredSize(new java.awt.Dimension(115, 138));
        tuImagen1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tuImagen1MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Cantarell", 1, 36)); // NOI18N
        jLabel4.setText("Nombre del rival:");

        nombreRival.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        nombreRival.setForeground(new java.awt.Color(58, 73, 179));
        nombreRival.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombreRival.setText("Carlitos");

        jButton1.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        jButton1.setText("Continuar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tuImagen2.setBackground(new java.awt.Color(254, 254, 254));
        tuImagen2.setMaximumSize(new java.awt.Dimension(115, 138));
        tuImagen2.setMinimumSize(new java.awt.Dimension(115, 138));
        tuImagen2.setOpaque(true);
        tuImagen2.setPreferredSize(new java.awt.Dimension(115, 138));
        tuImagen2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tuImagen2MouseClicked(evt);
            }
        });

        imagenRival2.setBackground(new java.awt.Color(254, 254, 254));
        imagenRival2.setMaximumSize(new java.awt.Dimension(115, 138));
        imagenRival2.setMinimumSize(new java.awt.Dimension(115, 138));
        imagenRival2.setOpaque(true);
        imagenRival2.setPreferredSize(new java.awt.Dimension(115, 138));
        imagenRival2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagenRival2MouseClicked(evt);
            }
        });

        imagenRival1.setBackground(new java.awt.Color(1, 1, 1));
        imagenRival1.setMaximumSize(new java.awt.Dimension(115, 138));
        imagenRival1.setMinimumSize(new java.awt.Dimension(115, 138));
        imagenRival1.setOpaque(true);
        imagenRival1.setPreferredSize(new java.awt.Dimension(115, 138));
        imagenRival1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagenRival1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(125, 125, 125)
                                        .addComponent(nombreRival, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(75, 75, 75)
                                    .addComponent(jLabel1))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(200, 200, 200)
                                    .addComponent(tuNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tuImagen1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imagenRival1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tuImagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imagenRival2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)))
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tuNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tuImagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tuImagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombreRival, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(imagenRival2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagenRival1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        preguntar ini = new preguntar();
        
        ini.setSize(906, 500);
        ini.setLocation(0,0);
        
        controlador.pane.removeAll();
        controlador.pane.add(ini,BorderLayout.CENTER);
        controlador.pane.revalidate();
        controlador.pane.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tuImagen1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tuImagen1MouseClicked
        tuImagen1.setBackground(Color.black);
        tuImagen2.setBackground(Color.white);
        juego.tuNombre="entM1";
    }//GEN-LAST:event_tuImagen1MouseClicked

    private void tuImagen2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tuImagen2MouseClicked
        tuImagen2.setBackground(Color.black);
        tuImagen1.setBackground(Color.white);
        juego.tuNombre="entF1";
    }//GEN-LAST:event_tuImagen2MouseClicked

    private void imagenRival2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagenRival2MouseClicked
        imagenRival2.setBackground(Color.black);
        imagenRival1.setBackground(Color.white);
        juego.nombreRival="entM2";
    }//GEN-LAST:event_imagenRival2MouseClicked

    private void imagenRival1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagenRival1MouseClicked
        imagenRival1.setBackground(Color.black);
        imagenRival2.setBackground(Color.white);
        juego.nombreRival="entF2";
    }//GEN-LAST:event_imagenRival1MouseClicked

    public void loadData(String img, JLabel boton)
    {
        ImageIcon original = new ImageIcon(getClass().getResource("/imagenes/"+img+".png"));
        Icon icono = new ImageIcon(original.getImage().getScaledInstance(115, 138, Image.SCALE_SMOOTH));
        boton.setIcon(icono);
    } 
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imagenRival1;
    private javax.swing.JLabel imagenRival2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField nombreRival;
    private javax.swing.JLabel tuImagen1;
    private javax.swing.JLabel tuImagen2;
    private javax.swing.JTextField tuNombre;
    // End of variables declaration//GEN-END:variables
}
