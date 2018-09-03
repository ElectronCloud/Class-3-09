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
public class ConjuntoLibro {
    //Asociacion
    private Libro[] coleccion;
    
    public ConjuntoLibro(){
      this.coleccion = new Libro[4];
    }
    
    public boolean anadirLibro(Libro libro){
        for (int i = 0; i <this.coleccion.length; i++) {
            if(this.coleccion[i]==null){
                this.coleccion[i]=libro;
                return true;
            }
        }
        return false;
    }
    
    public Libro[] obtenerTodosLibros(){
       return this.coleccion;
    }
      
    public boolean eliminarxAutor(String autor){
        
      return false;
    }
    public boolean eliminarxTitulo(String titulo){
      return false;
    }
    public Libro obtenerMejorCalificador(){
      return null;
    }
    public Libro obtenerPeorCalificado(){
      return null;
    }
    
  
}
