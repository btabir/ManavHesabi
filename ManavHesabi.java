package Hesaplamalar;

import java.util.Scanner;

public class ManavHesabi {
    public static void main(String[] args) {

        double armut,elma,domates,muz,patlican;

        Scanner input=new Scanner(System.in);

        System.out.println("Kac Kilo Armut Aldiniz ? : ");
        armut= input.nextDouble();

        System.out.println("Kac Kilo Elma Aldiniz ? : " );
        elma= input.nextDouble();

        System.out.println("Kac Kilo Domates Aldiniz ? : ");
        domates= input.nextDouble();

        System.out.println("Kac Kilo Muz Aldiniz ? : ");
        muz= input.nextDouble();

        System.out.println("Kac Kilo Patlican Aldiniz ? : ");
        patlican= input.nextDouble();

        double toplam;
        toplam=(armut*2.14+elma*3.67+domates*1.11+muz*0.95+patlican*5.00);
        System.out.println("Toplam Odemeniz Gereken Tutar : " + toplam + " TL");


    }
}
