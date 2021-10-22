/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafiothreads;
import java.time.Instant;

/**
 *
 * @author mathn
 */
public class DesafioThreads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         try {
            for (int i=0; i<10;i++){
                LoggerSystem.getInstance().geraLogger(String.valueOf(i));
                Thread.sleep(1000);
            }
        } catch (InterruptedException ex) {
            LoggerSystem.getInstance().geraLogger(ex.toString());
        }
    }
    
}
