package com.LinkedList;

public class Student {
    String name;

    public Student(String name){
        this.name=name;
    }
    public static void main(String[] args){
        Student s=new Student("Sam");
        System.out.println(s.name);
    }

}