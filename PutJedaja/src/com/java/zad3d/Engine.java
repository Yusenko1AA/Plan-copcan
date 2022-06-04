package com.java.zad3d;
// Двигатель
public class Engine {
    private String Enginetype;
    private double volume;
    private int HP;

    public Engine(String enginetype, double volume, int HP) {
        Enginetype = enginetype;
        this.volume = volume;
        this.HP = HP;
    }

    public String getEnginetype() {
        return Enginetype;
    }

    public double getVolume() {
        return volume;
    }

    public int getHP() {
        return HP;
    }

    // public void showEngine(){
    // System.out.println(Enginetype + volume + HP);
    // }
}
