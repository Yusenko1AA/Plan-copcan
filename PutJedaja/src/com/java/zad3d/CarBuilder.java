/*
package com.java.zad3d;

//Конкретные строители реализуют шаги, объявленные в общем интерфейсе.

public class CarBuilder implements Builder {
    private CarType type;
    private Chassis chassis;
    private Transmission transmission;
    private Engine engine;
    private Body body;

    public void setCarType(CarType type){
        this.type = type;
    }
    @Override
    public void setChassis(Chassis chassis){
        this.chassis = chassis;
    }
    @Override
    public void setTransmission(Transmission transmission){
        this.transmission = transmission;
    }
    @Override
    public void setEngine(Engine engine){
        this.engine = engine;
    }
    @Override
    public void setBody(Body body){
        this.body = body;
    }

    public Car getResult() {
        return new Car(type, chassis, transmission, engine, body);
    }
}
*/