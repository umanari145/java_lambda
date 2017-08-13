/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loop.lambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author donow01
 */
public class IteratorSamp {
    
    
    private List<String> fruits;
    
    
    public IteratorSamp() {
        fruits = new ArrayList<>();

        fruits.add("りんご");
        fruits.add("みかん");
        fruits.add("キウイ");

    }
    
    /**
     * イテレーターのサンプル
     */
    public void IteratorSample1() {
        
        Iterator<String> i = fruits.iterator();
        while(i.hasNext()){
            String f = (String)i.next();
            System.out.println(f);
        }
    }
    
    /**
     * イテレーターのサンプル(for文)
     */
    public void IteratorSample2() {
        
        for(Iterator<String> i = fruits.iterator();i.hasNext();){
            String f = (String)i.next();
            System.out.println(f);
        }
    }
}
