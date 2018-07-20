package paneles;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import javaClass.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public final class rival extends javax.swing.JPanel {

    int pregunta, correcta;
    int step, punto;
    boolean resp;
    
    public rival(int pregunta, int suPo) {
        initComponents();
        this.pregunta = pregunta;
        lblNivel.setText((juego.nivel+1)+"");
        loadData(suPo,suPokemon);
        step=0;
        estado.setVisible(false);
        loadAvatar(juego.tuImagen);
        loadAvatar(juego.entrenador+"", avatar1);
        loadMiPokemon(pregunta);
        
        cargar();
    }

    //<editor-fold defaultstate="collapsed" desc="load">
    public void loadMiPokemon(int img)
    {
        System.out.println("La imagen "+(img+1));
        ImageIcon original = new ImageIcon(getClass().getResource("/imagenes/"+(img)+".png"));
        Icon icono = new ImageIcon(original.getImage().getScaledInstance(75, 75, Image.SCALE_SMOOTH));
        miPokemon.setIcon(icono);
    }
    
   public void loadData(int img)
    {
        System.out.println("La imagen "+(img+1));
        ImageIcon original = new ImageIcon(getClass().getResource("/imagenes/"+(img)+".png"));
        Icon icono = new ImageIcon(original.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
        pregun.setIcon(icono);
    } 
   
   public void loadData(int img, JLabel boton)
    {
        System.out.println("La imagen "+(img));
            ImageIcon original = new ImageIcon(getClass().getResource("/imagenes/"+(img)+".png"));
            Icon icono = new ImageIcon(original.getImage().getScaledInstance(75, 75, Image.SCALE_SMOOTH));
            boton.setIcon(icono);
    }
   
   public void loadAvatar(String img)
    {
        System.out.println("La imagen "+(img+1));
        ImageIcon original = new ImageIcon(getClass().getResource("/entrenadores/"+(img)+".png"));
        Icon icono = new ImageIcon(original.getImage().getScaledInstance(65, 121, Image.SCALE_SMOOTH));
        avatar.setIcon(icono);
        
        tuNombre.setText(juego.tuNombre);

    }
   
   public void loadAvatar(String img, JLabel lb)
    {
        System.out.println("La imagen "+(img+1));
        ImageIcon original = new ImageIcon(getClass().getResource("/entrenadores/"+(img)+".png"));
        Icon icono = new ImageIcon(original.getImage().getScaledInstance(65, 121, Image.SCALE_SMOOTH));
        lb.setIcon(icono);
    }
    
//</editor-fold>
    
    void cargar(){
        pregun.setText(juego.pre.preguntas[pregunta][0]);
        resp1.setText(juego.pre.respuestas[pregunta][1]);
        resp2.setText(juego.pre.respuestas[pregunta][2]);
        resp3.setText(juego.pre.respuestas[pregunta][3]);
        resp4.setText(juego.pre.respuestas[pregunta][4]);
        correcta = Integer.parseInt(juego.pre.preguntas[pregunta][1]);
        loadData(pregunta);
    }
    
    public int random(){
        return (int) (Math.random() * 99) + 1;
    }
    
    public int randomOtro(){
        return (int) (Math.random() * 4) + 1;
    }
    
    void correcta(int corr){
        switch(corr){
            case 1:
                resp1.setForeground(Color.orange);
                resp2.setEnabled(false);
                resp3.setEnabled(false);
                resp4.setEnabled(false);
                break;
            case 2:
                resp1.setEnabled(false);
                resp2.setForeground(Color.orange);
                resp3.setEnabled(false);
                resp4.setEnabled(false);
                break;
            case 3:
                resp1.setEnabled(false);
                resp2.setEnabled(false);
                resp3.setForeground(Color.orange);
                resp4.setEnabled(false);
                break;
            case 4:
                resp1.setEnabled(false);
                resp2.setEnabled(false);
                resp3.setEnabled(false);
                resp4.setForeground(Color.orange);
                break;
            case 5:
                resp1.setForeground(Color.green);
                resp1.setEnabled(true);
                break;
            case 6:
                resp2.setForeground(Color.green);
                resp2.setEnabled(true);
                break;
            case 7:
                resp3.setForeground(Color.green);
                resp3.setEnabled(true);
                break;
            case 8:
                resp4.setForeground(Color.green);
                resp4.setEnabled(true);
                break;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        avatar1 = new javax.swing.JLabel();
        miPokemon = new javax.swing.JLabel();
        suPokemon = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        pregun = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        resp1 = new javax.swing.JLabel();
        resp3 = new javax.swing.JLabel();
        resp2 = new javax.swing.JLabel();
        resp4 = new javax.swing.JLabel();
        estado = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        siguiente = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblNivel = new javax.swing.JLabel();
        avatar = new javax.swing.JLabel();
        tuNombre = new javax.swing.JLabel();

        setBackground(new java.awt.Color(254, 254, 254));
        setMaximumSize(new java.awt.Dimension(988, 514));
        setMinimumSize(new java.awt.Dimension(988, 514));
        setPreferredSize(new java.awt.Dimension(988, 514));

        jPanel1.setBackground(new java.awt.Color(148, 255, 243));
        jPanel1.setMaximumSize(new java.awt.Dimension(725, 220));
        jPanel1.setMinimumSize(new java.awt.Dimension(725, 220));

        miPokemon.setMaximumSize(new java.awt.Dimension(75, 75));
        miPokemon.setMinimumSize(new java.awt.Dimension(75, 75));
        miPokemon.setPreferredSize(new java.awt.Dimension(75, 75));

        suPokemon.setMaximumSize(new java.awt.Dimension(75, 75));
        suPokemon.setMinimumSize(new java.awt.Dimension(75, 75));
        suPokemon.setPreferredSize(new java.awt.Dimension(75, 75));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(miPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 402, Short.MAX_VALUE)
                .addComponent(suPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(avatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(miPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(suPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(avatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48))))
        );

        jPanel2.setBackground(new java.awt.Color(254, 254, 254));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Reacción rival", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        pregun.setFont(new java.awt.Font("Cantarell", 2, 19)); // NOI18N
        pregun.setText("Procesando en el procesador...");
        pregun.setToolTipText("");

        jPanel3.setBackground(new java.awt.Color(117, 117, 117));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        resp1.setFont(new java.awt.Font("Cantarell", 3, 16)); // NOI18N
        resp1.setText("Procesando en el procesador...");
        resp1.setToolTipText("");

        resp3.setFont(new java.awt.Font("Cantarell", 3, 16)); // NOI18N
        resp3.setText("Procesando en el procesador...");
        resp3.setToolTipText("");

        resp2.setFont(new java.awt.Font("Cantarell", 3, 16)); // NOI18N
        resp2.setText("Procesando en el procesador...");
        resp2.setToolTipText("");

        resp4.setFont(new java.awt.Font("Cantarell", 3, 16)); // NOI18N
        resp4.setText("Procesando en el procesador...");
        resp4.setToolTipText("");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(resp2, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                    .addComponent(resp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resp4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resp3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resp1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(resp3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resp2)
                    .addComponent(resp4))
                .addGap(30, 30, 30))
        );

        estado.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        estado.setForeground(new java.awt.Color(22, 223, 24));
        estado.setText("Correcta");

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        jLabel1.setText("La espuesta rival es:");

        siguiente.setText("Siguiente");
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(pregun, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(estado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pregun, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(estado))
                        .addGap(30, 30, 30))
                    .addComponent(siguiente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel2.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(235, 120, 29));
        jLabel2.setText("Espera, el oponente");

        jLabel3.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(235, 120, 29));
        jLabel3.setText("esta respondiendo.");

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel4.setText("Nivel:");

        lblNivel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblNivel.setForeground(new java.awt.Color(0, 51, 255));
        lblNivel.setText("-");

        tuNombre.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        tuNombre.setForeground(new java.awt.Color(255, 51, 255));
        tuNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tuNombre.setText("meme");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(10, 10, 10))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblNivel)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(tuNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(avatar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tuNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(lblNivel))
                                .addGap(33, 33, 33))
                            .addComponent(avatar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
        int rs=random();
        switch(step){
            case 0:
                if(rs<=juego.dificultad[juego.nivel]){
                    correcta(correcta);
                    estado.setText("Correcta");
                    estado.setForeground(Color.green); 
                    resp = true;
                    punto = 1;
                }
                else{
                    correcta(otroNumero());
                    estado.setText("Incorrecta");
                    estado.setForeground(Color.red);
                    resp =false;
                    punto=-9;
                }
                    
                step++;
                break;
            case 1:
                estado.setVisible(true);
                correcta(correcta+4);

                step++;
                break;
            case 2:
                if(resp)
                    controlador.agregar("0R");
                else
                    controlador.agregar("XR");
                
                juego.ganador(punto);
                
                responder riv = new responder(pregunta);
        
                riv.setSize(988, 514);
                riv.setLocation(0,0);

                controlador.pane.removeAll();
                controlador.pane.add(riv,BorderLayout.CENTER);
                controlador.pane.revalidate();
                controlador.pane.repaint();
                
                break;
        }
    }//GEN-LAST:event_siguienteActionPerformed

    int otroNumero(){
        int otro;
        switch(correcta){
            case 1:
                otro=randomOtro();
                while(1==otro)
                    otro=randomOtro();
                return otro;
            case 2:
                otro=randomOtro();
                while(2==otro)
                    otro=randomOtro();
                return otro;
            case 3:
                otro=randomOtro();
                while(3==otro)
                    otro=randomOtro();
                return otro;
            case 4:
                otro=randomOtro();
                while(4==otro)
                    otro=randomOtro();
                return otro;
            default:
                otro=randomOtro();
                while(0==otro)
                    otro=randomOtro();
                return otro;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel avatar;
    private javax.swing.JLabel avatar1;
    private javax.swing.JLabel estado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblNivel;
    private javax.swing.JLabel miPokemon;
    private javax.swing.JLabel pregun;
    private javax.swing.JLabel resp1;
    private javax.swing.JLabel resp2;
    private javax.swing.JLabel resp3;
    private javax.swing.JLabel resp4;
    private javax.swing.JButton siguiente;
    private javax.swing.JLabel suPokemon;
    private javax.swing.JLabel tuNombre;
    // End of variables declaration//GEN-END:variables
}
