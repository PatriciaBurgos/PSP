/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaphorejava;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author patri
 */
public class HebraConsumidora implements Runnable{
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_RESET = "\u001B[0m";

    //TENGO QUE HACER UN ARRAY DE HEBRAS; QUITAR EL NUMERO DE HEBRAS
    public Thread thr;
    Buffer b;
    int id_c;
    
    HebraConsumidora (Buffer buffer, int id_c){
        // TODO NOSE SI ES MEJOR COPIAR EL BUFFER O NO HACER NADA
        // TODO NO SE SI PONER EL NEW

        
        //this.buffer = new Integer [buffer.length];
        //for(int i = 0; i< buffer.length; i++){
        ///    this.buffer[i]=buffer[i];
        //}
        this.id_c=id_c;
        b = buffer;
        thr = new Thread (this, "consumidora " + id_c);
    // TODO A LO MEJOR NO HACE FALTA EL ID_C SI HAY ALGUN METODO QUE DIGA EL NOMBRE DE LA HEBRA
    }
    
    @Override
    public void run() {        
        b.consumir(id_c);
    }    
}
