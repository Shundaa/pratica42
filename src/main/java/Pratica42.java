
import utfpr.ct.dainf.if62c.pratica.Circulo;
import utfpr.ct.dainf.if62c.pratica.Elipse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Pratica42 {
    public static void main(String[] args) {
        Elipse maroto =new Elipse (2,5);
        Circulo maroto2 =new Circulo (7);
        
        System.out.println(maroto.getArea());
        System.out.println(maroto.getPerimetro());
        System.out.println(maroto2.getArea());
        System.out.println(maroto2.getPerimetro());
        System.out.println(maroto2.getEixoMenor());
        System.out.println(maroto.getEixoMenor());
        System.out.println(maroto.getEixoMaior());
    }
    
}

