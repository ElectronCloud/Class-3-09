/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo2;

/**
 *
 * @author Estudiante
 */
import java.util.*;
public class PruebaLibro {
    
    public static void main(String[] args) {
        //Dependencia
        Scanner entrada = new Scanner(System.in);
        boolean continuar = false;
        int opcion = -1;
        String name="";
        String autor="";
        int pages;
        float califi;
        ConjuntoLibro conjunto = new ConjuntoLibro();
        
        System.out.println("Bienvenido a Biblioteca"); 
        do{
            System.out.println("1. Ingresar Libro");
            System.out.println("2. Listar Libros");
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1:
                     
                    System.out.println("Ingrese nombre");
                    name=entrada.next();
                    
                    System.out.println("Ingrese Autor");
                    autor=entrada.next();
                    System.out.println("ingrese Numero Paginas");
                    pages=entrada.nextInt();
                    System.out.println("Ingrese calificacion");
                    califi=entrada.nextFloat();
                    
                    Libro libro=new Libro(name,autor,califi,pages);
                    conjunto.anadirLibro(libro);
                    break;
                case 2: 
                    conjunto.obtenerTodosLibros();
                    System.out.println(conjunto.obtenerTodosLibros());
                      //Listar
                      //Solicitar los libros a la coleccion
                      //Imprimir los libros
                    
                     break;
                default:
                    System.out.println("Opcion Invalida");
            }
            
            System.out.println("Desea continuar");
            continuar = entrada.nextBoolean();
        }while(continuar);
          
        
    }
}
