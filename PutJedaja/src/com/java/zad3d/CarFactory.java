/*
package com.java.zad3d;
// Мэйн-класс. Здесь всё сводится воедино.


public class CarFactory {
    public static void main(String[] args) {
        Director director = new Director();
        // Директор получает объект конкретного строителя от клиента
        // (приложения). Приложение само знает какой строитель использовать,
        // чтобы получить нужный продукт.
        CarBuilder builder = new CarBuilder();
        director.constructCOUPE(builder);
        // Готовый продукт возвращает строитель, так как Директор чаще всего не
        // знает и не зависит от конкретных классов строителей и продуктов.
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());
        System.out.println("Материал шасси:\n" + car.getChassis());
        System.out.println("Тип трансмиссии:\n" + car.getTransmission());
        System.out.println("Объём двигателя:\n" + car.getEngine());
        System.out.println("Цвет кузова:\n" + car.getBody());
    }
}
*/