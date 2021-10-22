/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafiothreads;

import java.util.logging.Logger;

/**
 *
 * @author mathn
 */
public class LoggerSystem {
    private static LoggerSystem instance; 
    static Logger logger = Logger.getLogger(LoggerSystem.class.getName());

    private LoggerSystem() {
        
    }
    
    public void geraLogger(String value) {
        logger.info(value);
    }

    public static LoggerSystem getInstance() {
        if (instance == null) {
            instance = new LoggerSystem();
        }
        return instance;
    }
}
