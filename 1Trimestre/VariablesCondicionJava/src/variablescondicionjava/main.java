/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variablescondicionjava;

/**
 *
 * @author patri
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
         int tamanio_buffer, num_hebras_prod, num_hebras_cons;
        int terminan_prod, terminan_cons;
        int entrada, salida;
        
        tamanio_buffer = Integer.parseInt(args[0]);
        num_hebras_prod = Integer.parseInt(args[1]);
        terminan_prod = Integer.parseInt(args[2]);
        num_hebras_cons = Integer.parseInt(args[3]);
        terminan_cons = Integer.parseInt(args[4]);
        
        System.out.println("Tamanio_buffer = " + tamanio_buffer + "; Num_hebras_prod = " + num_hebras_prod + "; Terminan_prod = " + terminan_prod + "; Num_hebras_cons = " + num_hebras_cons + "; Terminan_ cons = " + terminan_cons );
                
        entrada = 0;
        salida = 0;
        
        Buffer b = new Buffer(num_hebras_cons,terminan_cons,salida,num_hebras_prod,terminan_prod,entrada,tamanio_buffer);
         
        HebraProductora  hp [] = new HebraProductora [num_hebras_prod];
        HebraConsumidora hc [] = new HebraConsumidora [num_hebras_cons];
        
        for(int i = 0; i<num_hebras_prod; i++){
            hp[i] = new HebraProductora(b,i);
            hp[i].thr.start();
        }
        for(int i = 0; i<num_hebras_cons; i++){
            hc[i] = new HebraConsumidora(b,i);
            hc[i].thr.start();
        }
        
        for(int i = 0; i<num_hebras_prod; i++){
            hp[i].thr.join();
        }
        for(int i = 0; i<num_hebras_cons; i++){
            hc[i].thr.join();
        }
    }
    
}
