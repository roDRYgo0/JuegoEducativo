package paneles;

import java.awt.BorderLayout;
import java.awt.Image;
import javaClass.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public final class preguntar extends javax.swing.JPanel {

    int[] ataques;
    int moderador = 0;
    preguntas pre = new preguntas();
    
    public preguntar() {
        initComponents();
        ataques = new int[4];
        juego.partido++;
        
        seleccionar();
        validar();
        asignar();
    }
    
    void asignar(){
        btnAtaque1.setText(pre.preguntas[ataques[0]][0]);
        loadData(ataques[0],btnAtaque1);
        btnAtaque2.setText(pre.preguntas[ataques[1]][0]);
        loadData(ataques[1],btnAtaque2);
        btnAtaque3.setText(pre.preguntas[ataques[2]][0]);
        loadData(ataques[2],btnAtaque3);
        btnAtaque4.setText(pre.preguntas[ataques[3]][0]);
        loadData(ataques[3],btnAtaque4);
    }
    
    void validar(){
        if(pre.preguntas[ataques[3]][0].equals("Not found")){
            btnAtaque4.setEnabled(false);
            if(pre.preguntas[ataques[2]][0].equals("Not found")){
                btnAtaque3.setEnabled(false);
                if(pre.preguntas[ataques[1]][0].equals("Not found")){
                    btnAtaque2.setEnabled(false);
                    if(pre.preguntas[ataques[0]][0].equals("Not found")){
                        btnAtaque1.setEnabled(false);
                    }
                }
            }
        }
    }
    
    public void seleccionar(){
        int numero;
        
        numero = juego.dispPreguntas();
        
        ataques[0] = numero;
        
        numero = juego.dispPreguntas();
        while(ataques[0] == numero){
            numero = juego.dispPreguntas();
            if(moderador >= 50){
                numero=74;
                break;
            }
            moderador++;
        }
            
        ataques[1] = numero;
        
        numero = juego.dispPreguntas();
        while(ataques[0] == numero || ataques[1] == numero){
            numero = juego.dispPreguntas();
            if(moderador >= 50){
                numero=74;
                break;
            }
            moderador++;
        }
        ataques[2]=numero;
        
        numero = juego.dispPreguntas();
        while(ataques[0] == numero || ataques[1] == numero || ataques[2] == numero){
            numero = juego.dispPreguntas();
            if(moderador >= 50){
                numero=74;
                break;
            }
            moderador++;
        }
        ataques[3] = numero;
    }
    
    public int random(){
        return (int) (Math.random() * juego.cantidadPreguntas);
    }
    
    void siguiente(int pre){
        rival riv = new rival(pre);
        
        riv.setSize(906, 500);
        riv.setLocation(0,0);
        
        controlador.pane.removeAll();
        controlador.pane.add(riv,BorderLayout.CENTER);
        controlador.pane.revalidate();
        controlador.pane.repaint();
    }
    
    public void loadData(int img, JButton boton)
    {
        if(img != 74){
            ImageIcon original = new ImageIcon(getClass().getResource("/imagenes/"+(img+1)+".png"));
            Icon icono = new ImageIcon(original.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
            boton.setIcon(icono);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnAtaque2 = new javax.swing.JButton();
        btnAtaque1 = new javax.swing.JButton();
        btnAtaque3 = new javax.swing.JButton();
        btnAtaque4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(254, 254, 254));
        setMaximumSize(new java.awt.Dimension(906, 500));
        setMinimumSize(new java.awt.Dimension(906, 500));
        setPreferredSize(new java.awt.Dimension(906, 500));

        jPanel1.setBackground(new java.awt.Color(148, 255, 243));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(404, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(248, 248, 248))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(120, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(77, 77, 77))
        );

        jPanel2.setBackground(new java.awt.Color(254, 254, 254));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Ataques dispoibles"));

        btnAtaque2.setBackground(new java.awt.Color(254, 254, 254));
        btnAtaque2.setFont(new java.awt.Font("Cantarell", 0, 11)); // NOI18N
        btnAtaque2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eye.png"))); // NOI18N
        btnAtaque2.setText("Not found");
        btnAtaque2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtaque2ActionPerformed(evt);
            }
        });

        btnAtaque1.setBackground(new java.awt.Color(254, 254, 254));
        btnAtaque1.setFont(new java.awt.Font("Cantarell", 0, 11)); // NOI18N
        btnAtaque1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eye.png"))); // NOI18N
        btnAtaque1.setText("Not found");
        btnAtaque1.setAutoscrolls(true);
        btnAtaque1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtaque1ActionPerformed(evt);
            }
        });

        btnAtaque3.setBackground(new java.awt.Color(254, 254, 254));
        btnAtaque3.setFont(new java.awt.Font("Cantarell", 0, 11)); // NOI18N
        btnAtaque3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eye.png"))); // NOI18N
        btnAtaque3.setText("Not found");
        btnAtaque3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtaque3ActionPerformed(evt);
            }
        });

        btnAtaque4.setBackground(new java.awt.Color(254, 254, 254));
        btnAtaque4.setFont(new java.awt.Font("Cantarell", 0, 11)); // NOI18N
        btnAtaque4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eye.png"))); // NOI18N
        btnAtaque4.setText("Not found");
        btnAtaque4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtaque4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnAtaque3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAtaque1, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAtaque2, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                    .addComponent(btnAtaque4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtaque2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtaque1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAtaque4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtaque3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(244, 25, 13));
        jLabel1.setText("Atacar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtaque2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtaque2ActionPerformed
        siguiente(ataques[1]);
        juego.noPreguntasUsadas++;
        juego.preguntasUsadas.add(ataques[1]);
    }//GEN-LAST:event_btnAtaque2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        seleccionar();
        asignar();
        System.out.println(ataques[0]+" "+ataques[1]+" "+ataques[2]+" "+ataques[3]);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAtaque4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtaque4ActionPerformed
        siguiente(ataques[3]);
        juego.noPreguntasUsadas++;
        juego.preguntasUsadas.add(ataques[3]);
    }//GEN-LAST:event_btnAtaque4ActionPerformed

    private void btnAtaque1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtaque1ActionPerformed
        siguiente(ataques[0]);
        juego.noPreguntasUsadas++;
        juego.preguntasUsadas.add(ataques[0]);
    }//GEN-LAST:event_btnAtaque1ActionPerformed

    private void btnAtaque3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtaque3ActionPerformed
        siguiente(ataques[2]);
        juego.noPreguntasUsadas++;
        juego.preguntasUsadas.add(ataques[2]);
    }//GEN-LAST:event_btnAtaque3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtaque1;
    private javax.swing.JButton btnAtaque2;
    private javax.swing.JButton btnAtaque3;
    private javax.swing.JButton btnAtaque4;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
