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
public class IteratorLoopSamp {

    private List<String> fruits;

    public IteratorLoopSamp() {
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
    private void IteratorSample1() {

        Iterator<String> i = fruits.iterator();
        while (i.hasNext()) {
            String f = (String) i.next();
            System.out.println(f);
        }
    }

    /**
     * イテレーターのサンプル(for文)
     */
    private void IteratorSample2() {

        for (Iterator<String> i = fruits.iterator(); i.hasNext();) {
            String f = (String) i.next();
            System.out.println(f);
        }
    }

    /**
     * イテレーターのサンプル(拡張for文)
     */
    private void IteratorSample3() {

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }

    /**
     * イテレーターのサンプル(匿名クラス1)
     */
    private void IteratorSample4() {

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
    private void IteratorSample5() {

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
    private void IteratorSample6() {

        fruits.forEach(
                (String s) -> {
                    System.out.println(s);
                }
        );
    }
    
    /**
     * イテレーターのサンプル(ラムダ式)
     */
    private void IteratorSample7() {

        fruits.forEach(s -> System.out.println(s));
    }

}
