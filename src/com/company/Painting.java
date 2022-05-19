package com.company;

public class Painting extends Transport {

    public Painting(double width, double weight, double height) {
        super(width, weight, height);
    }

    @Override
    public void type(double width, double height, double lenght) {
        super.type(width, height, lenght);
        System.out.println("Наш другий метод");
    }


    public void setPaint() {
        double i = width + lenght + getWeight();
        if (i > 4 && i < 7.5) {
            System.out.println("При покрасці автомобіля буде використано ~3 літри краски");
        } else if (i > 25 && i < 32) {
            System.out.println("При покрасці буса буде використано ~7 літри краски");
        } else if (i > 80 && i < 90) {
            System.out.println("При покрасці вантажівки буде використано ~15 літри краски");
        } else {
            System.out.println("Ви ввели щось не те:" + i);
        }
    }
}


