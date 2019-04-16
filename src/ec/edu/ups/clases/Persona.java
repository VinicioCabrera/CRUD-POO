/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import java.util.Date;

/**
* @version 2.0
 * @since 2019
 * @author Vinicio campoverde
 * @see http://ups.edu.ec
 */
public class Persona {
 private  String nombre;
 private String cargo;
 private String Apellido;
 private int  edad; 

    public Persona() {
    }
 

    public Persona(String nombre, String cargo) {
        this.nombre = nombre;
        this.cargo = cargo;
    }

    public Persona(String nombre, String cargo, String Apellido, int edad) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.Apellido = Apellido;
        this.edad = edad;
    }
 

    public String getNombre() {
        return nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public String getApellido() {
        return Apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", cargo=" + cargo + ", Apellido=" + Apellido + ", edad=" + edad + '}';
    }
 
 
}
