/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loop.lambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author donow01
 */
public class IteratorIfSamp {

    private List<String> strings;

    public IteratorIfSamp() {
        strings = new ArrayList<>();

        strings.add("honjituhaseitenari");
        strings.add("ohayou");
        strings.add("konnichiha");

    }

    /**
     * 実行
     */
    public void action() {
        IteratorIfSample1();
        IteratorIfSample2();
        IteratorIfSample3();
        IteratorIfSample4();
    }

    /**
     * イテレーターのサンプル(for文)
     */
    private void IteratorIfSample1() {

        for (Iterator<String> i = strings.iterator(); i.hasNext();) {
            String s = (String) i.next();
            if (s.length() > 10) {
                i.remove();
            }
        }
        strings.forEach(s -> System.out.println(s));
    }

    /**
     * イテレーターのサンプル Predicate
     */
    private void IteratorIfSample2() {

        Predicate<String> p = new Predicate<String>() {
            @Override
            public boolean test(String t) {
                return t.length() > 10;
            }

        };

        strings.removeIf(p);
        strings.forEach(s -> System.out.println(s));
    }

    /**
     * イテレーターのサンプル Predicate2
     */
    private void IteratorIfSample3() {
        strings.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String t) {
                return t.length() > 10;
            }
        });
        strings.forEach(s -> System.out.println(s));
    }
    
    
    /**
     * イテレーターのサンプル Predicate2
     */
    private void IteratorIfSample4() {
        strings.removeIf(s -> {return s.length() > 10;});
        strings.forEach(s -> System.out.println(s));
    }

}
