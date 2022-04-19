/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.main;

/**
 *
 * @author USER
 */
public class Main {

    public static void main(String[] args) {
       List list = new List();
    list.addNode(1);
    list.addNode(2);
    list.addNode(3);
    list.addBeginningList(14);
    list.print();

        System.out.println( "Первое значение = " + list.extractionBeginningList());

        list.extractionDeleteList();
        list.print();
        list.addEndList(22);
        list.print();
        System.out.println( "Последнее значение = " + list.extractionEndList());
        list.emptyList();
        System.out.println();
        list.extractionEndDeleteList();
        list.print();
        System.out.println(list.setValueList(4)); 
    }
}
