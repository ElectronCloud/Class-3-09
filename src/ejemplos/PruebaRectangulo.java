/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

/**
 *
 * @author Estudiante
 */
public class PruebaRectangulo {
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(10,10);
        System.out.println(r1.calcularArea());
        System.out.println(r1.calcularPerimetro());
    
        Rectangulo r2 = new Rectangulo(5,5);
        System.out.println(r2.calcularArea());
        System.out.println(r2.calcularPerimetro());
    
    }
    
}
