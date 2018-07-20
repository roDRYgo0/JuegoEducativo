package paneles;

import java.awt.BorderLayout;
import java.awt.Image;
import javaClass.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public final class preguntar extends javax.swing.JPanel {

    int[] ataques;
    int moderador = 0;
    int suPo;
    preguntas pre = new preguntas();
    
    public preguntar() {
        initComponents();
        ataques = new int[4];
        juego.partido++;
        suPo = random()+1;
        System.out.println(suPo+" esta mamada es");
        lblNivel.setText((juego.nivel+1)+"");
        loadData(suPo,suPokemon);
        loadAvatar(juego.tuImagen);
        loadAvatar(juego.entrenador+"", avatar1);
        seleccionar();
        validar();
        asignar();
    }
    
    public preguntar(int suPoke) {
        initComponents();
        ataques = new int[4];
        juego.partido++;
        lblNivel.setText((juego.nivel+1)+"");
        suPo=suPoke;
        loadSuPokemon(suPoke);
        loadAvatar(juego.tuImagen);
        loadAvatar(juego.entrenador+"", avatar1);
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
                numero=85;
                break;
            }
            moderador++;
        }
            
        ataques[1] = numero;
        
        numero = juego.dispPreguntas();
        while(ataques[0] == numero || ataques[1] == numero){
            numero = juego.dispPreguntas();
            if(moderador >= 50){
                numero=85;
                break;
            }
            moderador++;
        }
        ataques[2]=numero;
        
        numero = juego.dispPreguntas();
        while(ataques[0] == numero || ataques[1] == numero || ataques[2] == numero){
            numero = juego.dispPreguntas();
            if(moderador >= 50){
                numero=85;
                break;
            }
            moderador++;
        }
        ataques[3] = numero;
    }
    
    public int random(){
        return (int) (Math.random() * juego.cantidadPreguntas)+1;
    }
    
    void siguiente(int pre){
        rival riv = new rival(pre, suPo);
        
        riv.setSize(988, 514);
        riv.setLocation(0,0);
        
        controlador.pane.removeAll();
        controlador.pane.add(riv,BorderLayout.CENTER);
        controlador.pane.revalidate();
        controlador.pane.repaint();
    }
    
    //<editor-fold defaultstate="collapsed" desc="load">
    public void loadSuPokemon(int img)
    {
        System.out.println("La imagen "+(img+1));
        ImageIcon original = new ImageIcon(getClass().getResource("/imagenes/"+(img)+".png"));
        Icon icono = new ImageIcon(original.getImage().getScaledInstance(75, 75, Image.SCALE_SMOOTH));
        suPokemon.setIcon(icono);
    }
    
    public void loadData(int img, JButton boton)
    {
        System.out.println("La imagen "+(img));
        if(img != 85){
            ImageIcon original = new ImageIcon(getClass().getResource("/imagenes/"+(img+1)+".png"));
            Icon icono = new ImageIcon(original.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
            boton.setIcon(icono);
        }
    }

    public void loadData(int img, JLabel boton)
    {
        System.out.println("La imagen "+(img));
        if(img != 85){
            ImageIcon original = new ImageIcon(getClass().getResource("/imagenes/"+(img)+".png"));
            Icon icono = new ImageIcon(original.getImage().getScaledInstance(75, 75, Image.SCALE_SMOOTH));
            boton.setIcon(icono);
        }
    }
    
    public void loadAvatar(String img)
    {
        System.out.println("La imagen mala "+(img));
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
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        avatar1 = new javax.swing.JLabel();
        suPokemon = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnAtaque2 = new javax.swing.JButton();
        btnAtaque1 = new javax.swing.JButton();
        btnAtaque3 = new javax.swing.JButton();
        btnAtaque4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
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

        suPokemon.setMaximumSize(new java.awt.Dimension(75, 75));
        suPokemon.setMinimumSize(new java.awt.Dimension(75, 75));
        suPokemon.setPreferredSize(new java.awt.Dimension(75, 75));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(527, Short.MAX_VALUE)
                .addComponent(suPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(avatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(avatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );

        jPanel2.setBackground(new java.awt.Color(254, 254, 254));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pokemones disponibles", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        btnAtaque2.setBackground(new java.awt.Color(101, 101, 101));
        btnAtaque2.setFont(new java.awt.Font("Cantarell", 1, 11)); // NOI18N
        btnAtaque2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eye.png"))); // NOI18N
        btnAtaque2.setText("Not found");
        btnAtaque2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtaque2ActionPerformed(evt);
            }
        });

        btnAtaque1.setBackground(new java.awt.Color(101, 101, 101));
        btnAtaque1.setFont(new java.awt.Font("Cantarell", 1, 11)); // NOI18N
        btnAtaque1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eye.png"))); // NOI18N
        btnAtaque1.setText("Not found");
        btnAtaque1.setAutoscrolls(true);
        btnAtaque1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtaque1ActionPerformed(evt);
            }
        });

        btnAtaque3.setBackground(new java.awt.Color(101, 101, 101));
        btnAtaque3.setFont(new java.awt.Font("Cantarell", 1, 11)); // NOI18N
        btnAtaque3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eye.png"))); // NOI18N
        btnAtaque3.setText("Not found");
        btnAtaque3.setBorderPainted(false);
        btnAtaque3.setFocusPainted(false);
        btnAtaque3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtaque3ActionPerformed(evt);
            }
        });

        btnAtaque4.setBackground(new java.awt.Color(101, 101, 101));
        btnAtaque4.setFont(new java.awt.Font("Cantarell", 1, 11)); // NOI18N
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
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAtaque1, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                    .addComponent(btnAtaque3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAtaque2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(244, 25, 13));
        jLabel1.setText("Selecciona el pokemon");

        jLabel2.setFont(new java.awt.Font("Cantarell", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(244, 25, 13));
        jLabel2.setText("para atacar.");

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel3.setText("Nivel:");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(0, 22, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tuNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(lblNivel))
                                .addGap(33, 33, 33))
                            .addComponent(avatar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtaque2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtaque2ActionPerformed
        siguiente(ataques[1]);
        juego.noPreguntasUsadas++;
        juego.preguntasUsadas.add(ataques[1]);
    }//GEN-LAST:event_btnAtaque2ActionPerformed

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
    private javax.swing.JLabel avatar;
    private javax.swing.JLabel avatar1;
    private javax.swing.JButton btnAtaque1;
    private javax.swing.JButton btnAtaque2;
    private javax.swing.JButton btnAtaque3;
    private javax.swing.JButton btnAtaque4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblNivel;
    private javax.swing.JLabel suPokemon;
    private javax.swing.JLabel tuNombre;
    // End of variables declaration//GEN-END:variables
}
