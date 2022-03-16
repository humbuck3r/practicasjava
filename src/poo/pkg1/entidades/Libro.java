/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.pkg1.entidades;

/**
 *
 * @author humbucker
 */
public class Libro {

    public String ISBN;
    public String Titulo;
    public String Autor;
    public String Paginas;

    String pedirdatos;
    
    //constructor
    
    public  Libro(){};
    
    public  Libro(String ISBN,String Titulo,String Autor,String Paginas){
        
            this.Autor = Autor;
            this.ISBN = ISBN;
            this.Paginas = Paginas;
            this.Titulo = Titulo;
        
    };
    
    
    //metodos 
     public void  pedirdatos( String ISBN,String Titulo,String Autor,String Paginas){
    
        
        
    };
}
