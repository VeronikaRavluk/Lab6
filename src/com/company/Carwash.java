package com.company;

public class Carwash {
    private int water;
    private int detergent;
    private int car;

public Carwash(int water, int detergent, int car){
    this.water = water;
    this.detergent = detergent;
    this.car = car;
}
 public Carwash(int i ){
    water = detergent = car = i;
}
 public Carwash(){
//перевизначений конструктор
}
void number(){
    int nb = (water + detergent)/ car;
    System.out.println("Співідношення миючого засобу і води на одну машину:" + nb);

}
    //get/set//
    public double getWater(){return water;}
    public void setWater(int water){
        this.water = water;
    }
    public double getDetergent (){return detergent;}
    public void setDetergent(int detergent){
        this.detergent = detergent;
    }
    public double getCar (){return car;}
    public void setCar (int car ){
        this.car = car;
    }
}
