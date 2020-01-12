/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitoresjava;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author patri
 */
public class HebraProductora implements Runnable{
    public Thread thr;
    Buffer b;
    int id_p;
    
    HebraProductora (Buffer buffer, int id_p){
        this.id_p=id_p;
        b = buffer;
        thr = new Thread (this, "productora " + id_p);
    }
    
    @Override
    public void run() {
        b.producir(id_p);
    }
}
