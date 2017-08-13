/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loop.lambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

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
     * 実行
     */
    public void action() {
        IteratorSample1();
        IteratorSample2();
        IteratorSample3();
        IteratorSample4();
        IteratorSample5();
        IteratorSample6();
        IteratorSample7();
    }

    /**
     * イテレーターのサンプル
     */
    public void IteratorSample1() {

        Iterator<String> i = fruits.iterator();
        while (i.hasNext()) {
            String f = (String) i.next();
            System.out.println(f);
        }
    }

    /**
     * イテレーターのサンプル(for文)
     */
    public void IteratorSample2() {

        for (Iterator<String> i = fruits.iterator(); i.hasNext();) {
            String f = (String) i.next();
            System.out.println(f);
        }
    }

    /**
     * イテレーターのサンプル(拡張for文)
     */
    public void IteratorSample3() {

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }

    /**
     * イテレーターのサンプル(匿名クラス1)
     */
    public void IteratorSample4() {

        Consumer<String> action = new Consumer<String>() {
            @Override
            public void accept(String t) {
                System.out.println(t);
            }
        };

        fruits.forEach(action);
    }

    /**
     * イテレーターのサンプル(匿名クラス2)
     */
    public void IteratorSample5() {

        fruits.forEach(
                new Consumer<String>() {
                    @Override
                    public void accept(String t) {
                        System.out.println(t);
                    }
                }
        );
    }

    /**
     * イテレーターのサンプル(ラムダ式)
     */
    public void IteratorSample6() {

        fruits.forEach(
                (String s) -> {
                    System.out.println(s);
                }
        );
    }
    
        /**
     * イテレーターのサンプル(ラムダ式)
     */
    public void IteratorSample7() {

        fruits.forEach(s -> System.out.println(s));
    }

}
