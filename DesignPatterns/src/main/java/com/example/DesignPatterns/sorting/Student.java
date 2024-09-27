package com.example.DesignPatterns.sorting;


import java.util.Comparator;
import java.util.Objects;

public class Student  {

    private int id;

    private String name;

    public Student(){

    }

    public Student(int id,String name){
        this.id=id;
        this.name=name;
    }

    public void setId(int id){
        this.id=id;
    }

    public int getId(){
        return id;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return id == student.id && Objects.equals( name, student.name );
    }

    @Override
    public int hashCode() {
        return Objects.hash( id, name );
    }

    public void setName(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName(){
        return name;
    }


}
