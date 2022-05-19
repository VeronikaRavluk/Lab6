package com.company;

public class Main {

    public static void main(String[] args) {
	 Transport tf = new Transport(2.5, 2, 2) {
     };
     //System.out.println( "Ширина :" + tf.width + "т. Висота" + tf.height + "Довжина " + tf.lenght );
     tf.type();


     Carwash tr = new Carwash(70,5,5);
     //System.out.println("Автомийка. Вода:" + tr.water + "л. Миючий засіб :" + tr.detergent + "л. Кількість машин :" + tr.car);
     tr.number();

     Carage ln = new Carage(20,4,25.5);
     //System.out.println("Гараж. Ширина: " + ln.wight + "м. Висота" + ln.height + "м.Довжина" + ln.lenght );
     ln.square();
        ln.perimeter(2);


     Painting truck = new Painting(3,2,2);
     truck.setPaint();
    }
}
