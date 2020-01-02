/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaphorejava;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import static semaphorejava.HebraConsumidora.ANSI_BLACK;
import static semaphorejava.HebraConsumidora.ANSI_RED;
import static semaphorejava.HebraConsumidora.ANSI_RESET;
import static semaphorejava.HebraConsumidora.ANSI_YELLOW;

/**
 *
 * @author patri
 */
public class Buffer {
    
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_RESET = "\u001B[0m";    
    
    Integer buffer [];
    Semaphore mutex, vacio, lleno;
    int num_heb_prod, salida, num_heb_cons, entrada, terminan_cons, terminan_prod;
    
    Buffer(int num_heb_cons, int terminan_cons,int salida, int num_heb_prod, int terminan_prod, int entrada, int tamanio_buffer){
        this.buffer = new Integer [tamanio_buffer];
        for(int i = 0; i<tamanio_buffer;i++){
            buffer[i]=0;
        }
        
        vacio = new Semaphore(buffer.length);
        mutex = new Semaphore(1);
        lleno = new Semaphore(0);
        this.num_heb_cons = num_heb_cons;
        this.terminan_cons = terminan_cons;
        this.salida = salida;
        this.num_heb_prod = num_heb_prod;
        this.terminan_prod = terminan_prod;
        this.entrada = entrada;
        
    }
    
    public void consumir(int id_c){
        do{
            try {
                lleno.acquire();
                mutex.acquire();
                if(id_c==num_heb_cons){
                    id_c=0;
                }
                int item = 0;
                buffer[salida] = item;
                System.out.println("");
                System.out.print(ANSI_YELLOW + "HebraConsumidora " + id_c + " consume en posición " + salida + ANSI_RESET);
                System.out.print(ANSI_BLACK + " Buffer{" + ANSI_RESET);
                for(int i = 0; i<buffer.length;i++){
                        if(i != salida){
                            if(i!=buffer.length-1)
                                System.out.print(ANSI_BLACK + buffer[i] + " " + ANSI_RESET);
                            else 
                                System.out.print(ANSI_BLACK + buffer[i] + ANSI_RESET);
                        }else{
                            if(i!=buffer.length-1)
                                System.out.print(ANSI_RED + buffer[i] + " " + ANSI_RESET);
                            else 
                                System.out.print(ANSI_RED + buffer[i] + ANSI_RESET);
                        } 
                }
                System.out.print(ANSI_BLACK + "}" + ANSI_RESET);
                salida = (salida+1) % buffer.length;
                id_c++;
                mutex.release();
                vacio.release();
            } catch (InterruptedException ex) {
                Logger.getLogger(HebraProductora.class.getName()).log(Level.SEVERE, null, ex);
            }
        }while (terminan_cons == 0);       
    }
    
    public void producir(int id_p){
        do{
            try {
                vacio.acquire();
                mutex.acquire();
                if(id_p==num_heb_prod){
                    id_p=0;
                }
                int item = 1;
                buffer[entrada] = item;
                System.out.println("");
                System.out.print(ANSI_PURPLE + "HebraProductora " + id_p + " produce en posición " + entrada + ANSI_RESET);
                System.out.print(ANSI_BLACK + " Buffer {" + ANSI_RESET);
                for(int i = 0; i<buffer.length;i++){
                        if(i != entrada){
                            if(i!=buffer.length-1)
                                System.out.print(ANSI_BLACK + buffer[i] + " " + ANSI_RESET);
                            else 
                                System.out.print(ANSI_BLACK + buffer[i] + ANSI_RESET);
                        }else{
                            if(i!=buffer.length-1)
                                System.out.print(ANSI_GREEN + buffer[i] + " " + ANSI_RESET);
                            else 
                                System.out.print(ANSI_GREEN + buffer[i] + ANSI_RESET);
                        } 
                }
                System.out.print(ANSI_BLACK + "}" + ANSI_RESET);
                entrada = (entrada+1) % buffer.length;
                id_p++;
                mutex.release();
                lleno.release();
            } catch (InterruptedException ex) {
                Logger.getLogger(HebraProductora.class.getName()).log(Level.SEVERE, null, ex);
            }
        }while (terminan_prod == 0);    
    }
}
