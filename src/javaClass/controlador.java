package javaClass;

import javax.swing.JPanel;
import juego.educativo.rootPane;

public class controlador {

    public static rootPane rootPane;
    public static JPanel pane;

    public static void iniciar(rootPane root, JPanel pan){
        rootPane = root;
        pane = pan;
    }
    
    public static void agregar(String g){
        rootPane.agregar(g);
    }
    
    public static void resetear(){
        rootPane.resetear();
    }
    
    public static void resetearJuego(){
        rootPane.resetearJuego();
    }
    
}
