package com.company;

public class Carage {
    private double wight;
    private double height;
    private double lenght;

public Carage(double wight, double height, double lenght) {
    this.wight = wight;
    this.height = height;
    this.lenght = lenght;

}
    public Carage(double i){
    wight = lenght = i;
    //перевизначений конструктор
}
    void perimeter() {
    double p = 2 * (lenght+ wight);
    System.out.println(p);}
    // перевизначений метод, що повертає знач. периметру
    void perimeter(double v) {
    double p = v * (lenght + wight);
    System.out.println("Переметер: "+ p);
        }

public Carage(){
    //не приймає жодних параметрів
}
void square (){
    double sq = wight * lenght;
    System.out.println("Площа гаражу: " + sq );

}
//get/set//
    public double getWight(){return wight;}
    public void setWight(double wight){
        this.wight = wight;
    }
    public double getHeight(){return height;}
    public void setHeight(double height){
    this.height = height;
    }
    public double getLenght(){return lenght;}
    public void setLenght (double lenght){
        this.lenght = lenght;
    }
}


