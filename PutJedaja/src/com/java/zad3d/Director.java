/*
package com.java.zad3d;
//Директор знает в какой последовательности заставлять работать строителя.
//Он работает с ним через общий интерфейс Строителя. Из-за этого,
//он может не знать какой конкретно продукт сейчас строится.
public class Director {
    public void constructSUV(Builder builder){
        builder.setCarType(CarType.SUV);
        builder.setChassis(Chassis.STEEL);
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setEngine(new Engine("Бензин",3.0,195));
        builder.setBody(new Body("Белый"));
    }

    public void constructHATCHBACK(Builder builder){
        builder.setCarType(CarType.HATCHBACK);
        builder.setChassis(Chassis.ALUMINIUM);
        builder.setTransmission(Transmission.MANUAL);
        builder.setEngine(new Engine("Дизель",2.0,125));
        builder.setBody(new Body("Красный"));
    }

    public void constructCOUPE(Builder builder){
        builder.setCarType(CarType.COUPE);
        builder.setChassis(Chassis.CARBON);
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setEngine(new Engine("Бензин",4.0,625));
        builder.setBody(new Body("Синий"));
    }

    public void constructorSEDAN(Builder builder){
        builder.setCarType(CarType.SEDAN);
        builder.setChassis(Chassis.STEEL);
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setEngine(new Engine("Бензин",2.5,170));
        builder.setBody(new Body("Черный"));
    }
}
*/