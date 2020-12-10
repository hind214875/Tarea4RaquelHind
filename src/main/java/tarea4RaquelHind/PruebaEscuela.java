/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea4RaquelHind;

/**
 *
 * @author raquel
 */
public class PruebaEscuela {
    
    public static void main(String[] args) {
        
        //Creacion de objetos
        Escuela escuela1 = new Escuela("CEIP San Pedro de Alcantara","Calle Caravaca, 1");
        
        Escuela escuela2 = new Escuela("Colegio Fuente Nueva", "Calle Amor, 2");
        
        //Impresion por consola
        System.out.println(escuela1.toString());
        
        System.out.println(escuela2.toString());
        
    }
    
}
