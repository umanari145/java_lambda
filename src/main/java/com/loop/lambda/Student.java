/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loop.lambda;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author donow01
 */
public class Student {

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private Integer age;

    @Getter
    @Setter
    private String email;

    @Getter
    @Setter
    private Pref pref;

    public Student() {

    }

    public Student(String name, Integer age, String email, Pref pref) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.pref = pref;
    }
    
}

enum Pref {

    TOKYO,
    KANAGAWA,
    CHIBA;
}
