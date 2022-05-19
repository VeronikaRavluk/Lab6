package com.company;

public abstract class Transport {
    public double width;
    private double height;
    public double lenght ;
    private double weight;
    private double i;




    public Transport(double width, double height,double lenght ) {
        this.width = width;
        this.height = height;
        this.lenght = lenght;
    }

    public Transport(int width, double weight, double height){
        this.width =  width;
        this.weight = weight;
        this.height = height;


    }
   public void type() {
        double i = width * height * lenght;
        if (i >=2 & i<=10) {
            System.out.println("Легковий автомобіль");
        } else if (i >= 20 & i<=40) {
            System.out.println("Бус" );
        } else if (i >=40 & i <= 90) {
            System.out.println("Вантажівка" );
        }else {
            System.out.println("Ви ввели щось не те");
        }

    }
    public Transport (){
    }

    public void type(double width, double height, double lenght) {
    }


    //get/set//
    public double getLenght(){return lenght;}
    public void setLenght(double lenght){
        this.lenght = lenght;
    }
public double getHeight (){return  height;}
    public void setHeight (double height){
        this.height = height;
    }
    public double getWeight(){return weight;}
    public void setWeight (double weight) {
        this.weight = weight;
    }
    public double getWidth() {return width;}
    public void setWidth( double width){
        this.width = width;}
    public double getI(){return i;}
    public void setI (double i){
        this.i = i;}
}
