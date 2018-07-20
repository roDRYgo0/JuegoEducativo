package javaClass;

import java.util.ArrayList;

public class juego {
    
    private static String correcta;
    private static String pregunta;
    private static String eleccion;
    
    public static String tuNombre;
    public static String nombreRival = "nulo";
    
    public static String tuImagen = "1";
    public static String imagenRival;
    
    public static int cantidadPreguntas = 85;
    public static int noPreguntasUsadas = 0;
    
    public static ArrayList<Integer> preguntasUsadas = new ArrayList<>();
    public static ArrayList<Integer> entrenadoresUsados = new ArrayList<>();
    
    public static boolean muerteSubita=false;
    public static preguntas pre = new preguntas();
    public static int[] puntaje = new int[2];
    public static final int set = 3;
    public static int partido = 0;
    public static int nivel = 0;
    public static int entrenador = 0;
    public static int[] dificultad = {25,40,60,80};
    
    public static void resetear(){
        noPreguntasUsadas = 0;
        preguntasUsadas.clear();
        entrenadoresUsados.clear();
        muerteSubita=false;
        puntaje[0]=0;
        puntaje[1]=0;
        partido = 0;
        nivel = 0;
        entrenador=0;
        controlador.resetearJuego();
    }
    
    public static int nuevoEntrenador(){
        int num, p;
        num = random(9);
        p = entrenadoresUsados.indexOf(num);
        while(p>=0){
            num = random(9);
            p = entrenadoresUsados.indexOf(num);
        }
        entrenadoresUsados.add(num);
        return num;
    }
    
    public static void usarPreguntas(){
        noPreguntasUsadas=0;
        preguntasUsadas.clear();
        System.out.println(preguntasUsadas);
    }
    
    public static int dispPreguntas(){
        int num = 85, p = 0;
        if(noPreguntasUsadas<cantidadPreguntas){
            num = random();
            p = preguntasUsadas.indexOf(num);
            while(p>=0){
                num = random();
                p = preguntasUsadas.indexOf(num);
            }
        }
        return num;
    }
    
    public static int random(){
        return (int) (Math.random() * juego.cantidadPreguntas);
    }
    
    public static int random(int n){
        return (int) (Math.random() * n)+1;
    }

    public static boolean comprobar(){
        return eleccion.equals(correcta);
    }
    
    public static int ganador(int p){
        int estado = -1;
        
        if(p==0)
            puntaje[0]++;
        else if(p==1)
            puntaje[1]++;
        
        
        if(partido >= set){
            if(puntaje[0]>puntaje[1])
                estado= 0;
            else if(puntaje[1]>puntaje[0])
                estado=1;
            else
                estado =-2;
        }
        else if(puntaje[0]==set || puntaje[1]==set){
            if(puntaje[0]!=puntaje[1]){
                if(p==0)
                    estado= 0;
                else if(p==1)
                    estado=1;   
            }
        }
        else
            estado= -1;
        return estado;
    }

    //<editor-fold defaultstate="collapsed" desc="Getter and Setter">
    public static String getCorrecta() {
        return correcta;
    }

    public static void setCorrecta(String correcta) {
        juego.correcta = correcta;
    }

    public static String getPregunta() {
        return pregunta;
    }

    public static void setPregunta(String pregunta) {
        juego.pregunta = pregunta;
    }

    public static String getEleccion() {
        return eleccion;
    }

    public static void setEleccion(String eleccion) {
        juego.eleccion = eleccion;
    }

//</editor-fold>
}
