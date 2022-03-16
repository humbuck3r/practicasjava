/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo.pkg1;

import java.util.Scanner;
import poo.pkg1.entidades.Libro;

/**
 *
 * @author humbucker
 */
public class Poo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);   
        
         
         System.out.println("ingresa los datos del libro ..autor,ISBN,paginas,titulo");
         Libro li1 = new Libro( sc.next(), sc.next(), sc.next(), sc.next());
        
            System.out.println(li1.Autor+li1.ISBN+li1.Paginas+li1.Titulo);
        
        
        
         
         
       
        
         
        
        
//        public String ISBN;
//    public String Titulo;
//    public String Autor;
//    public String Paginas;
        
        
    }

}
