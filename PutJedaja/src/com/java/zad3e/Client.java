package com.java.zad3e;

public class Client implements Comparable<Client> {

    private String name;
    private int age;

    public Client(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Client c1) {
        return this.age - c1.age;
    }

    @Override
    public String toString() {
        return "Client{" +
                "age=" + age +
                '}';
    }
}