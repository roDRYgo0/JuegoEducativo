package paneles;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import javaClass.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public final class responder extends javax.swing.JPanel {
   
    int step, punto;
    
    int[] meme = new int[3];

    boolean respuesta, elegido;
    
    public responder() {
        initComponents();   
        respuesta = false;
        elegido = true;
        estado.setVisible(false);
        step=0;
        
        cargar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblPregunta = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnResp1 = new javax.swing.JButton();
        btnResp3 = new javax.swing.JButton();
        btnResp4 = new javax.swing.JButton();
        btnResp2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        siguiente = new javax.swing.JButton();
        estado = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(254, 254, 254));
        setMaximumSize(new java.awt.Dimension(906, 500));
        setMinimumSize(new java.awt.Dimension(906, 500));
        setPreferredSize(new java.awt.Dimension(895, 500));

        jPanel2.setBackground(new java.awt.Color(248, 248, 248));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Pregunta"));

        lblPregunta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPregunta.setText("fhsj js jsjkfdh jkhfsdjk hfkjshdkfj hksdhfkj hsjkdhfjk jksdhfk khskjdhf ksd");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPregunta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPregunta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(248, 248, 248));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Pregunta"));

        btnResp1.setBackground(new java.awt.Color(254, 254, 254));
        btnResp1.setText("La casa de meme");
        btnResp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResp1ActionPerformed(evt);
            }
        });

        btnResp3.setBackground(new java.awt.Color(254, 254, 254));
        btnResp3.setText("La casa de meme");
        btnResp3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResp3ActionPerformed(evt);
            }
        });

        btnResp4.setBackground(new java.awt.Color(254, 254, 254));
        btnResp4.setText("La casa de meme");
        btnResp4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResp4ActionPerformed(evt);
            }
        });

        btnResp2.setBackground(new java.awt.Color(254, 254, 254));
        btnResp2.setText("La casa de meme");
        btnResp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResp2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnResp1, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                    .addComponent(btnResp3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnResp4, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                    .addComponent(btnResp2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnResp2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnResp4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnResp1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnResp3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

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
                .addContainerGap(390, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(248, 248, 248))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(77, 77, 77))
        );

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(65, 235, 57));
        jLabel1.setText("Defiendete");

        siguiente.setText("Siguiente");
        siguiente.setEnabled(false);
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });

        estado.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        estado.setForeground(new java.awt.Color(22, 223, 24));
        estado.setText("Correcta");

        jLabel2.setFont(new java.awt.Font("Cantarell", 1, 20)); // NOI18N
        jLabel2.setText("La espuesta es: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(estado)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                                .addComponent(siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(estado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnResp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResp1ActionPerformed
        if(elegido){
            juego.setEleccion("1");
            respuesta = juego.comprobar();
            estado();
            elegido = false;
        }
    }//GEN-LAST:event_btnResp1ActionPerformed

    private void btnResp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResp2ActionPerformed
        if(elegido){
            juego.setEleccion("2");
            respuesta = juego.comprobar();
            estado();
            elegido = false;
        }
    }//GEN-LAST:event_btnResp2ActionPerformed

    private void btnResp3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResp3ActionPerformed
        if(elegido){
            juego.setEleccion("3");
            respuesta = juego.comprobar();
            estado();
            elegido = false;
        }
    }//GEN-LAST:event_btnResp3ActionPerformed

    private void btnResp4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResp4ActionPerformed
        if(elegido){
            juego.setEleccion("4");
            respuesta = juego.comprobar();
            estado();
            elegido = false;
        }
    }//GEN-LAST:event_btnResp4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        controlador.resetearJuego();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
        switch(step){
            case 0:
                if(respuesta){
                    estado.setVisible(true);
                    estado.setText("Correcta");
                    estado.setForeground(Color.green);
                    correcta(Integer.parseInt(juego.getCorrecta())+4);
                    punto=0;
                }
                else{
                    estado.setVisible(true);
                    estado.setText("Incorrecta");
                    estado.setForeground(Color.red);
                    correcta(Integer.parseInt(juego.getCorrecta())+4);
                    punto=-9;
                }
                
                step++;
                break;
            case 1:
                if(respuesta)
                    controlador.agregar("0T");
                else
                    controlador.agregar("XT"); 
                
                
                switch (juego.ganador(punto)) {
                    case 0:
                        
                        //<editor-fold defaultstate="collapsed" desc="Victoria">
                        juego.nivel++;
                        if(juego.nivel==4)
                        {
                            resultado res = new resultado(juego.tuNombre, "Victoria!", Color.yellow);
                            res.setSize(906, 500);
                            res.setLocation(0,0);

                            controlador.pane.removeAll();
                            controlador.pane.add(res,BorderLayout.CENTER);
                            controlador.pane.revalidate();
                            controlador.pane.repaint();
                        }
                        else{
                            siguienteNivel res = new siguienteNivel(juego.nivel);
                            res.setSize(906, 500);
                            res.setLocation(0,0);

                            controlador.pane.removeAll();
                            controlador.pane.add(res,BorderLayout.CENTER);
                            controlador.pane.revalidate();
                            controlador.pane.repaint();
                        }
                        //</editor-fold>
                        
                        break;
                    case 1:
                        
                        //<editor-fold defaultstate="collapsed" desc="derrota">
                        juego.nivel++;
                        if(juego.nivel==4)
                        {
                            resultado res = new resultado(juego.nombreRival, "Derrota!", Color.red);
                            res.setSize(906, 500);
                            res.setLocation(0,0);

                            controlador.pane.removeAll();
                            controlador.pane.add(res,BorderLayout.CENTER);
                            controlador.pane.revalidate();
                            controlador.pane.repaint();
                        }
                        else{
                            derrota res = new derrota();
                            res.setSize(906, 500);
                            res.setLocation(0,0);

                            controlador.pane.removeAll();
                            controlador.pane.add(res,BorderLayout.CENTER);
                            controlador.pane.revalidate();
                            controlador.pane.repaint();
                        }
                        //</editor-fold>
                        
                        break;
                    case -2:
                        
                        //<editor-fold defaultstate="collapsed" desc="Muerte subita">
                        if(juego.muerteSubita==false){
                            muerte muer = new muerte();
        
                            muer.setSize(906, 486);
                            muer.setLocation(0,0);

                            controlador.pane.removeAll();
                            controlador.pane.add(muer,BorderLayout.CENTER);
                            controlador.pane.revalidate();
                            controlador.pane.repaint();
                            juego.muerteSubita=true;
                        }else{
                            preguntar ini = new preguntar();
        
                            ini.setSize(906, 486);
                            ini.setLocation(0,0);

                            controlador.pane.removeAll();
                            controlador.pane.add(ini,BorderLayout.CENTER);
                            controlador.pane.revalidate();
                            controlador.pane.repaint(); 
                        }
                        //</editor-fold>
                        
                        break;
                    default:
                        preguntar ini = new preguntar();
        
                        ini.setSize(906, 500);
                        ini.setLocation(0,0);

                        controlador.pane.removeAll();
                        controlador.pane.add(ini,BorderLayout.CENTER);
                        controlador.pane.revalidate();
                        controlador.pane.repaint();
                        break;
                }
                
                
                
                
                
                break;
        }
    }//GEN-LAST:event_siguienteActionPerformed

    public void loadData(int img, JLabel boton)
    {
        if(img != 74){
            ImageIcon original = new ImageIcon(getClass().getResource("/imagenes/"+(img+1)+".png"));
            Icon icono = new ImageIcon(original.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
            boton.setIcon(icono);
        }
    }
    
    void validar(int fe){
        if(fe==74){
            lblPregunta.setEnabled(false);
            btnResp1.setEnabled(false);
            btnResp2.setEnabled(false);
            btnResp3.setEnabled(false);
            btnResp4.setEnabled(false);
        }
    }
    
    void correcta(int i){
        switch(i){
            case 1:
                btnResp1.setForeground(Color.orange);
                btnResp2.setEnabled(false);
                btnResp3.setEnabled(false);
                btnResp4.setEnabled(false);
                break;
            case 2:
                btnResp1.setEnabled(false);
                btnResp2.setForeground(Color.orange);
                btnResp3.setEnabled(false);
                btnResp4.setEnabled(false);
                break;
            case 3:
                btnResp1.setEnabled(false);
                btnResp2.setEnabled(false);
                btnResp3.setForeground(Color.orange);
                btnResp4.setEnabled(false);
                break;
            case 4:
                btnResp1.setEnabled(false);
                btnResp2.setEnabled(false);
                btnResp3.setEnabled(false);
                btnResp4.setForeground(Color.orange);
                break;
            case 5:
                btnResp1.setForeground(Color.green);
                btnResp1.setEnabled(true);
                break;
            case 6:
                btnResp2.setForeground(Color.green);
                btnResp2.setEnabled(true);
                break;
            case 7:
                btnResp3.setForeground(Color.green);
                btnResp3.setEnabled(true);
                break;
            case 8:
                btnResp4.setForeground(Color.green);
                btnResp4.setEnabled(true);
                break;
        }
    }
    
    public void cargar(){
        int pregunta = juego.dispPreguntas();
        System.out.println(pregunta);
        juego.noPreguntasUsadas++;
        juego.preguntasUsadas.add(pregunta);
        lblPregunta.setText(juego.pre.preguntas[pregunta][0]);
        btnResp1.setText(juego.pre.respuestas[pregunta][1]);
        btnResp2.setText(juego.pre.respuestas[pregunta][2]);
        btnResp3.setText(juego.pre.respuestas[pregunta][3]);
        btnResp4.setText(juego.pre.respuestas[pregunta][4]);
        juego.setCorrecta(juego.pre.preguntas[pregunta][1]);
        loadData(pregunta,lblPregunta);
        validar(pregunta);
    }
    
    public int random(){
        return (int) (Math.random() * juego.cantidadPreguntas);
    }
    
    public void estado(){
        correcta(Integer.parseInt(juego.getEleccion()));
        siguiente.setEnabled(true);
    }
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnResp1;
    private javax.swing.JButton btnResp2;
    private javax.swing.JButton btnResp3;
    private javax.swing.JButton btnResp4;
    private javax.swing.JLabel estado;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblPregunta;
    private javax.swing.JButton siguiente;
    // End of variables declaration//GEN-END:variables
}
