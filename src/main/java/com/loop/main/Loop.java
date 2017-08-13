/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loop.main;

import com.loop.lambda.IteratorSamp;

/**
 *
 * @author donow01
 */
public class Loop {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Loop loop = new Loop();
        loop.start();
    }
    
    public Loop() {
        
    }
    
    private void start(){
        IteratorSamp iteSamp = new IteratorSamp();
        iteSamp.action();
    }
}
