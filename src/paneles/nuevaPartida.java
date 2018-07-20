package paneles;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import javaClass.controlador;
import javaClass.juego;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class nuevaPartida extends javax.swing.JPanel {
    
    int entre=1;
    
    public nuevaPartida() {
        initComponents();
        
        loadData("1",imagen1);
        loadData("2",imagen2);
        loadData("3",imagen3);
        loadData("4",imagen4);
        loadData("5",imagen5);
        loadData("6",imagen6);
        loadData("7",imagen7);
        loadData("8",imagen8);
        loadData("9",imagen9);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tuNombre = new javax.swing.JTextField();
        imagen1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        imagen2 = new javax.swing.JLabel();
        imagen3 = new javax.swing.JLabel();
        imagen4 = new javax.swing.JLabel();
        imagen5 = new javax.swing.JLabel();
        imagen6 = new javax.swing.JLabel();
        imagen7 = new javax.swing.JLabel();
        imagen8 = new javax.swing.JLabel();
        imagen9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(254, 254, 254));
        setMaximumSize(new java.awt.Dimension(988, 514));
        setMinimumSize(new java.awt.Dimension(988, 514));
        setPreferredSize(new java.awt.Dimension(988, 514));

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 36)); // NOI18N
        jLabel1.setText("Tu nombre:");

        tuNombre.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        tuNombre.setForeground(new java.awt.Color(58, 73, 179));
        tuNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tuNombre.setText("Ash");
        tuNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tuNombreKeyPressed(evt);
            }
        });

        imagen1.setBackground(new java.awt.Color(0, 0, 0));
        imagen1.setMaximumSize(new java.awt.Dimension(100, 200));
        imagen1.setMinimumSize(new java.awt.Dimension(100, 200));
        imagen1.setOpaque(true);
        imagen1.setPreferredSize(new java.awt.Dimension(100, 200));
        imagen1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagen1MouseClicked(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        jButton1.setText("Continuar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        imagen2.setBackground(new java.awt.Color(255, 255, 255));
        imagen2.setMaximumSize(new java.awt.Dimension(100, 200));
        imagen2.setMinimumSize(new java.awt.Dimension(100, 200));
        imagen2.setOpaque(true);
        imagen2.setPreferredSize(new java.awt.Dimension(100, 200));
        imagen2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagen2MouseClicked(evt);
            }
        });

        imagen3.setBackground(new java.awt.Color(255, 255, 255));
        imagen3.setMaximumSize(new java.awt.Dimension(100, 200));
        imagen3.setMinimumSize(new java.awt.Dimension(100, 200));
        imagen3.setOpaque(true);
        imagen3.setPreferredSize(new java.awt.Dimension(100, 200));
        imagen3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagen3MouseClicked(evt);
            }
        });

        imagen4.setBackground(new java.awt.Color(255, 255, 255));
        imagen4.setMaximumSize(new java.awt.Dimension(100, 200));
        imagen4.setMinimumSize(new java.awt.Dimension(100, 200));
        imagen4.setOpaque(true);
        imagen4.setPreferredSize(new java.awt.Dimension(100, 200));
        imagen4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagen4MouseClicked(evt);
            }
        });

        imagen5.setBackground(new java.awt.Color(255, 255, 255));
        imagen5.setMaximumSize(new java.awt.Dimension(100, 200));
        imagen5.setMinimumSize(new java.awt.Dimension(100, 200));
        imagen5.setOpaque(true);
        imagen5.setPreferredSize(new java.awt.Dimension(100, 200));
        imagen5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagen5MouseClicked(evt);
            }
        });

        imagen6.setBackground(new java.awt.Color(255, 255, 255));
        imagen6.setMaximumSize(new java.awt.Dimension(100, 200));
        imagen6.setMinimumSize(new java.awt.Dimension(100, 200));
        imagen6.setOpaque(true);
        imagen6.setPreferredSize(new java.awt.Dimension(100, 200));
        imagen6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagen6MouseClicked(evt);
            }
        });

        imagen7.setBackground(new java.awt.Color(255, 255, 255));
        imagen7.setMaximumSize(new java.awt.Dimension(100, 200));
        imagen7.setMinimumSize(new java.awt.Dimension(100, 200));
        imagen7.setOpaque(true);
        imagen7.setPreferredSize(new java.awt.Dimension(100, 200));
        imagen7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagen7MouseClicked(evt);
            }
        });

        imagen8.setBackground(new java.awt.Color(255, 255, 255));
        imagen8.setMaximumSize(new java.awt.Dimension(100, 200));
        imagen8.setMinimumSize(new java.awt.Dimension(100, 200));
        imagen8.setOpaque(true);
        imagen8.setPreferredSize(new java.awt.Dimension(100, 200));
        imagen8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagen8MouseClicked(evt);
            }
        });

        imagen9.setBackground(new java.awt.Color(255, 255, 255));
        imagen9.setMaximumSize(new java.awt.Dimension(100, 200));
        imagen9.setMinimumSize(new java.awt.Dimension(100, 200));
        imagen9.setOpaque(true);
        imagen9.setPreferredSize(new java.awt.Dimension(100, 200));
        imagen9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagen9MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Cantarell", 1, 36)); // NOI18N
        jLabel2.setText("Elige tu personaje:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(tuNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(imagen1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imagen2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imagen3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imagen4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imagen5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imagen6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imagen7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imagen8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(imagen9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tuNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagen2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagen1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagen3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagen6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagen5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagen9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagen4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagen7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagen8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        tuNombre.setText( tuNombre.getText().replace(" ", "") );
        System.out.println("hola");
        if(!tuNombre.getText().isEmpty() && tuNombre.getText().length() < 10){
            juego.tuNombre = tuNombre.getText();
            
            juego.entrenadoresUsados.add(entre);
            juego.tuImagen = entre+"";
            System.out.println("Ahorita"+juego.entrenador); 
            juego.entrenador = juego.nuevoEntrenador();
            
            preguntar ini = new preguntar();
        
            ini.setSize(988, 514);
            ini.setLocation(0,0);

            controlador.pane.removeAll();
            controlador.pane.add(ini,BorderLayout.CENTER);
            controlador.pane.revalidate();
            controlador.pane.repaint();
        }else{
            JOptionPane.showMessageDialog(this, "Ingresa tu nombre o \nescribelo más corto", "Advertencia", JOptionPane.WARNING_MESSAGE);
            tuNombre.setText("");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    void todasBlancas(){
        imagen1.setBackground(Color.white);
        imagen2.setBackground(Color.white);
        imagen3.setBackground(Color.white);
        imagen4.setBackground(Color.white);
        imagen5.setBackground(Color.white);
        imagen6.setBackground(Color.white);
        imagen7.setBackground(Color.white);
        imagen8.setBackground(Color.white);
        imagen9.setBackground(Color.white);
    }
    
    private void imagen1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagen1MouseClicked
        todasBlancas();
        imagen1.setBackground(Color.black);
        juego.tuImagen="1";
        entre=1;
    }//GEN-LAST:event_imagen1MouseClicked

    private void imagen2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagen2MouseClicked
        todasBlancas();
        imagen2.setBackground(Color.black);
        juego.tuImagen="2";
        entre=2;
    }//GEN-LAST:event_imagen2MouseClicked

    private void imagen3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagen3MouseClicked
        todasBlancas();
        imagen3.setBackground(Color.black);
        juego.tuImagen="3";
        entre=3;
    }//GEN-LAST:event_imagen3MouseClicked

    private void imagen4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagen4MouseClicked
        todasBlancas();
        imagen4.setBackground(Color.black);
        juego.tuImagen="4";
        entre=4;
    }//GEN-LAST:event_imagen4MouseClicked

    private void imagen5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagen5MouseClicked
        todasBlancas();
        imagen5.setBackground(Color.black);
        juego.tuImagen="5";
        entre=5;
    }//GEN-LAST:event_imagen5MouseClicked

    private void imagen6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagen6MouseClicked
        todasBlancas();
        imagen6.setBackground(Color.black);
        juego.tuImagen="6";
        entre=6;
    }//GEN-LAST:event_imagen6MouseClicked

    private void imagen7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagen7MouseClicked
        todasBlancas();
        imagen7.setBackground(Color.black);
        juego.tuImagen="7";
        entre=7;
    }//GEN-LAST:event_imagen7MouseClicked

    private void imagen8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagen8MouseClicked
        todasBlancas();
        imagen8.setBackground(Color.black);
        juego.tuImagen="8";
        entre=8;
    }//GEN-LAST:event_imagen8MouseClicked

    private void imagen9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagen9MouseClicked
        todasBlancas();
        imagen9.setBackground(Color.black);
        juego.tuImagen="9";
        entre=9;
    }//GEN-LAST:event_imagen9MouseClicked

    private void tuNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tuNombreKeyPressed
        if (tuNombre.getText().length()== 9) 
                evt.consume();
    }//GEN-LAST:event_tuNombreKeyPressed

    public void loadData(String img, JLabel boton)
    {
        ImageIcon original = new ImageIcon(getClass().getResource("/entrenadores/"+img+".png"));
        Icon icono = new ImageIcon(original.getImage().getScaledInstance(100, 200, Image.SCALE_SMOOTH));
        boton.setIcon(icono);
    } 
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imagen1;
    private javax.swing.JLabel imagen2;
    private javax.swing.JLabel imagen3;
    private javax.swing.JLabel imagen4;
    private javax.swing.JLabel imagen5;
    private javax.swing.JLabel imagen6;
    private javax.swing.JLabel imagen7;
    private javax.swing.JLabel imagen8;
    private javax.swing.JLabel imagen9;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField tuNombre;
    // End of variables declaration//GEN-END:variables
}
