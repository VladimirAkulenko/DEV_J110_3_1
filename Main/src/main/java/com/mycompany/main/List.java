/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author USER
 */
public class List {
       private Node first;

// добавление значения в список
    public void addNode (Integer variable){
        Node node = new Node(variable);
        if(first == null){
            first=node;
            return;
        }
        Node temp = first;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next =node;
    }

    // добавление значения в начало списка
    public void addBeginningList (Integer variable){
        Node newNode = new Node(variable);
        newNode.date = variable;
        newNode.next = first;
        first =newNode;
    }

    // Извлечение значения из начала списка без его удаления из списка

    public int extractionBeginningList (){
        if (first != null)
            return first.date;
        else
            throw new IllegalArgumentException("Список пуст");
    }
// Извлечение значения из начала списка с удалением из списка
    public int extractionDeleteList () {
        if (first != null) {
            Integer firstDate = first.date;
            first = first.next;
            return firstDate;
        }
        else
            throw new IllegalArgumentException("Список пуст");
    }

    // Добавление значения в конец списка
    public void addEndList (Integer variable){
        Node newNode = new Node(variable);
        if(first == null){
            first=newNode;
            return;
        }
        Node temp = first;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next =newNode;
    }

    //Извлечение значения из конца списка без его удаления
    public int extractionEndList (){
        if (first != null){
            Node temp = first;
            while (temp.next != null){
                temp = temp.next;}
            return temp.date;
            }
        else
            throw new IllegalArgumentException("Список пуст");
    }

    //Извлечение значения из конца списка с удалением
    public int extractionEndDeleteList (){
        if (first != null && first.next == null) {
            Integer firstDate = first.date;
            first = null;
            return firstDate;
        }
        else if(first != null && first.next != null){
            Node temp = first;
            Node tail= first;
            while (temp.next != null){
                tail = temp;
                temp = temp.next;
            }
            Integer newDate = temp.date;
            temp = tail;
            temp.next= null;
            return newDate;
        }
        else
            throw new IllegalArgumentException("Список пуст");
    }

    // Определение, содержит ли список заданное значение, или нет
    public boolean setValueList (Integer variable){
        Node temp = first;
        boolean result = false;
        if(first == null)
            return false;
        else if (temp.next == null){
            return variable.equals(temp.date);
        }
        else
            while (temp.next != null){
                if(variable.equals(temp.date)){
                    result = true;
                    temp = temp.next;
                }
                else
                    temp = temp.next;
            }
        return  result;
    }


    // Определение, является ли список пустым, или нет
    public boolean emptyList (){
        if (first == null)
            System.out.println("Список пуст");
        return first == null;

    }

    // Печать всех значений списка
    public void print() {
        if (first == null) return;
        Node temp = first;
        System.out.println(temp.date);
        while (temp.next != null){
            temp = temp.next;
            System.out.println(temp.date);
        }
    }

    private class Node {
        Integer date;
        Node next;

        Node(Integer variable){
            date = variable;

        }
    }
}
