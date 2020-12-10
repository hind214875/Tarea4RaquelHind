/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea4RaquelHind;

/**
 *
 * @author Hind
 */
public class Escuela {

    private String nombre;
    private String direccion;

    //Constructor por defecto
    public Escuela() {
       
    }

    //Constructor parametrizado
    public Escuela(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    //metodo ToString

    @Override
    public String toString() {
        return "Escuela{" + "nombre=" + nombre + ", direccion=" + direccion + '}';
    }
    
}
