package org.example;

public class People {
    String name;
    int age;
    public People(String name,int age){
        this.name=name;
        this.age=age;
    }
    @Override
    public String toString(){
        return name+" "+age;
    }
}
