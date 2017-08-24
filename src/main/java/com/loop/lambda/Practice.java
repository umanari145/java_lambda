/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loop.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *
 * @author donow01
 */
public class Practice {

    List<Student> students;

    public Practice() {
        students = new ArrayList<>();

        students.add(new Student("tarou", 23, "hoge@gmail.com", Pref.TOKYO));
        students.add(new Student("jirou", 33, "foo@hotmail.com", Pref.KANAGAWA));
        students.add(new Student("saburou", 26, "bar@yahoo.co.jp", Pref.CHIBA));
        students.add(new Student("shirou", 43, "aaa@exampl.com", Pref.TOKYO));
        students.add(new Student("gorou", 63, "bbb@gmail.com", Pref.TOKYO));

    }

    public void action() {
        Sample1();
        Sample2();
        Sample3();
        Sample4();
        // Sample5();

    }

    /**
     * IntStreamの活用
     */
    public void Sample1() {
        IntStream.rangeClosed(1, 10) //1～10までのIntStream
                .filter(i -> i % 2 == 0) //偶数に対して
                .forEach(s -> System.out.println(s));
    }

    /**
     * Streamの活用
     */
    public void Sample2() {
        students.stream()
                .map(s -> s.getName() + s.getAge().toString())
                .forEach(s -> System.out.println(s));
    }

    /**
     * 最大値最小値の活用
     */
    public void Sample3() {
        OptionalInt maxVal = students.stream()
                .mapToInt(s -> s.getAge())
                .max();

        maxVal.ifPresent(a -> System.out.print(a));
    }

    /**
     * filter & 元に戻す
     */
    public void Sample4() {

        List<Student> stundents2 = students.stream()
                .filter(s -> s.getAge() >= 30)
                .collect(Collectors.toList());

        stundents2.stream().forEach(s -> System.out.println(s.getName() + s.getAge()));
    }

    /**
     * groupBy
     */
    public void Sample5() {

        Map<Pref, List<Student>> stundents2 = students.stream()
                .collect(Collectors.groupingBy(s -> s.getPref()));

        System.out.print("この上でdebug");
    }

    /**
     * groupBy + avg
     */
    public void Sample6() {

        students.stream()
                .collect(Collectors.groupingBy(s -> s.getPref()))
                .forEach((p, l) -> {
                    System.out.println(p);
                    l.stream().forEach(s -> System.out.println(s.getName() + s.getEmail() + s.getAge()));
                    System.out.println();
                });
    }

    /**
     * groupBy + avg
     */
    public void Sample7() {

        students.stream()
                .collect(Collectors.groupingBy(s -> s.getPref()))
                .forEach((p, l) -> {
                    System.out.println(p);
                    Student s = l.stream().max(Comparator.comparing(Student::getAge)).get();
                    System.out.print(s.getName() + s.getAge());
                    System.out.println();
                });
    }
    
    /**
     *  scopeについて
     */
    public void Sample8() {
        
        List<String> studentsNameList = new ArrayList<>();
        String[] arr = {"tarou","jirou"};
        studentsNameList.addAll(Arrays.asList(arr));   
        
        students.stream()
                //stundentNameListをとることができる
                .filter(s -> studentsNameList.contains(s.getName()))
                .forEach((s) -> {
                    System.out.println(s.getName());
                });
    }
    
    /**
     *  scopeについて その2
     */
    public void Sample9() {
        
        List<String> studentsNameList = new ArrayList<>();
        String[] arr = {"tarou","jirou"};
        studentsNameList.addAll(Arrays.asList(arr));   
        
        students.stream()
                .forEach((s) -> {
                    if (studentsNameList.contains(s.getName())) {
                        System.out.println(s.getName());
                    }
                });
    }

    
    /**
     *  scopeについて その3
     */
    public void Sample10() {
    
        List<String> studentsNameList = new ArrayList<>();
        String[] arr = {"tarou","jirou"};
        studentsNameList.addAll(Arrays.asList(arr));   
        
        List<Student> students2 = new ArrayList<>();
        students.stream()
                .forEach((s) -> {
                    if (studentsNameList.contains(s.getName())) {
                        students2.add(s);
                    }
                });
        
        students2.stream().forEach(s -> System.out.println(s.getName()));
    }

}
